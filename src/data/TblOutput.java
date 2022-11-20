/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import models.Output;
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
 * @author Administrador
 */
public class TblOutput {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public void getReg() throws SQLException {
        try {
            conn = Conexion.getConnection();
            String tSQL = "Select * from Output";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
                    + ResultSet.HOLD_CURSORS_OVER_COMMIT
            );
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error al obtener salidas" + ex.getMessage());
        }
    }

    public ArrayList<Output> outputList() throws ParseException {
        ArrayList<Output> list = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
        TblProduct products = new TblProduct();
        Product product;
        TblUser users = new TblUser();
        User user;

        try {
            this.getReg();
            while (rs.next()) {
                Date dataFormat = format.parse(rs.getString("Outputdate"));
                int idProduct = Integer.parseInt(rs.getString("ProductID"));
                product = products.getProduct(idProduct);
                String username = rs.getString("Username");
                user = users.getUser(username);
                list.add(new Output(
                        Integer.parseInt(rs.getString("OutputID")),
                        dataFormat,
                        Double.parseDouble(rs.getString("Outputprice")),
                        Integer.parseInt(rs.getString("Outputquantity")),
                        product,
                        user
                ));
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar las salidas" + ex.getMessage());
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

    public boolean addInput(Output output, Product product, User user) {
        boolean saved = false;
        try {
            this.getReg();
            rs.moveToInsertRow();
            rs.updateString("OutputID", String.valueOf(output.getIdOutput()));
            rs.updateString("Outputdate", String.valueOf(output.getOutputDate()));
            rs.updateString("Outputprice", String.valueOf(output.getOutputPrice()));
            rs.updateString("Outputquantity", String.valueOf(output.getOutputQuantity()));
            rs.updateString("ProductID", String.valueOf(product.getIdProduct()));
            rs.updateString("OutputID", String.valueOf(user.getUserName()));
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
    
    public Output getOutput(int idOutput) throws ParseException {
        Output output =  new Output();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
        TblProduct products = new TblProduct();
        Product product;
        TblUser users = new TblUser();
        User user;
        try {
            this.getReg();
            while (rs.next()) {
                Date dataFormat = format.parse(rs.getString("Outputdate"));
                int idProduct = Integer.parseInt(rs.getString("ProductID"));
                product = products.getProduct(idProduct);
                String username = rs.getString("Username");
                if (Integer.parseInt(rs.getString("OutputID")) == idOutput){
                user = users.getUser(username);
                output = new Output(
                        Integer.parseInt(rs.getString("OutputID")),
                        dataFormat,
                        Double.parseDouble(rs.getString("Outputprice")),
                        Integer.parseInt(rs.getString("Outputquantity")),
                        product,
                        user
                );
                break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar producto: " + ex.getMessage());
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
        return output;
    }
}
