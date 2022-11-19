/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Category;
import models.Product;

/**
 *
 * @author hebod
 */
public class TblProduct {

    private Connection conn = null;
    private static ResultSet rs = null;
    private static PreparedStatement ps = null;

    public void getReg() throws SQLException {
        try {
            conn = Conexion.getConnection();
            String tSQL = "Select * from Product";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
                    + ResultSet.HOLD_CURSORS_OVER_COMMIT
            );
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error al obtener registros" + ex.getMessage());
        }
    }

    public ArrayList<Product> productList() {
        ArrayList<Product> list = new ArrayList<>();
        TblCategory categories = new TblCategory();
        Category category;
        try {
            this.getReg();
            while (rs.next()) {
                int idCategory = Integer.parseInt(rs.getString("CategoryID"));
                category = categories.getCategory(idCategory);
                list.add(new Product(
                        rs.getString("Productname"),
                        rs.getString("Productcolor"),
                        Integer.parseInt(rs.getString("ProductID")),
                        Double.parseDouble(rs.getString("")),
                        category
                )
                );
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar el producto: " + ex.getMessage());
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

    public boolean addProduct(Product product, Category category) {
        boolean saved = false;
        try {
            this.getReg();
            rs.moveToInsertRow();
            rs.updateString("Productname", product.getProductName());
            rs.updateString("Productcolor", product.getProductColor());
            rs.updateString("productPrice", String.valueOf(product.getProductPrice()));
            rs.updateString("CategoryID", String.valueOf(category.getIdCategory()));
            rs.insertRow();
            rs.moveToCurrentRow();
        } catch (SQLException ex) {
            System.out.println("Error al guardar el producto" + ex.getMessage());
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

    public boolean existProduct(int idProduct) {
        boolean result = false;
        try {
            this.getReg();
            while (rs.next()) {
                if (Integer.parseInt(rs.getString("ProductID")) == idProduct) {
                    result = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar el producto: " + ex.getMessage());
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
        return result;
    }

    public boolean editProduct(Product product, Category category) {
        boolean result = false;
        try {
            this.getReg();
            rs.beforeFirst();
            while (rs.next()) {
                if (Integer.parseInt(rs.getString("ProducID")) == product.getIdProduct()) {
                    rs.updateString("Productname", product.getProductName());
                    rs.updateString("Productcolor", product.getProductColor());
                    rs.updateString("Productprice", String.valueOf(product.getProductPrice()));
                    rs.updateString("CategoryID", String.valueOf(category.getIdCategory()));
                    rs.updateRow();
                    result = true;
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

        return result;
    }

    public boolean removeProduct(int idProduct) {
        boolean result = false;
        try {
            this.getReg();
            rs.beforeFirst();
            while (rs.next()) {
                if (Integer.parseInt(rs.getString("ProductID")) == idProduct) {
                    rs.deleteRow();
                    result = true;
                    break;
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error al eliminar Producto: " + ex.getMessage());
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
        return result;
    }
    
    public Product getProduct(int idProduct) {
        Product product =  new Product();
        TblCategory category = new TblCategory();
        try {
            this.getReg();
            while (rs.next()) {
                if (Integer.parseInt(rs.getString("CategoryID")) == idProduct) {
                    product = new Product(
                            rs.getString("Productname"),
                            rs.getString("Productcolor"),
                            Integer.parseInt(rs.getString("ProductID")),
                            Double.parseDouble(rs.getString("Productprice")),
                            category.getCategory(Integer.parseInt(rs.getString("CategoryID")))
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
        return product;
    }
}
