/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularies;

import data.TblMode;
import data.TblUser;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.User;

/**
 *
 * @author hebod
 */
public class FrmUser extends javax.swing.JFrame {

    private String username;
    private final TblUser dUser = new TblUser();
    private ArrayList<User> userList = new ArrayList();
    private final TblMode dMode = new TblMode();

    TableRowSorter trsFiltro;
    
    Color principalColor;
    Color foregroundColor;
    
    public FrmUser() {
        initComponents();
        JTBP.setBorder(BorderFactory.createEmptyBorder());
        this.dataPanel.setBorder(BorderFactory.createEmptyBorder());
        this.regPanel.setBorder(BorderFactory.createEmptyBorder());
        jTblReg.setBorder(BorderFactory.createEmptyBorder());
        this.fillTable();
        
        if(dMode.identifier() == 0){
            principalColor = new Color(255,255,255);
            foregroundColor = new Color(32,32,34);
        }else{
            principalColor = new Color(32,32,34);
            foregroundColor = new Color(255,255,255);
        }
        
        JTBP.setBackground(principalColor);
        dataPanel.setBackground(principalColor);
        regPanel.setBackground(principalColor);
        jLbPrincipal.setForeground(foregroundColor);
        jLbUsername.setForeground(foregroundColor);
        jLbEmail.setForeground(foregroundColor);
        jLbPassword.setForeground(foregroundColor);
        jLbConfirmPassword.setForeground(foregroundColor);
        jLbSearch.setForeground(foregroundColor);
        this.jTfUsername.setBackground(principalColor);
        this.jTfUsername.setForeground(foregroundColor);
        this.jTfEmail.setBackground(principalColor);
        this.jTfEmail.setForeground(foregroundColor);
        this.jPfPassword1.setBackground(principalColor);
        this.jPfPassword1.setForeground(foregroundColor);
        this.jPfPassword2.setBackground(principalColor);
        this.jPfPassword2.setForeground(foregroundColor);
    }

    public void clear() {
        this.jTfUsername.setText("");
        this.jTfEmail.setText("");
        clearPass();
        jBtnSave.setEnabled(true);
        jBtnEdit.setEnabled(false);
        jBtnRemove.setEnabled(false);
    }

    public void clearPass() {
        this.jPfPassword1.setText("");
        this.jPfPassword2.setText("");
    }

    private void fillList() {
        if (!userList.isEmpty()) {
            userList.clear();
        }
        userList = dUser.listaUser();
    }

    public void fillTable() {
        fillList();
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            

        };
        String titulos[] = {"Username", "Email"};
        dtm.setColumnIdentifiers(titulos);
        for (User user : userList) {
            Object[] row = new Object[]{
                user.getUserName(),
                user.getUserEmail(),
                
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
        username = userList.get(row).getUserName();
        this.jTfUsername.setText(userList.get(row).getUserName());
        this.jTfEmail.setText(userList.get(row).getUserEmail());
        this.jPfPassword1.setText(userList.get(row).getUserPassword());
        this.jPfPassword2.setText(userList.get(row).getUserPassword());
        this.JTBP.setSelectedIndex(0);
        jBtnSave.setEnabled(true);
        jBtnEdit.setEnabled(true);
        jBtnRemove.setEnabled(true);
        jTfUsername.requestFocus();
    }

    private void verificarDatosVacios() {
        if (jTfUsername.getText().equals("") || jTfUsername.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique los nombres "
                    + "no esten vacios.", "Autor", JOptionPane.WARNING_MESSAGE);
            jTfUsername.requestFocus();
        }
        if (jTfEmail.getText().equals("") || jTfEmail.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique el email "
                    + "no esten vacios.", "Autor", JOptionPane.WARNING_MESSAGE);
            jTfEmail.requestFocus();
        }
        if (jPfPassword2.getText().equals("") || jPfPassword2.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique la contraseña "
                    + "no esten vacios.", "Autor", JOptionPane.WARNING_MESSAGE);
            jPfPassword2.requestFocus();
        }
        if (jPfPassword2.getText().equals("") || jPfPassword2.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor verifique la contraseña "
                    + "no esten vacios.", "Autor", JOptionPane.WARNING_MESSAGE);
            jPfPassword2.requestFocus();
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

        jMainPanelUser = new javax.swing.JPanel();
        JTBP = new javax.swing.JTabbedPane();
        dataPanel = new javax.swing.JPanel();
        jLbConfirmPassword = new javax.swing.JLabel();
        jLbPrincipal = new javax.swing.JLabel();
        jLbUsername = new javax.swing.JLabel();
        jLbEmail = new javax.swing.JLabel();
        jLbPassword = new javax.swing.JLabel();
        jTfUsername = new javax.swing.JTextField();
        jTfEmail = new javax.swing.JTextField();
        jBtnSave = new javax.swing.JButton();
        jBtnNew = new javax.swing.JButton();
        jBtnRemove = new javax.swing.JButton();
        jBtnEdit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPfPassword1 = new javax.swing.JPasswordField();
        jPfPassword2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        regPanel = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jLbSearch = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblReg = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 520));
        setSize(new java.awt.Dimension(880, 520));

        jMainPanelUser.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelUser.setForeground(new java.awt.Color(255, 255, 255));
        jMainPanelUser.setMaximumSize(new java.awt.Dimension(880, 520));
        jMainPanelUser.setMinimumSize(new java.awt.Dimension(880, 520));
        jMainPanelUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTBP.setBackground(new java.awt.Color(0, 147, 147));
        JTBP.setForeground(new java.awt.Color(255, 255, 255));
        JTBP.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        JTBP.setPreferredSize(new java.awt.Dimension(425, 425));
        JTBP.setVerifyInputWhenFocusTarget(false);

        dataPanel.setBackground(new java.awt.Color(255, 255, 255));
        dataPanel.setForeground(new java.awt.Color(153, 153, 153));
        dataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbConfirmPassword.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbConfirmPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLbConfirmPassword.setText("Confirmar contraseña:");
        jLbConfirmPassword.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbConfirmPassword.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, 40));

        jLbPrincipal.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLbPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        jLbPrincipal.setText("INGRESE LOS DATOS DE SU USUARIO");
        jLbPrincipal.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbPrincipal.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 450, 60));

        jLbUsername.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbUsername.setForeground(new java.awt.Color(0, 0, 0));
        jLbUsername.setText("Nombre de Usuario: ");
        jLbUsername.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbUsername.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 40));

        jLbEmail.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLbEmail.setText("Correo:");
        jLbEmail.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbEmail.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 130, 40));

        jLbPassword.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        jLbPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLbPassword.setText("Contraseña:");
        jLbPassword.setMaximumSize(new java.awt.Dimension(5000, 15));
        jLbPassword.setMinimumSize(new java.awt.Dimension(500, 15));
        dataPanel.add(jLbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 160, 40));

        jTfUsername.setBackground(new java.awt.Color(255, 255, 255));
        jTfUsername.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfUsername.setForeground(new java.awt.Color(0, 0, 0));
        jTfUsername.setBorder(null);
        jTfUsername.setCaretColor(new java.awt.Color(0, 0, 0));
        dataPanel.add(jTfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 450, 30));

        jTfEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTfEmail.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTfEmail.setForeground(new java.awt.Color(0, 0, 0));
        jTfEmail.setBorder(null);
        jTfEmail.setCaretColor(new java.awt.Color(0, 0, 0));
        dataPanel.add(jTfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 450, 30));

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

        jSeparator5.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator5.setForeground(new java.awt.Color(0, 147, 147));
        dataPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 450, 30));

        jPfPassword1.setBackground(new java.awt.Color(255, 255, 255));
        jPfPassword1.setForeground(new java.awt.Color(0, 0, 0));
        jPfPassword1.setBorder(null);
        jPfPassword1.setCaretColor(new java.awt.Color(0, 0, 0));
        jPfPassword1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        dataPanel.add(jPfPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 229, 450, 30));

        jPfPassword2.setBackground(new java.awt.Color(255, 255, 255));
        jPfPassword2.setForeground(new java.awt.Color(0, 0, 0));
        jPfPassword2.setBorder(null);
        jPfPassword2.setCaretColor(new java.awt.Color(0, 0, 0));
        jPfPassword2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPfPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPfPassword2ActionPerformed(evt);
            }
        });
        dataPanel.add(jPfPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 289, 450, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ver.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        dataPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/no-visible.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        dataPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, 20));

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

        jMainPanelUser.add(JTBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 1200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewActionPerformed
        // TODO add your handling code here:
        clear();
        this.JTBP.setSelectedIndex(0);
    }//GEN-LAST:event_jBtnNewActionPerformed

    private void jBtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoveActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(this, "Desea eliminar este registro? ",
                                            "User", JOptionPane.YES_NO_OPTION, 
                                            JOptionPane.QUESTION_MESSAGE);
         if (resp == 0){
            if(dUser.removeUser(username)){
                JOptionPane.showMessageDialog(this, "Registro eliminado", "Autor" , JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error al eliminar ", "Autor", JOptionPane.WARNING_MESSAGE);
            }
        }
         fillTable();
         this.clear();
    }//GEN-LAST:event_jBtnRemoveActionPerformed

    private String checkPass() {
        Boolean flag = true;
        if(flag) {
            
            if (String.valueOf(jPfPassword1.getText()).equals(String.valueOf(jPfPassword2.getText()))) {
                flag = false;
                return String.valueOf(jPfPassword2.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Contraseñas inválidas",
                        "Vuelva a intentar", JOptionPane.WARNING_MESSAGE);
                flag = true;
                this.clearPass();
            }
        }
        return String.valueOf(jPfPassword2.getText());
    }

    public Boolean checking() {
        Boolean flag = false;
        if (String.valueOf(jPfPassword2.getText()).equals(String.valueOf(jPfPassword1.getText())) &&
                String.valueOf(jPfPassword1.getText()).length() != 0 &&
                String.valueOf(jPfPassword2.getText()).length() != 0) {
            if( String.valueOf(jPfPassword2.getText()).length() == String.valueOf(jPfPassword1.getText()).length()){
                flag = true;
            }
            
        }else{
            flag = false;
        }
        return flag;
    }

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        try {
            User user = new User(0, this.jTfUsername.getText(),
                    this.jTfEmail.getText(), this.checkPass());
            if(checking() == true){
                 if (dUser.addUser(user)) {
                JOptionPane.showMessageDialog(this, "Registro Guardado",
                         "User", JOptionPane.INFORMATION_MESSAGE);
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

    private void jBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditActionPerformed
        // TODO add your handling code here:
        this.verificarDatosVacios();
        User user = new User(0, this.jTfUsername.getText(),
                this.jTfEmail.getText(), this.checkPass()); 
        if(checking() == true && dUser.editUser(user)){
           JOptionPane.showMessageDialog(this, "Registro editado");
           fillTable();
           this.JTBP.setSelectedIndex(1);
           
        }else{
            JOptionPane.showMessageDialog(this, "Error al editar");
        }
    }//GEN-LAST:event_jBtnEditActionPerformed

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

    private void jTFBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscarKeyReleased
        // TODO add your handling code here:
                filtrarTabla();
        trsFiltro = new TableRowSorter(jTblReg.getModel());
        jTblReg.setRowSorter(trsFiltro);
    }//GEN-LAST:event_jTFBuscarKeyReleased

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
        
        jBtnNew.setEnabled(false);
        jBtnSave.setEnabled(false);
    }//GEN-LAST:event_jTblRegMouseClicked

    private void jPfPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPfPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPfPassword2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setVisible(false);
        this.jButton2.setVisible(true);
        this.jPfPassword1.setEchoChar((char)0);
        this.jPfPassword2.setEchoChar((char)0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton1.setVisible(true);
        this.jButton2.setVisible(false);
        this.jPfPassword1.setEchoChar('°');
        this.jPfPassword2.setEchoChar('°');
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public JPanel getFondo() {
        return jMainPanelUser;

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
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUser().setVisible(true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLbConfirmPassword;
    private javax.swing.JLabel jLbEmail;
    private javax.swing.JLabel jLbPassword;
    private javax.swing.JLabel jLbPrincipal;
    private javax.swing.JLabel jLbSearch;
    private javax.swing.JLabel jLbUsername;
    private javax.swing.JPanel jMainPanelUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPfPassword1;
    private javax.swing.JPasswordField jPfPassword2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTable jTblReg;
    private javax.swing.JTextField jTfEmail;
    private javax.swing.JTextField jTfUsername;
    private javax.swing.JPanel regPanel;
    // End of variables declaration//GEN-END:variables
}
