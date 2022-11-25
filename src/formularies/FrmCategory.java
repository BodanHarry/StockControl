/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularies;

import data.TblCategory;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Category;

/**
 *
 * @author hebod
 */
public class FrmCategory extends javax.swing.JFrame {

    private int idCategory;
    private TblCategory dCategory = new TblCategory();
    private ArrayList<Category> categoryList = new ArrayList();
    
    TableRowSorter trsFiltro;
    
    public FrmCategory() {
        initComponents();
        JTBP.setBorder(BorderFactory.createEmptyBorder());
        this.dataPanel.setBorder(BorderFactory.createEmptyBorder());
        this.RegPanel.setBorder(BorderFactory.createEmptyBorder());
        jTblReg.setBorder(BorderFactory.createEmptyBorder());
        this.fillTable();
    }

    public void clear() {
        this.jTFProductType.setText("");
        this.jTFProductSize.setText("");
        this.jTFProductDescription.setText("");
        BtnGuardar.setEnabled(true);
        BtnEditar.setEnabled(false);
        BtnEliminar.setEnabled(false);
    }


    private void fillList() {
        if (!categoryList.isEmpty()) {
            categoryList.clear();
        }
        categoryList = dCategory.categoryList();
    }

    private void fillTable() {
        fillList();
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        String titulos[] = {"ID", "Tipo", "Descripción", "Tamaño"};
        dtm.setColumnIdentifiers(titulos);
        for (Category category : categoryList) {
            Object[] row = new Object[]{
                category.getIdCategory(),
                category.getProductType(),
                category.getProductDescription(),
                category.getProductSize()
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
        idCategory = categoryList.get(row).getIdCategory();
        this.jTFProductType.setText(categoryList.get(row).getProductType());
        this.jTFProductDescription.setText(categoryList.get(row).getProductDescription());
        this.jTFProductSize.setText(categoryList.get(row).getProductSize());
        this.JTBP.setSelectedIndex(0);
        BtnGuardar.setEnabled(true);
        BtnEditar.setEnabled(true);
        BtnEliminar.setEnabled(true);
        jTFProductType.requestFocus();
    }

    private void verificarDatosVacios() {
        if (jTFProductType.getText().equals("") || jTFProductType.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que el tipo"
                    + "no este vacío.", "Tipo", JOptionPane.WARNING_MESSAGE);
            jTFProductType.requestFocus();
        }
        if (jTFProductDescription.getText().equals("") || jTFProductDescription.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que la descripción "
                    + "no este vacía.", "Descripción", JOptionPane.WARNING_MESSAGE);
            jTFProductDescription.requestFocus();
        }
        if (jTFProductSize.getText().equals("") || jTFProductSize.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que el tamaño "
                    + "no este vacío.", "Tamaño", JOptionPane.WARNING_MESSAGE);
            jTFProductSize.requestFocus();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jMainPanelCategory = new javax.swing.JPanel();
        JTBP = new javax.swing.JTabbedPane();
        dataPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFProductType = new javax.swing.JTextField();
        jTFProductDescription = new javax.swing.JTextField();
        jTFProductSize = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        RegPanel = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblReg = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 520));
        setSize(new java.awt.Dimension(880, 520));

        jMainPanelCategory.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelCategory.setForeground(new java.awt.Color(255, 255, 255));
        jMainPanelCategory.setMaximumSize(new java.awt.Dimension(880, 520));
        jMainPanelCategory.setMinimumSize(new java.awt.Dimension(880, 520));
        jMainPanelCategory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTBP.setBackground(new java.awt.Color(0, 147, 147));
        JTBP.setForeground(new java.awt.Color(255, 255, 255));
        JTBP.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        JTBP.setPreferredSize(new java.awt.Dimension(425, 425));
        JTBP.setVerifyInputWhenFocusTarget(false);

        dataPanel.setBackground(new java.awt.Color(255, 255, 255));
        dataPanel.setForeground(new java.awt.Color(153, 153, 153));
        dataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INGRESE LOS DATOS DE LA CATEGORÍA");
        jLabel2.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 470, 60));

        jLabel3.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo:");
        jLabel3.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 50, 40));

        jLabel4.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripción:");
        jLabel4.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel4.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, 40));

        jLabel5.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tamaño:");
        jLabel5.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel5.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 80, 40));

        jTFProductType.setBackground(new java.awt.Color(255, 255, 255));
        jTFProductType.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTFProductType.setForeground(new java.awt.Color(0, 0, 0));
        jTFProductType.setBorder(null);
        jTFProductType.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTFProductType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 450, 30));

        jTFProductDescription.setBackground(new java.awt.Color(255, 255, 255));
        jTFProductDescription.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTFProductDescription.setForeground(new java.awt.Color(0, 0, 0));
        jTFProductDescription.setBorder(null);
        jTFProductDescription.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTFProductDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 450, 30));

        jTFProductSize.setBackground(new java.awt.Color(255, 255, 255));
        jTFProductSize.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTFProductSize.setForeground(new java.awt.Color(0, 0, 0));
        jTFProductSize.setBorder(null);
        jTFProductSize.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTFProductSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 450, 30));

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
        dataPanel.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 130, 40));

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
        dataPanel.add(BtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 130, 40));

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
        dataPanel.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 130, 40));

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
        dataPanel.add(BtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 130, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator1.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 450, 20));
        dataPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator3.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 450, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator4.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 450, 20));

        JTBP.addTab("Datos", dataPanel);

        RegPanel.setBackground(new java.awt.Color(255, 255, 255));
        RegPanel.setForeground(new java.awt.Color(51, 51, 51));
        RegPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        RegPanel.add(jTFBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 450, 30));

        jLabel6.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Buscar: ");
        jLabel6.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(500, 15));
        RegPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, 40));

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

        RegPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 900, 460));

        JTBP.addTab("Registro", RegPanel);

        jMainPanelCategory.add(JTBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 1200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        try {
            Category category = new Category(0, this.jTFProductDescription.getText()
            ,this.jTFProductType.getText(), this.jTFProductSize.getText());
            if (dCategory.addCategory(category)) {
                JOptionPane.showMessageDialog(this, "Registro Guardado",
                    "Categoria", JOptionPane.INFORMATION_MESSAGE);
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
            "User", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (resp == 0){
            
            if(dCategory.removeCategory(idCategory)){
                JOptionPane.showMessageDialog(this, "Registro eliminado", "Autor" , JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error al eliminar ", "Autor", JOptionPane.WARNING_MESSAGE);
            }
        }
        this.clear();
        fillTable();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        int id = Integer.parseInt(String.valueOf(this.jTblReg.getValueAt(this.jTblReg.getSelectedRow(),0)));
        Category category = new Category(id, this.jTFProductDescription.getText()
            ,this.jTFProductType.getText(), this.jTFProductSize.getText());
        if(dCategory.editCategory(category)){
            JOptionPane.showMessageDialog(this, "Registro editado");

        }else{
            JOptionPane.showMessageDialog(this, "Error al editar");
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
        return jMainPanelCategory;
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
            java.util.logging.Logger.getLogger(FrmCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JTabbedPane JTBP;
    private javax.swing.JPanel RegPanel;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jMainPanelCategory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTextField jTFProductDescription;
    private javax.swing.JTextField jTFProductSize;
    private javax.swing.JTextField jTFProductType;
    private javax.swing.JTable jTblReg;
    // End of variables declaration//GEN-END:variables
}
