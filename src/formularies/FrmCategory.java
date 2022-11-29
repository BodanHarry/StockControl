package formularies;

import data.TblCategory;
import data.TblMode;
import java.awt.Color;
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


public class FrmCategory extends javax.swing.JFrame {
    
    Color principalColor;
    Color foregroundColor;
    
    private ArrayList<Category> categoryList = new ArrayList();
    private TblCategory dCategory = new TblCategory();
    private final TblMode dMode = new TblMode();
    
    private int idCategory;

    TableRowSorter trsFiltro;

    public FrmCategory() {
        initComponents();
        JTBP.setBorder(BorderFactory.createEmptyBorder());
        this.dataPanel.setBorder(BorderFactory.createEmptyBorder());
        this.regPanel.setBorder(BorderFactory.createEmptyBorder());
        jTblReg.setBorder(BorderFactory.createEmptyBorder());
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
        jLbType.setForeground(foregroundColor);
        jLbDescription.setForeground(foregroundColor);
        jLbSize.setForeground(foregroundColor);
        jLbSearch.setForeground(foregroundColor);
        jTfProductType.setBackground(principalColor);
        jTfProductType.setForeground(foregroundColor);
        jTfProductDescription.setBackground(principalColor);
        jTfProductDescription.setForeground(foregroundColor);
        jTfProductSize.setBackground(principalColor);
        jTfProductSize.setForeground(foregroundColor);
    }

    public void clear() {
        this.jTfProductType.setText("");
        this.jTfProductSize.setText("");
        this.jTfProductDescription.setText("");
        jBtnSave.setEnabled(true);
        jBtnEdit.setEnabled(false);
        jBtnRemove.setEnabled(false);
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
        this.jTfProductType.setText(categoryList.get(row).getProductType());
        this.jTfProductDescription.setText(categoryList.get(row).getProductDescription());
        this.jTfProductSize.setText(categoryList.get(row).getProductSize());
        this.JTBP.setSelectedIndex(0);
        jBtnSave.setEnabled(true);
        jBtnEdit.setEnabled(true);
        jBtnRemove.setEnabled(true);
        jTfProductType.requestFocus();
    }

    private void verificarDatosVacios() {
        if (jTfProductType.getText().equals("") || jTfProductType.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que el tipo"
                    + "no este vacío.", "Tipo", JOptionPane.WARNING_MESSAGE);
            jTfProductType.requestFocus();
        }
        if (jTfProductDescription.getText().equals("") || jTfProductDescription.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que la descripción "
                    + "no este vacía.", "Descripción", JOptionPane.WARNING_MESSAGE);
            jTfProductDescription.requestFocus();
        }
        if (jTfProductSize.getText().equals("") || jTfProductSize.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique que el tamaño "
                    + "no este vacío.", "Tamaño", JOptionPane.WARNING_MESSAGE);
            jTfProductSize.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jMainPanelCategory = new javax.swing.JPanel();
        JTBP = new javax.swing.JTabbedPane();
        dataPanel = new javax.swing.JPanel();
        jLbPrincipal = new javax.swing.JLabel();
        jLbType = new javax.swing.JLabel();
        jLbDescription = new javax.swing.JLabel();
        jLbSize = new javax.swing.JLabel();
        jTfProductType = new javax.swing.JTextField();
        jTfProductDescription = new javax.swing.JTextField();
        jTfProductSize = new javax.swing.JTextField();
        jBtnSave = new javax.swing.JButton();
        jBtnNew = new javax.swing.JButton();
        jBtnRemove = new javax.swing.JButton();
        jBtnEdit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        regPanel = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jLbSearch = new javax.swing.JLabel();
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

        jLbPrincipal.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLbPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        jLbPrincipal.setText("INGRESE LOS DATOS DE LA CATEGORÍA");
        jLbPrincipal.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbPrincipal.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 470, 60));

        jLbType.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbType.setForeground(new java.awt.Color(0, 0, 0));
        jLbType.setText("Tipo:");
        jLbType.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbType.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 50, 40));

        jLbDescription.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbDescription.setForeground(new java.awt.Color(0, 0, 0));
        jLbDescription.setText("Descripción:");
        jLbDescription.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbDescription.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, 40));

        jLbSize.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbSize.setForeground(new java.awt.Color(0, 0, 0));
        jLbSize.setText("Tamaño:");
        jLbSize.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbSize.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 80, 40));

        jTfProductType.setBackground(new java.awt.Color(255, 255, 255));
        jTfProductType.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfProductType.setForeground(new java.awt.Color(0, 0, 0));
        jTfProductType.setBorder(null);
        jTfProductType.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTfProductType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 450, 30));

        jTfProductDescription.setBackground(new java.awt.Color(255, 255, 255));
        jTfProductDescription.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfProductDescription.setForeground(new java.awt.Color(0, 0, 0));
        jTfProductDescription.setBorder(null);
        jTfProductDescription.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTfProductDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 450, 30));

        jTfProductSize.setBackground(new java.awt.Color(255, 255, 255));
        jTfProductSize.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfProductSize.setForeground(new java.awt.Color(0, 0, 0));
        jTfProductSize.setBorder(null);
        jTfProductSize.setCaretColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jTfProductSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 450, 30));

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
        dataPanel.add(jBtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 130, 40));

        jBtnNew.setBackground(new java.awt.Color(0, 153, 153));
        jBtnNew.setFont(new java.awt.Font("Inter Black", 0, 15)); // NOI18N
        jBtnNew.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNew.setText("Nuevo");
        jBtnNew.setBorder(null);
        jBtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewActionPerformed(evt);
            }
        });
        dataPanel.add(jBtnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 130, 40));

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
        dataPanel.add(jBtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 130, 40));

        jBtnEdit.setBackground(new java.awt.Color(0, 153, 153));
        jBtnEdit.setFont(new java.awt.Font("Inter Black", 0, 15)); // NOI18N
        jBtnEdit.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEdit.setText("Editar");
        jBtnEdit.setBorder(null);
        jBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditActionPerformed(evt);
            }
        });
        dataPanel.add(jBtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 130, 40));

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
        jLbSearch.setForeground(new java.awt.Color(0, 0, 0));
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

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        try {
            Category category = new Category(0, this.jTfProductDescription.getText(),
                     this.jTfProductType.getText(), this.jTfProductSize.getText());
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
    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void jBtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewActionPerformed
        // TODO add your handling code here:
        clear();
        this.JTBP.setSelectedIndex(0);
    }//GEN-LAST:event_jBtnNewActionPerformed

    private void jBtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoveActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        int resp = JOptionPane.showConfirmDialog(this, "Desea eliminar este registro? ",
                "User", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {

            if (dCategory.removeCategory(idCategory)) {
                JOptionPane.showMessageDialog(this, "Registro eliminado", "Autor", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar ", "Autor", JOptionPane.WARNING_MESSAGE);
            }
        }
        this.clear();
        fillTable();
    }//GEN-LAST:event_jBtnRemoveActionPerformed

    private void jBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        int id = Integer.parseInt(String.valueOf(this.jTblReg.getValueAt(this.jTblReg.getSelectedRow(), 0)));
        Category category = new Category(id, this.jTfProductDescription.getText(),
                 this.jTfProductType.getText(), this.jTfProductSize.getText());
        if (dCategory.editCategory(category)) {
            JOptionPane.showMessageDialog(this, "Registro editado");

        } else {
            JOptionPane.showMessageDialog(this, "Error al editar");
        }
        fillTable();
    }//GEN-LAST:event_jBtnEditActionPerformed

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
    private javax.swing.JTabbedPane JTBP;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JButton jBtnEdit;
    private javax.swing.JButton jBtnNew;
    private javax.swing.JButton jBtnRemove;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLbDescription;
    private javax.swing.JLabel jLbPrincipal;
    private javax.swing.JLabel jLbSearch;
    private javax.swing.JLabel jLbSize;
    private javax.swing.JLabel jLbType;
    private javax.swing.JPanel jMainPanelCategory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTable jTblReg;
    private javax.swing.JTextField jTfProductDescription;
    private javax.swing.JTextField jTfProductSize;
    private javax.swing.JTextField jTfProductType;
    private javax.swing.JPanel regPanel;
    // End of variables declaration//GEN-END:variables
}
