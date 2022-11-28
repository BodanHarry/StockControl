/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularies;

import data.TblCategory;
import data.TblInput;
import javax.swing.JPanel;
import data.TblProduct;
import data.TblUser;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Input;
import models.Product;
import models.User;
import models.Category;

/**
 *
 * @author hebod
 */
public class FrmInput extends javax.swing.JFrame {
    
    DefaultComboBoxModel comboProduct = new DefaultComboBoxModel();
    DefaultComboBoxModel comboUser = new DefaultComboBoxModel();
    
    private TblProduct dProduct = new TblProduct();
    private TblUser dUser = new TblUser();
    private TblInput dInput = new TblInput();
    private TblCategory dCategory = new TblCategory();
            
    private ArrayList<Product> productList = new ArrayList<>();
    private ArrayList<User> userList = new ArrayList<>();
    private ArrayList<Input> inputList = new ArrayList<>();
    
    private int idProduct;
    private int idInput;
    private int userName;
    
    TableRowSorter trsFiltro;
    
    LocalDate now = LocalDate.now();
    String nowString = String.valueOf(now);
    
    /**
     * Creates new form FrmInput
     */
    public FrmInput() {
        initComponents();
        
        JTBP.setBorder(BorderFactory.createEmptyBorder());
        this.dataPanel.setBorder(BorderFactory.createEmptyBorder());
        this.RegPanel.setBorder(BorderFactory.createEmptyBorder());
        jTblReg.setBorder(BorderFactory.createEmptyBorder());
        this.fillComboBoxProduct();
        this.fillComboBoxUser();
        this.fillTable();
        this.jTFDate.setText(nowString);
    }
    
    private void fillUserList(){
        if (!userList.isEmpty()) {
            userList.clear();
        }
        userList = dUser.listaUser();
    }
    
    private void fillInputList(){
        if (!inputList.isEmpty()) {
            inputList.clear();
        }
        inputList = dInput.inputList();
    
    }
    
    private void fillProductList() {
        if (!productList.isEmpty()) {
            productList.clear();
        }
        productList = dProduct.listProduct();
    }
    
    public void clear() {
        this.jTFDate.setText(nowString);
        this.jTfInputPrice.setText("");
        this.jTfInputQuantity.setText("");
        this.jTxtID.setText("");
        BtnGuardar.setEnabled(true);
        BtnEliminar.setEnabled(false);
    }
    
    private void fillComboBoxProduct(){
        fillProductList();
  
        for (Product product : productList) {
            comboProduct.addElement(product.getProductName() + " " + product.getM_Category().getProductType() + " " + product.getM_Category().getProductSize() + " " + product.getProductColor());
        }
        
        this.jComboBoxProduct.setModel(comboProduct);
    }
    
    private void fillComboBoxUser(){
       fillUserList();
       for (User user : userList) {
            comboUser.addElement(user.getUserName());
        }
        
        this.jComboBoxUser.setModel(comboUser);
    }
    
    private void setCombo(String name, DefaultComboBoxModel combo){    
        for(int i = 0; i < combo.getSize(); i++){
            if(name.equals(String.valueOf(combo.getElementAt(i)))){
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
        for (Input input : inputList) {
            String user = input.getM_User().getUserName();
            String product = input.getM_Product().getProductName();
            Object[] row = new Object[]{
                input.getInputDate(),
                input.getInputPrice(),
                input.getInputQuantity(),
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
        this.jTfInputPrice.setText(String.valueOf(inputList.get(row).getInputPrice()));
        this.jTxtID.setText(String.valueOf(inputList.get(row).getIdInput()));
        this.jTfInputQuantity.setText(String.valueOf(inputList.get(row).getInputQuantity()));
        idInput = inputList.get(row).getIdInput();
        String actualProduct = inputList.get(row).getM_Product().getProductName() + " " + inputList.get(row).getM_Product().getM_Category().getProductType() + " " + inputList.get(row).getM_Product().getM_Category().getProductSize() + " " + inputList.get(row).getM_Product().getProductColor();
        this.setCombo(actualProduct, comboProduct);
        String actualUser = inputList.get(row).getM_User().getUserName();
        this.setCombo(actualUser, comboUser);
        this.JTBP.setSelectedIndex(0);
        BtnGuardar.setEnabled(true);
        BtnEliminar.setEnabled(true);
        jTfInputQuantity.requestFocus();
    }
    
    private void verificarDatosVacios() {
            if (jTfInputQuantity.getText().equals("") || jTfInputQuantity.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que la cantidad"
                    + "no este vacía.", "Tipo", JOptionPane.WARNING_MESSAGE);
            jTfInputQuantity.requestFocus();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMainPanelinput = new javax.swing.JPanel();
        JTBP = new javax.swing.JTabbedPane();
        dataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFDate = new javax.swing.JTextField();
        jTfInputQuantity = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBoxUser = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jTxtID = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxProduct = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jTfInputPrice = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        RegPanel = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblReg = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 520));
        setSize(new java.awt.Dimension(880, 520));

        jMainPanelinput.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelinput.setForeground(new java.awt.Color(255, 255, 255));
        jMainPanelinput.setMaximumSize(new java.awt.Dimension(880, 520));
        jMainPanelinput.setMinimumSize(new java.awt.Dimension(880, 520));
        jMainPanelinput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataPanel.setBackground(new java.awt.Color(255, 255, 255));
        dataPanel.setForeground(new java.awt.Color(153, 153, 153));
        dataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");
        jLabel1.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 90, 40));

        jLabel2.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLabel2.setText("INGRESE LOS DATOS DE ENTRADA");
        jLabel2.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 450, 60));

        jLabel3.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLabel3.setText("Fecha: ");
        jLabel3.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 80, 40));

        jLabel5.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad:");
        jLabel5.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel5.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 80, 40));

        jTFDate.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTFDate.setBorder(null);
        jTFDate.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTFDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 450, 30));

        jTfInputQuantity.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfInputQuantity.setBorder(null);
        jTfInputQuantity.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTfInputQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 450, 30));

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
        BtnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BtnGuardarKeyTyped(evt);
            }
        });
        dataPanel.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 130, 40));

        BtnNuevo.setBackground(new java.awt.Color(0, 153, 153));
        BtnNuevo.setFont(new java.awt.Font("Inter Black", 0, 15)); // NOI18N
        BtnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo.setText("Nuevo Producto");
        BtnNuevo.setBorder(null);
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        dataPanel.add(BtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, 40));

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
        dataPanel.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 130, 40));

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

        jLabel7.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLabel7.setText("Producto:");
        jLabel7.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel7.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 80, 40));

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

        jLabel8.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLabel8.setText("Monto productos:");
        jLabel8.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel8.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 140, 30));

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

        jLabel6.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLabel6.setText("Buscar: ");
        jLabel6.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(500, 15));

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

        javax.swing.GroupLayout RegPanelLayout = new javax.swing.GroupLayout(RegPanel);
        RegPanel.setLayout(RegPanelLayout);
        RegPanelLayout.setHorizontalGroup(
            RegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(RegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        RegPanelLayout.setVerticalGroup(
            RegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(RegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JTBP.addTab("Registro", RegPanel);

        jMainPanelinput.add(JTBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        try {
            User user = dUser.getUser(String.valueOf(comboUser.getSelectedItem()));
            Product product = dProduct.getProductByName(String.valueOf(comboProduct.getSelectedItem()));
            System.out.println(user);
            System.out.println(product);
            
            Input input = new Input(
                    0,
                    this.jTFDate.getText(),
                    Integer.parseInt(this.jTfInputQuantity.getText()) * product.getProductPrice(),
                    Integer.parseInt(this.jTfInputQuantity.getText()),
                    product,
                    user
            
            );
            
            if(dInput.addInput(input)){
                JOptionPane.showMessageDialog(this, "Registro guardado", "Entrada", JOptionPane.INFORMATION_MESSAGE);
            }else{
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
            "Entrada", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (resp == 0){
            if(dInput.removeInput(idInput)){
                JOptionPane.showMessageDialog(this, "Entrada eliminada", "Entrada" , JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error al eliminar ", "Entradar", JOptionPane.WARNING_MESSAGE);
            }
        }
        this.clear();
        fillTable();
    }//GEN-LAST:event_BtnEliminarActionPerformed

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

    private void BtnGuardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnGuardarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarKeyTyped
    
    public JPanel getFondo() {
        return jMainPanelinput;
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
            java.util.logging.Logger.getLogger(FrmInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JTabbedPane JTBP;
    private javax.swing.JPanel RegPanel;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JComboBox<String> jComboBoxProduct;
    private javax.swing.JComboBox<String> jComboBoxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jMainPanelinput;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTextField jTFDate;
    private javax.swing.JTable jTblReg;
    private javax.swing.JLabel jTfInputPrice;
    private javax.swing.JTextField jTfInputQuantity;
    private javax.swing.JLabel jTxtID;
    // End of variables declaration//GEN-END:variables
}
