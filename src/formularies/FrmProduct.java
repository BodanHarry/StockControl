package formularies;

import data.TblCategory;
import data.TblMode;
import data.TblProduct;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Category;
import models.Product;

public class FrmProduct extends javax.swing.JFrame {

    DefaultComboBoxModel combo = new DefaultComboBoxModel();
    private final TblProduct dProduct = new TblProduct();
    private ArrayList<Product> productList = new ArrayList<>();
    private final TblCategory dCategory = new TblCategory();
    private ArrayList<Category> categoryList = new ArrayList<>();
    int idCategory;
    private final TblMode dMode = new TblMode();
    private int idProduct;
    TableRowSorter trsFiltro;

    Color principalColor;
    Color foregroundColor;

    public FrmProduct() {
        initComponents();
        JTBP.setBorder(BorderFactory.createEmptyBorder());
        this.dataPanel.setBorder(BorderFactory.createEmptyBorder());
        this.regPanel.setBorder(BorderFactory.createEmptyBorder());
        jTblReg.setBorder(BorderFactory.createEmptyBorder());
        this.fillComboBox();
        this.fillTable();

        if (dMode.identifier() == 0) {
            principalColor = new Color(255, 255, 255);
            foregroundColor = new Color(32, 32, 34);
        } else {
            principalColor = new Color(32, 32, 34);
            foregroundColor = new Color(255, 255, 255);
        }

        JTBP.setBackground(principalColor);
        dataPanel.setBackground(principalColor);
        regPanel.setBackground(principalColor);
        jLbPrincipal.setForeground(foregroundColor);
        jLbSearch.setForeground(foregroundColor);
        jLbPrincipal.setForeground(foregroundColor);
        jLbProductName.setForeground(foregroundColor);
        jLbProductColor.setForeground(foregroundColor);
        jLbProductPrice.setForeground(foregroundColor);
        jLbProductCategory.setForeground(foregroundColor);
        jLbProductQuantity.setForeground(foregroundColor);
        jTfProductName.setBackground(principalColor);
        jTfProductName.setForeground(foregroundColor);
        jTfProductColor.setBackground(principalColor);
        jTfProductColor.setForeground(foregroundColor);
        jTfProductPrice.setBackground(principalColor);
        jTfProductPrice.setForeground(foregroundColor);
        jTfProductQuantity.setBackground(principalColor);
        jTfProductQuantity.setForeground(foregroundColor);

    }

    public void clear() {
        this.jTfProductName.setText("");
        this.jTfProductColor.setText("");
        this.jTfProductQuantity.setText("");
        this.jTfProductPrice.setText("");
        this.jTxtID.setText("");
        BtnGuardar.setEnabled(true);
        BtnEditar.setEnabled(false);
        BtnEliminar.setEnabled(false);
    }

    private void fillCategoryList() {
        if (!categoryList.isEmpty()) {
            categoryList.clear();
        }
        categoryList = dCategory.categoryList();
    }

    private void fillComboBox() {
        fillCategoryList();

        for (Category category : categoryList) {
            combo.addElement(category.getProductType() + " " + category.getProductSize());
        }

        this.jComboBoxCategories.setModel(combo);
    }

    private void setCombo(String name) {
        for (int i = 0; i < combo.getSize(); i++) {
            if (name.equals(String.valueOf(combo.getElementAt(i)))) {
                combo.setSelectedItem(name);
            }
        }

    }

    private void fillProductList() {
        if (!productList.isEmpty()) {
            productList.clear();
        }
        productList = dProduct.listProduct();
    }

    private void fillTable() {
        fillProductList();
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "Producto", "Color", "Precio", "Categoría", "Cantidad"};
        dtm.setColumnIdentifiers(titulos);
        for (Product product : productList) {
            String categories = product.getM_Category().getProductType() + " " + product.getM_Category().getProductSize();
            Object[] row = new Object[]{
                String.valueOf(product.getIdProduct()),
                product.getProductName(),
                product.getProductColor(),
                String.valueOf(product.getProductPrice()),
                categories,
                product.getProductQuantity()
            };
            dtm.addRow(row);
        }
        this.jTblReg.setModel(dtm);
    }

    private void filtrarTabla() {
        trsFiltro.setRowFilter(RowFilter.regexFilter(this.jTFBuscar.getText(), 0));

    }

    private void foundData() {
        int row = this.jTblReg.getSelectedRow();
        idCategory = productList.get(row).getM_Category().getIdCategory();
        idProduct = productList.get(row).getIdProduct();
        this.jTfProductName.setText(productList.get(row).getProductName());
        this.jTfProductColor.setText(productList.get(row).getProductColor());
        this.jTfProductQuantity.setText(String.valueOf(productList.get(row).getProductQuantity()));
        this.jTxtID.setText(String.valueOf(idProduct));
        this.jTfProductPrice.setText(String.valueOf(productList.get(row).getProductPrice()));
        String actualCategory = productList.get(row).getM_Category().getProductType() + " " + productList.get(row).getM_Category().getProductSize();
        this.setCombo(actualCategory);
        this.JTBP.setSelectedIndex(0);
        BtnGuardar.setEnabled(true);
        BtnEditar.setEnabled(true);
        BtnEliminar.setEnabled(true);
        jTfProductName.requestFocus();
    }

    private void verificarDatosVacios() {
        if (jTfProductName.getText().equals("") || jTfProductName.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que el Nombre"
                    + "no este vacío.", "Tipo", JOptionPane.WARNING_MESSAGE);
            jTfProductName.requestFocus();
        }
        if (jTfProductColor.getText().equals("") || jTfProductColor.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que el Color "
                    + "no este vacía.", "Descripción", JOptionPane.WARNING_MESSAGE);
            jTfProductColor.requestFocus();
        }
        if (jTfProductQuantity.getText().equals("") || jTfProductQuantity.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que el precio "
                    + "no este vacío.", "Tamaño", JOptionPane.WARNING_MESSAGE);
            jTfProductQuantity.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanelProducts = new javax.swing.JPanel();
        JTBP = new javax.swing.JTabbedPane();
        dataPanel = new javax.swing.JPanel();
        jLbProductQuantity = new javax.swing.JLabel();
        jLbPrincipal = new javax.swing.JLabel();
        jLbProductName = new javax.swing.JLabel();
        jLbProductColor = new javax.swing.JLabel();
        jLbProductPrice = new javax.swing.JLabel();
        jTfProductName = new javax.swing.JTextField();
        jTfProductColor = new javax.swing.JTextField();
        jTfProductQuantity = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBoxCategories = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jTxtID = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLbProductCategory = new javax.swing.JLabel();
        jTfProductPrice = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        regPanel = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jLbSearch = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblReg = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 520));
        setSize(new java.awt.Dimension(880, 520));

        jMainPanelProducts.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelProducts.setForeground(new java.awt.Color(255, 255, 255));
        jMainPanelProducts.setMaximumSize(new java.awt.Dimension(880, 520));
        jMainPanelProducts.setMinimumSize(new java.awt.Dimension(880, 520));
        jMainPanelProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTBP.setBackground(new java.awt.Color(0, 147, 147));
        JTBP.setForeground(new java.awt.Color(255, 255, 255));
        JTBP.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        JTBP.setPreferredSize(new java.awt.Dimension(425, 425));
        JTBP.setVerifyInputWhenFocusTarget(false);

        dataPanel.setBackground(new java.awt.Color(255, 255, 255));
        dataPanel.setForeground(new java.awt.Color(153, 153, 153));
        dataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbProductQuantity.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbProductQuantity.setText("Cantidad:");
        jLbProductQuantity.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbProductQuantity.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbProductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 120, 40));

        jLbPrincipal.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLbPrincipal.setText("INGRESE LOS DATOS DEL PRODUCTO");
        jLbPrincipal.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbPrincipal.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 450, 60));

        jLbProductName.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbProductName.setText("Nombre: ");
        jLbProductName.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbProductName.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 100, 40));

        jLbProductColor.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbProductColor.setText("Color:");
        jLbProductColor.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbProductColor.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbProductColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 160, 80, 40));

        jLbProductPrice.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbProductPrice.setText("Precio:");
        jLbProductPrice.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbProductPrice.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 90, 40));

        jTfProductName.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfProductName.setBorder(null);
        jTfProductName.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTfProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 450, 30));

        jTfProductColor.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfProductColor.setBorder(null);
        jTfProductColor.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTfProductColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 450, 30));

        jTfProductQuantity.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfProductQuantity.setBorder(null);
        jTfProductQuantity.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTfProductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 450, 30));

        BtnGuardar.setBackground(new java.awt.Color(0, 153, 153));
        BtnGuardar.setFont(new java.awt.Font("Inter Black", 0, 15)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setText("Guardar");
        BtnGuardar.setBorder(null);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        dataPanel.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 130, 40));

        BtnNuevo.setBackground(new java.awt.Color(0, 153, 153));
        BtnNuevo.setFont(new java.awt.Font("Inter Black", 0, 15)); // NOI18N
        BtnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo.setText("Nuevo");
        BtnNuevo.setBorder(null);
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        dataPanel.add(BtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 130, 40));

        BtnEliminar.setBackground(new java.awt.Color(0, 153, 153));
        BtnEliminar.setFont(new java.awt.Font("Inter Black", 0, 15)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setBorder(null);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        dataPanel.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 130, 40));

        BtnEditar.setBackground(new java.awt.Color(0, 153, 153));
        BtnEditar.setFont(new java.awt.Font("Inter Black", 0, 15)); // NOI18N
        BtnEditar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditar.setText("Editar");
        BtnEditar.setBorder(null);
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });
        dataPanel.add(BtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 130, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator1.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 450, 20));
        dataPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator3.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 450, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator4.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 450, 20));

        dataPanel.add(jComboBoxCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 450, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 147, 147)));

        jTxtID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTxtID, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTxtID, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        dataPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 80, 30));
        dataPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 80, 10));

        jLbProductCategory.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbProductCategory.setText("Categoría:");
        jLbProductCategory.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbProductCategory.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbProductCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 120, 40));

        jTfProductPrice.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfProductPrice.setBorder(null);
        jTfProductPrice.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTfProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 450, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator6.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 450, 20));

        JTBP.addTab("Datos", dataPanel);

        regPanel.setBackground(new java.awt.Color(255, 255, 255));
        regPanel.setForeground(new java.awt.Color(51, 51, 51));
        regPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTFBuscar.setBackground(new java.awt.Color(0, 153, 153));
        jTFBuscar.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTFBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jTFBuscar.setBorder(null);
        jTFBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        jTFBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscarKeyTyped(evt);
            }
        });
        regPanel.add(jTFBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 450, 30));

        jLbSearch.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbSearch.setText("Buscar: ");
        jLbSearch.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbSearch.setMinimumSize(new java.awt.Dimension(500, 15));
        regPanel.add(jLbSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, 40));

        jPanel1.setBackground(new java.awt.Color(184, 180, 164));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTblReg.setBackground(new java.awt.Color(0, 102, 102));
        jTblReg.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        jTblReg.setForeground(new java.awt.Color(255, 255, 255));
        jTblReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTblReg.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jTblReg.setGridColor(new java.awt.Color(0, 102, 102));
        jTblReg.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jTblReg.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTblReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblRegMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTblReg);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 880, 460));

        regPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 900, 460));

        JTBP.addTab("Registro", regPanel);

        jMainPanelProducts.add(JTBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 1200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        try {
            String categoryName = String.valueOf(combo.getSelectedItem());
            Category productCategory = dCategory.findCategoryByName(categoryName);
            Product product = new Product(this.jTfProductName.getText(), this.jTfProductColor.getText(),
                     0, Double.parseDouble(this.jTfProductQuantity.getText()), productCategory, Integer.parseInt(jTfProductQuantity.getText()));
            
            if (dProduct.addProduct(product)) {
                JOptionPane.showMessageDialog(this, "Registro Guardado",
                        "Producto", JOptionPane.INFORMATION_MESSAGE);
                this.fillTable();
                this.JTBP.setSelectedIndex(1);
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar");
            }
        } catch (HeadlessException es) {
            System.out.println("Error al intentar guardar" + es.getMessage());
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
        clear();
        this.JTBP.setSelectedIndex(0);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        int resp = JOptionPane.showConfirmDialog(this, "Desea eliminar este registro? ",
                "Producto", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {

            if (dProduct.removeProduct(idProduct)) {
                JOptionPane.showMessageDialog(this, "Registro eliminado", "Autor", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar ", "Autor", JOptionPane.WARNING_MESSAGE);
            }
        }
        this.clear();
        fillTable();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        Category editableCategory = dCategory.findCategoryByName(String.valueOf(combo.getSelectedItem()));
        Product editableProduct = new Product(this.jTfProductName.getText(), this.jTfProductColor.getText(), idProduct,
                Double.parseDouble(this.jTfProductPrice.getText()), editableCategory, Integer.parseInt(jTfProductQuantity.getText()));
        System.out.println(editableProduct);
        if (dProduct.editProduct(editableProduct)) {
            JOptionPane.showMessageDialog(this, "Registro editado");
        } else {
            JOptionPane.showMessageDialog(this, "Error al editar el registro");
        }
        fillTable();
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void jTFBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscarKeyReleased
        // TODO add your handling code here:
        filtrarTabla();
        trsFiltro = new TableRowSorter(jTblReg.getModel());
        jTblReg.setRowSorter(trsFiltro);
    }//GEN-LAST:event_jTFBuscarKeyReleased

    private void jTFBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscarKeyTyped
        // TODO add your handling code here:
        this.jTFBuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                filtrarTabla();
            }
        });
        trsFiltro = new TableRowSorter(this.jTblReg.getModel());
        jTblReg.setRowSorter(trsFiltro);
    }//GEN-LAST:event_jTFBuscarKeyTyped

    private void jTblRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblRegMouseClicked
        // TODO add your handling code here:
        jTblReg.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent click) {
                if (click.getClickCount() == 2) {
                    foundData();
                }
            }
        });
    }//GEN-LAST:event_jTblRegMouseClicked

    public JPanel getFondo() {
        return jMainPanelProducts;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JTabbedPane JTBP;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JComboBox<String> jComboBoxCategories;
    private javax.swing.JLabel jLbPrincipal;
    private javax.swing.JLabel jLbProductCategory;
    private javax.swing.JLabel jLbProductColor;
    private javax.swing.JLabel jLbProductName;
    private javax.swing.JLabel jLbProductPrice;
    private javax.swing.JLabel jLbProductQuantity;
    private javax.swing.JLabel jLbSearch;
    private javax.swing.JPanel jMainPanelProducts;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTable jTblReg;
    private javax.swing.JTextField jTfProductColor;
    private javax.swing.JTextField jTfProductName;
    private javax.swing.JTextField jTfProductPrice;
    private javax.swing.JTextField jTfProductQuantity;
    private javax.swing.JLabel jTxtID;
    private javax.swing.JPanel regPanel;
    // End of variables declaration//GEN-END:variables
}
