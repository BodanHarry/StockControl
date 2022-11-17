/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import modelos.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bradl
 */
public class TblUser {

    private Connection conn = null;
    private static ResultSet rs = null;
    private static PreparedStatement ps = null;

    public void getReg() throws SQLException {
        try {
            conn = Conexion.getConnection();
            String tSQL = "Selec * from Autor";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
                    + ResultSet.HOLD_CURSORS_OVER_COMMIT
            );
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error al obtener registros" + ex.getMessage());
        }
    }

    public ArrayList<User> listaAutor() {
        ArrayList<User> lista = new ArrayList<>();
        try {
            this.getReg();
            while (rs.next()) {
                lista.add(new User(
                        rs.getString("Username"),
                        rs.getString("Useremail"),
                        rs.getString("Userpassword")
                ));
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar el autor: " + ex.getMessage());
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

        return lista;

    }

    public boolean addUser(User user) {
        boolean guardado = false;
        try {
            this.getReg();
            rs.moveToInsertRow();
            rs.updateString("Username", user.getUserName());
            rs.updateString("Useremail", user.getUserEmail());
            rs.updateString("Userpassword", user.getUserPassword());
            rs.insertRow();
            rs.moveToCurrentRow();
        } catch (SQLException ex) {
            System.out.println("Error al guardar autor" + ex.getMessage());
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
        return guardado;
    }

    public boolean exist(String username) {
        boolean resp = false;
        try {
            this.getReg();
            while (rs.next()) {
                if (rs.getString("Username") == username) {
                    resp = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar autor: " + ex.getMessage());
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
        return resp;
    }

    public boolean editUser(User user) {
        boolean resp = false;
        try {
            this.getReg();
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getString("Username") == user.getUserName()) {
                    rs.updateString("Useremail", user.getUserEmail());
                    rs.updateString("Username", user.getUserName());
                    rs.updateString("Userpassword", user.getUserPassword());
                    rs.updateRow();
                    resp = true;
                    break;

                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al editar: " + ex.getMessage());
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

        return resp;
    }

    public boolean removeUser(String username) {
        boolean resp = false;
        try {
            this.getReg();
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getString("Username") == username) {
                    rs.deleteRow();
                    resp = true;
                    break;
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error al eliminar autor: " + ex.getMessage());
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
        return resp;
    }
}
