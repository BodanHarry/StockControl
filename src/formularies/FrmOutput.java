package formularies;

import data.TblMode;
import data.TblOutput;
import data.TblProduct;
import data.TblUser;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Output;
import models.Product;
import models.User;

public class FrmOutput extends javax.swing.JFrame {

    Color principalColor;
    Color foregroundColor;

    DefaultComboBoxModel comboProduct = new DefaultComboBoxModel();
    DefaultComboBoxModel comboUser = new DefaultComboBoxModel();

    private final TblProduct dProduct = new TblProduct();
    private final TblUser dUser = new TblUser();
    private final TblOutput dOutput = new TblOutput();
    private final TblMode dMode = new TblMode();

    private ArrayList<Product> productList = new ArrayList<>();
    private ArrayList<User> userList = new ArrayList<>();
    private ArrayList<Output> outputList = new ArrayList<>();

    private int idOutput;

    TableRowSorter trsFiltro;

    LocalDate now = LocalDate.now();
    String nowString = String.valueOf(now);

    public FrmOutput() {
        initComponents();
        this.fillComboBoxProduct();
        this.fillComboBoxUser();
        this.fillTable();
        this.jTfDate.setText(nowString);

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
        jLbDate.setForeground(foregroundColor);
        jLbAmount.setForeground(foregroundColor);
        jLbQuantity.setForeground(foregroundColor);
        jLbProduct.setForeground(foregroundColor);
        jLbUser.setForeground(foregroundColor);
        jTfInputPrice.setBackground(principalColor);
        jTfInputPrice.setForeground(foregroundColor);
        jTfDate.setBackground(principalColor);
        jTfDate.setForeground(foregroundColor);
        jTfOutputQuantity.setBackground(principalColor);
        jTfOutputQuantity.setForeground(foregroundColor);
        jLbSearch.setForeground(foregroundColor);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanelOutput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTBP = new javax.swing.JTabbedPane();
        dataPanel = new javax.swing.JPanel();
        jLbUser = new javax.swing.JLabel();
        jLbPrincipal = new javax.swing.JLabel();
        jLbDate = new javax.swing.JLabel();
        jLbQuantity = new javax.swing.JLabel();
        jTfDate = new javax.swing.JTextField();
        jTfOutputQuantity = new javax.swing.JTextField();
        jBtnSave = new javax.swing.JButton();
        jBtnNew = new javax.swing.JButton();
        jBtnRemove = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBoxUser = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jTxtID = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLbProduct = new javax.swing.JLabel();
        jComboBoxProduct = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jTfInputPrice = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLbAmount = new javax.swing.JLabel();
        regPanel = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jLbSearch = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblReg = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 520));

        jMainPanelOutput.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelOutput.setForeground(new java.awt.Color(255, 255, 255));
        jMainPanelOutput.setMaximumSize(new java.awt.Dimension(880, 520));
        jMainPanelOutput.setMinimumSize(new java.awt.Dimension(880, 520));
        jMainPanelOutput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jMainPanelOutput.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 0, -1));

        dataPanel.setBackground(new java.awt.Color(255, 255, 255));
        dataPanel.setForeground(new java.awt.Color(153, 153, 153));
        dataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbUser.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbUser.setText("Usuario:");
        jLbUser.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbUser.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 70, 40));

        jLbPrincipal.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLbPrincipal.setText("INGRESE LOS DATOS DE SALIDA");
        jLbPrincipal.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbPrincipal.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 450, 60));

        jLbDate.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbDate.setText("Fecha: ");
        jLbDate.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbDate.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 90, 40));

        jLbQuantity.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbQuantity.setText("Cantidad:");
        jLbQuantity.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbQuantity.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 40));

        jTfDate.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfDate.setBorder(null);
        jTfDate.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 450, 30));

        jTfOutputQuantity.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfOutputQuantity.setBorder(null);
        jTfOutputQuantity.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTfOutputQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 450, 30));

        jBtnSave.setBackground(new java.awt.Color(0, 153, 153));
        jBtnSave.setFont(new java.awt.Font("Inter Black", 0, 15)); // NOI18N
        jBtnSave.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSave.setText("Guardar");
        jBtnSave.setBorder(null);
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });
        jBtnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jBtnSaveKeyTyped(evt);
            }
        });
        dataPanel.add(jBtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 130, 40));

        jBtnNew.setBackground(new java.awt.Color(0, 153, 153));
        jBtnNew.setFont(new java.awt.Font("Inter Black", 0, 15)); // NOI18N
        jBtnNew.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNew.setText("Nueva Salida");
        jBtnNew.setBorder(null);
        jBtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewActionPerformed(evt);
            }
        });
        dataPanel.add(jBtnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, 40));

        jBtnRemove.setBackground(new java.awt.Color(0, 153, 153));
        jBtnRemove.setFont(new java.awt.Font("Inter Black", 0, 15)); // NOI18N
        jBtnRemove.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRemove.setText("Eliminar");
        jBtnRemove.setBorder(null);
        jBtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoveActionPerformed(evt);
            }
        });
        dataPanel.add(jBtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 130, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator1.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 450, 20));
        dataPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator4.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 450, 20));

        dataPanel.add(jComboBoxUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 450, 30));

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

        jLbProduct.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbProduct.setText("Producto:");
        jLbProduct.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbProduct.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 80, 40));

        dataPanel.add(jComboBoxProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 450, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator6.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 450, 20));

        jSeparator7.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator7.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 450, 20));

        jTfInputPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dataPanel.add(jTfInputPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 450, 30));

        jSeparator8.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator8.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 450, 20));

        jLbAmount.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbAmount.setText("Monto productos:");
        jLbAmount.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbAmount.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 30));

        JTBP.addTab("Datos", dataPanel);

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

        jLbSearch.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbSearch.setText("Buscar: ");
        jLbSearch.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbSearch.setMinimumSize(new java.awt.Dimension(500, 15));

        jPanel4.setBackground(new java.awt.Color(184, 180, 164));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 430));

        javax.swing.GroupLayout regPanelLayout = new javax.swing.GroupLayout(regPanel);
        regPanel.setLayout(regPanelLayout);
        regPanelLayout.setHorizontalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        regPanelLayout.setVerticalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(regPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JTBP.addTab("Registro", regPanel);

        jMainPanelOutput.add(JTBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fillUserList() {
        if (!userList.isEmpty()) {
            userList.clear();
        }
        userList = dUser.listaUser();
    }

    private void fillInputList() {
        if (!outputList.isEmpty()) {
            outputList.clear();
        }
        outputList = dOutput.outputList();

    }

    private void fillProductList() {
        if (!productList.isEmpty()) {
            productList.clear();
        }
        productList = dProduct.listProduct();
    }

    public void clear() {
        this.jTfDate.setText(nowString);
        this.jTfInputPrice.setText("");
        this.jTfOutputQuantity.setText("");
        this.jTxtID.setText("");
        jBtnSave.setEnabled(true);
        jBtnRemove.setEnabled(false);
    }

    private void fillComboBoxProduct() {
        fillProductList();

        for (Product product : productList) {
            comboProduct.addElement(product.getProductName() + " " + product.getM_Category().getProductType() + " " + product.getM_Category().getProductSize() + " " + product.getProductColor());
        }

        this.jComboBoxProduct.setModel(comboProduct);
    }

    private void fillComboBoxUser() {
        fillUserList();
        for (User user : userList) {
            comboUser.addElement(user.getUserName());
        }

        this.jComboBoxUser.setModel(comboUser);
    }

    private void setCombo(String name, DefaultComboBoxModel combo) {
        for (int i = 0; i < combo.getSize(); i++) {
            if (name.equals(String.valueOf(combo.getElementAt(i)))) {
                combo.setSelectedItem(name);
            }
        }

    }

    private void fillTable() {
        fillInputList();
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"Fecha", "Monto", "Cantidad", "Usuario", "Producto"};
        dtm.setColumnIdentifiers(titulos);
        for (Output output : outputList) {
            String user = output.getM_User().getUserName();
            String product = output.getM_Product().getProductName();
            Object[] row = new Object[]{
                output.getOutputDate(),
                output.getOutputPrice(),
                output.getOutputQuantity(),
                user,
                product

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
        this.jTfInputPrice.setText(String.valueOf(outputList.get(row).getOutputPrice()));
        this.jTxtID.setText(String.valueOf(outputList.get(row).getIdOutput()));
        this.jTfOutputQuantity.setText(String.valueOf(outputList.get(row).getOutputQuantity()));
        idOutput = outputList.get(row).getIdOutput();
        String actualProduct = outputList.get(row).getM_Product().getProductName()
                + " " + outputList.get(row).getM_Product().getM_Category().getProductType()
                + " " + outputList.get(row).getM_Product().getM_Category().getProductSize()
                + " " + outputList.get(row).getM_Product().getProductColor();
        this.setCombo(actualProduct, comboProduct);
        String actualUser = outputList.get(row).getM_User().getUserName();
        this.setCombo(actualUser, comboUser);
        this.JTBP.setSelectedIndex(0);
        jBtnSave.setEnabled(true);
        jBtnRemove.setEnabled(true);
        jTfOutputQuantity.requestFocus();
    }

    private void verificarDatosVacios() {
        if (jTfOutputQuantity.getText().equals("") || jTfOutputQuantity.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que la cantidad"
                    + "no este vacía.", "Tipo", JOptionPane.WARNING_MESSAGE);
            jTfOutputQuantity.requestFocus();
        }
    }

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        try{
            
            User user = dUser.getUser(String.valueOf(comboUser.getSelectedItem()));
            Product product = dProduct.getProductByName(String.valueOf(comboProduct.getSelectedItem()));
            
            if(product.getProductQuantity() - Integer.parseInt(jTfOutputQuantity.getText()) < 0){
                JOptionPane.showMessageDialog(this, "La cantidad no debe ser mayor que la existencia: " + product.getProductQuantity(), "Salida", JOptionPane.INFORMATION_MESSAGE);
                this.clear();
            }else{
                product.setProductQuantity(product.getProductQuantity() - Integer.parseInt(jTfOutputQuantity.getText()));
                dProduct.editProduct(product);

                Output output = new Output(
                    0,
                    this.jTfDate.getText(),
                    Integer.parseInt(this.jTfOutputQuantity.getText()) * product.getProductPrice(),
                    Integer.parseInt(this.jTfOutputQuantity.getText()),
                    product,
                    user
            );

            if (dOutput.addOutput(output)) {
                JOptionPane.showMessageDialog(this, "Registro guardado", "Salida", JOptionPane.INFORMATION_MESSAGE);
                this.fillTable();
                this.JTBP.setSelectedIndex(1);
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar");
            }

            
            }
            
        } catch (HeadlessException es) {
            System.out.println("Error al intentar guardar" + es.getMessage());
        }

    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void jBtnSaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnSaveKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSaveKeyTyped

    private void jBtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewActionPerformed
        // TODO add your handling code here:
        clear();
        this.JTBP.setSelectedIndex(0);
    }//GEN-LAST:event_jBtnNewActionPerformed

    private void jBtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoveActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        int resp = JOptionPane.showConfirmDialog(this, "Desea eliminar este registro? ",
                "Entrada", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {
            if (dOutput.removeOutput(idOutput)) {
                JOptionPane.showMessageDialog(this, "Entrada eliminada", "Salida", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar ", "Salida", JOptionPane.WARNING_MESSAGE);
            }
        }
        this.clear();
        fillTable();
    }//GEN-LAST:event_jBtnRemoveActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public JPanel getFondo() {
        return jMainPanelOutput;
    }

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
            java.util.logging.Logger.getLogger(FrmOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOutput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTBP;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JButton jBtnNew;
    private javax.swing.JButton jBtnRemove;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JComboBox<String> jComboBoxProduct;
    private javax.swing.JComboBox<String> jComboBoxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbAmount;
    private javax.swing.JLabel jLbDate;
    private javax.swing.JLabel jLbPrincipal;
    private javax.swing.JLabel jLbProduct;
    private javax.swing.JLabel jLbQuantity;
    private javax.swing.JLabel jLbSearch;
    private javax.swing.JLabel jLbUser;
    private javax.swing.JPanel jMainPanelOutput;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTable jTblReg;
    private javax.swing.JTextField jTfDate;
    private javax.swing.JLabel jTfInputPrice;
    private javax.swing.JTextField jTfOutputQuantity;
    private javax.swing.JLabel jTxtID;
    private javax.swing.JPanel regPanel;
    // End of variables declaration//GEN-END:variables
}
