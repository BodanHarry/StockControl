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
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class TblOutput {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public void getOutput() throws SQLException {
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

    public ArrayList<Output> outputList() {
        ArrayList<Output> list = new ArrayList<>();
        try {
            this.getOutput();
            while (rs.next()) {
                list.add(new Output(
                        rs.getInt("idOutput"),
                        rs.getDate("outputDate"),
                        rs.getDouble("outputPrice"),
                        rs.getInt("outputQuantity")
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

    public boolean searchOutput(int id) {
        boolean resp = false;
        this.getOutput();
        try {
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getInt("idOutput") == id) {
                    resp = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar la salidad: " + ex.getMessage());
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
        return resp;
    }
    public boolean editOutput(Output a){
        boolean resp = false; 
        this.getOutput();
        try {
            rs.beforeFirst();
            while (rs.next()){
                if (rs.getInt("idOutput") == a.getIdOutput()){
                    rs.updateDate("outputDate", a.getOutputDate());
                    rs.updateDouble("outputPrice",  a.getOutputPrice());
                    rs.updateInt("outputQuantity", a.getOutputQuantity());
                    
                }
            }
        }
    }
}
