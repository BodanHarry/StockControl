/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
            String tSQL = "Select * from [stockControl].[dbo].[User]";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
                    + ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error al obtener registros" + ex.getMessage());
        }
    }

    public ArrayList<User> listaUser() {
        ArrayList<User> list = new ArrayList<>();
        try {
            this.getReg();
            while (rs.next()) {
                list.add(new User(
                        rs.getString("Username"),
                        rs.getString("Useremail"),
                        rs.getString("Userpassword")
                ));
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar al usuario: " + ex.getMessage());
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

        return list;

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
            guardado = true;
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

    public boolean existUser(String username) {
        boolean resp = false;
        try {
            this.getReg();
            while (rs.next()) {
                if (rs.getString("Username").equals(username)) {
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
                if (rs.getString("Username").equals(user.getUserName())) {
                    rs.updateString("Useremail", user.getUserEmail());
                    rs.updateString("Username", user.getUserName());
                    rs.updateString("Userpassword", user.getUserPassword());
                    rs.updateRow();
                    resp = true;
                    break;

                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al editar al usuario: " + ex.getMessage());
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
                if (rs.getString("Username").equals(username)) {
                    rs.deleteRow();
                    resp = true;
                    break;
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error al eliminar al usuario: " + ex.getMessage());
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

    public User getUser(String username) {
        User user = new User();
        try {
            this.getReg();
            while (rs.next()) {
                if (rs.getString("Username").equals(username)) {
                    user = new User(
                            rs.getString("Username"),
                            rs.getString("Useremail"),
                            rs.getString("Userpassword")
                    );
                    break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar usuario: " + ex.getMessage());
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
        return user;
    }

    public String getUserName(String username) {
        String valor = " ";
        try {

            this.getReg();
            while (rs.next()) {
                if (rs.getString("Username").equals(username)) {
                    valor = rs.getString("Username");
                    
                    break;

                }
            }
            

        } catch (SQLException ex) {
            System.out.println("Error al buscar usuario: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "El correo es invalido ");
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

        return valor;
    }

    public String getUserPassword(String username) {
        String valor = " ";
        try {
            this.getReg();
            while (rs.next()) {
                if (rs.getString("Username").equals(username)) {
                    valor = rs.getString("Userpassword");
                    
                    break;
                } 
                
                
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar usuario: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "La contraseña es invalida ");
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

        return valor;
    }
}
