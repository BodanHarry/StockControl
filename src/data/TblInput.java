/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import models.Input;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import models.Product;
import models.User;
/**
 *
 * @author MSI DRAGON
 */
public class TblInput {
    
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public void getReg() throws SQLException{
        try {
            conn = Conexion.getConnection();
            String tSQL = "Select * from Input";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
                    + ResultSet.HOLD_CURSORS_OVER_COMMIT
            );
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error al obtener entradas" + ex.getMessage());
        }
    
    }
    
    public ArrayList<Input> inputList() throws ParseException{
        ArrayList<Input> list = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
        TblProduct products = new TblProduct();
        Product product;
        TblUser users = new TblUser();
        User user;
        
        try {
            this.getReg();
            while (rs.next()) {
                Date dataFormat = format.parse(rs.getString("Inputdate"));
                int idProduct = Integer.parseInt(rs.getString("ProductID"));
                product = products.getProduct(idProduct);
                String username = rs.getString("Username");
                user = users.getUser(username);
                list.add(new Input(
                        Integer.parseInt(rs.getString("InputID")),
                        dataFormat,
                        Double.parseDouble(rs.getString("Inputprice")),
                        Integer.parseInt(rs.getString("Inputquantity")),
                        product,
                        user
                ));
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar las entradas" + ex.getMessage());
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }

                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    Conexion.closeConexion(conn);

                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return list;   
    }
    
    public boolean addInput(Input input, Product product, User user){
        boolean saved = false;
        try {
            this.getReg();
            rs.moveToInsertRow();
            rs.updateString("InputID", String.valueOf(input.getIdInput()));
            rs.updateString("Inputdate", String.valueOf(input.getInputDate()));
            rs.updateString("Inputprice", String.valueOf(input.getInputPrice()));
            rs.updateString("Inputquantity", String.valueOf(input.getInputQuantity()));
            rs.updateString("ProductID", String.valueOf(product.getIdProduct()));
            rs.updateString("UserID", String.valueOf(user.getUserName()));
            rs.insertRow();
            rs.moveToCurrentRow();
        } catch (SQLException ex) {
            System.out.println("Error al guardar la entrada" + ex.getMessage());
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }

                if (rs != null) {
                    ps.close();
                }

                if (rs != null) {
                    Conexion.closeConexion(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }
        return saved;
    }
    
    public Input getInput(int idInput) throws ParseException{
        Input input = new Input();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
        TblProduct products = new TblProduct();
        Product product;
        TblUser users = new TblUser();
        User user;
        try {
            this.getReg();
            while (rs.next()) {
                Date dataFormat = format.parse(rs.getString("Inputdate"));
                int idProduct = Integer.parseInt(rs.getString("ProductID"));
                product = products.getProduct(idProduct);
                String username = rs.getString("Username");
                if (Integer.parseInt(rs.getString("InputID")) == idInput){
                user = users.getUser(username);
                input = new Input(
                        Integer.parseInt(rs.getString("InputID")),
                        dataFormat,
                        Double.parseDouble(rs.getString("Inputprice")),
                        Integer.parseInt(rs.getString("Inputquantity")),
                        product,
                        user
                );
                break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar entrada: " + ex.getMessage());
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }

                if (rs != null) {
                    ps.close();
                }

                if (rs != null) {
                    Conexion.closeConexion(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }
        return input;
        
    }
}
