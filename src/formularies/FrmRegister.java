/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularies;

import data.TblUser;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import models.User;

/**
 *
 * @author bradl
 */
public class FrmRegister extends javax.swing.JFrame {
    FrmUser usuario = new FrmUser();
    TblUser dUser = new TblUser();
    FrmMain main = new FrmMain();
    /**
     * Creates new form FrmRegister
     */
    public FrmRegister() {
        initComponents();
        jPf1.requestFocus();
        
      
    }
    
    public void setUserEmail(String user, String email){
        jtfUser.setText(user);
        jtfEmail.setText(email);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanelCreateAccount = new javax.swing.JPanel();
        jLbCreateEmail = new javax.swing.JLabel();
        jTfCreateUser = new javax.swing.JTextField();
        jSpCreateEmail = new javax.swing.JSeparator();
        jLbCreatePassword = new javax.swing.JLabel();
        jSpCreatePassword = new javax.swing.JSeparator();
        jBtnVerify = new javax.swing.JPanel();
        jLbVerify = new javax.swing.JLabel();
        jTfCreateEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMainPanelCreateAccount1 = new javax.swing.JPanel();
        jLbCreateEmail1 = new javax.swing.JLabel();
        jtfUser = new javax.swing.JTextField();
        jSpCreateEmail1 = new javax.swing.JSeparator();
        jLbCreatePassword1 = new javax.swing.JLabel();
        jSpCreatePassword1 = new javax.swing.JSeparator();
        jLbCreatePassword2 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jPf1 = new javax.swing.JPasswordField();
        jSpCreatePassword2 = new javax.swing.JSeparator();
        jLbCreatePassword3 = new javax.swing.JLabel();
        jPf2 = new javax.swing.JPasswordField();
        jSpCreatePassword3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        jMainPanelCreateAccount.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelCreateAccount.setForeground(new java.awt.Color(0, 0, 0));
        jMainPanelCreateAccount.setMaximumSize(new java.awt.Dimension(290, 200));
        jMainPanelCreateAccount.setMinimumSize(new java.awt.Dimension(290, 200));
        jMainPanelCreateAccount.setPreferredSize(new java.awt.Dimension(290, 200));
        jMainPanelCreateAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbCreateEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLbCreateEmail.setForeground(new java.awt.Color(1, 97, 112));
        jLbCreateEmail.setText("Nombre de Usuario");
        jMainPanelCreateAccount.add(jLbCreateEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTfCreateUser.setBackground(new java.awt.Color(255, 255, 255));
        jTfCreateUser.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jTfCreateUser.setForeground(new java.awt.Color(0, 147, 147));
        jTfCreateUser.setText("Ingrese su nombre de usuario");
        jTfCreateUser.setBorder(null);
        jTfCreateUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTfCreateUserFocusGained(evt);
            }
        });
        jTfCreateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTfCreateUserMousePressed(evt);
            }
        });
        jTfCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfCreateUserActionPerformed(evt);
            }
        });
        jMainPanelCreateAccount.add(jTfCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 30));

        jSpCreateEmail.setBackground(new java.awt.Color(1, 97, 112));
        jSpCreateEmail.setForeground(new java.awt.Color(1, 97, 112));
        jSpCreateEmail.setMaximumSize(new java.awt.Dimension(0, 3));
        jSpCreateEmail.setMinimumSize(new java.awt.Dimension(0, 3));
        jMainPanelCreateAccount.add(jSpCreateEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 270, 10));

        jLbCreatePassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLbCreatePassword.setForeground(new java.awt.Color(1, 97, 112));
        jLbCreatePassword.setText("Correo Electrónico");
        jMainPanelCreateAccount.add(jLbCreatePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jSpCreatePassword.setBackground(new java.awt.Color(1, 97, 112));
        jSpCreatePassword.setForeground(new java.awt.Color(1, 97, 112));
        jSpCreatePassword.setMaximumSize(new java.awt.Dimension(0, 3));
        jSpCreatePassword.setMinimumSize(new java.awt.Dimension(0, 3));
        jMainPanelCreateAccount.add(jSpCreatePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 10));

        jBtnVerify.setBackground(new java.awt.Color(0, 147, 147));
        jBtnVerify.setForeground(new java.awt.Color(0, 147, 147));
        jBtnVerify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnVerifyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnVerifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnVerifyMouseExited(evt);
            }
        });

        jLbVerify.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLbVerify.setForeground(new java.awt.Color(255, 255, 255));
        jLbVerify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbVerify.setText("Verificar");

        javax.swing.GroupLayout jBtnVerifyLayout = new javax.swing.GroupLayout(jBtnVerify);
        jBtnVerify.setLayout(jBtnVerifyLayout);
        jBtnVerifyLayout.setHorizontalGroup(
            jBtnVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBtnVerifyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLbVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jBtnVerifyLayout.setVerticalGroup(
            jBtnVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbVerify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jMainPanelCreateAccount.add(jBtnVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 20));

        jTfCreateEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTfCreateEmail.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jTfCreateEmail.setForeground(new java.awt.Color(0, 147, 147));
        jTfCreateEmail.setText("Ingrese su correo electrónico");
        jTfCreateEmail.setBorder(null);
        jTfCreateEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTfCreateEmailFocusGained(evt);
            }
        });
        jTfCreateEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTfCreateEmailMousePressed(evt);
            }
        });
        jTfCreateEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfCreateEmailActionPerformed(evt);
            }
        });
        jMainPanelCreateAccount.add(jTfCreateEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 270, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMainPanelCreateAccount1.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelCreateAccount1.setForeground(new java.awt.Color(0, 0, 0));
        jMainPanelCreateAccount1.setMaximumSize(new java.awt.Dimension(290, 200));
        jMainPanelCreateAccount1.setMinimumSize(new java.awt.Dimension(290, 200));
        jMainPanelCreateAccount1.setPreferredSize(new java.awt.Dimension(290, 200));
        jMainPanelCreateAccount1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbCreateEmail1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLbCreateEmail1.setForeground(new java.awt.Color(1, 97, 112));
        jLbCreateEmail1.setText("Nombre de Usuario");
        jMainPanelCreateAccount1.add(jLbCreateEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jtfUser.setBackground(new java.awt.Color(255, 255, 255));
        jtfUser.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jtfUser.setForeground(new java.awt.Color(0, 147, 147));
        jtfUser.setText("Ingrese su nombre de usuario");
        jtfUser.setBorder(null);
        jtfUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfUserFocusGained(evt);
            }
        });
        jtfUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfUserMousePressed(evt);
            }
        });
        jtfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUserActionPerformed(evt);
            }
        });
        jMainPanelCreateAccount1.add(jtfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 30));

        jSpCreateEmail1.setBackground(new java.awt.Color(1, 97, 112));
        jSpCreateEmail1.setForeground(new java.awt.Color(1, 97, 112));
        jSpCreateEmail1.setMaximumSize(new java.awt.Dimension(0, 3));
        jSpCreateEmail1.setMinimumSize(new java.awt.Dimension(0, 3));
        jMainPanelCreateAccount1.add(jSpCreateEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 10));

        jLbCreatePassword1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLbCreatePassword1.setForeground(new java.awt.Color(1, 97, 112));
        jLbCreatePassword1.setText("Confirmar contraseña");
        jMainPanelCreateAccount1.add(jLbCreatePassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jSpCreatePassword1.setBackground(new java.awt.Color(1, 97, 112));
        jSpCreatePassword1.setForeground(new java.awt.Color(1, 97, 112));
        jSpCreatePassword1.setMaximumSize(new java.awt.Dimension(0, 3));
        jSpCreatePassword1.setMinimumSize(new java.awt.Dimension(0, 3));
        jMainPanelCreateAccount1.add(jSpCreatePassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 290, 10));

        jLbCreatePassword2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLbCreatePassword2.setForeground(new java.awt.Color(1, 97, 112));
        jLbCreatePassword2.setText("Correo Electrónico");
        jMainPanelCreateAccount1.add(jLbCreatePassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jtfEmail.setBackground(new java.awt.Color(255, 255, 255));
        jtfEmail.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jtfEmail.setForeground(new java.awt.Color(0, 147, 147));
        jtfEmail.setText("Ingrese su correo electrónico");
        jtfEmail.setBorder(null);
        jtfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfEmailFocusGained(evt);
            }
        });
        jtfEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfEmailMousePressed(evt);
            }
        });
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });
        jMainPanelCreateAccount1.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 270, 30));

        jPf1.setBackground(new java.awt.Color(255, 255, 255));
        jPf1.setForeground(new java.awt.Color(0, 0, 0));
        jPf1.setBorder(null);
        jPf1.setCaretColor(new java.awt.Color(0, 0, 0));
        jPf1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPf1ActionPerformed(evt);
            }
        });
        jMainPanelCreateAccount1.add(jPf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, 20));

        jSpCreatePassword2.setBackground(new java.awt.Color(1, 97, 112));
        jSpCreatePassword2.setForeground(new java.awt.Color(1, 97, 112));
        jSpCreatePassword2.setMaximumSize(new java.awt.Dimension(0, 3));
        jSpCreatePassword2.setMinimumSize(new java.awt.Dimension(0, 3));
        jMainPanelCreateAccount1.add(jSpCreatePassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 10));

        jLbCreatePassword3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLbCreatePassword3.setForeground(new java.awt.Color(1, 97, 112));
        jLbCreatePassword3.setText("Contraseña");
        jMainPanelCreateAccount1.add(jLbCreatePassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jPf2.setBackground(new java.awt.Color(255, 255, 255));
        jPf2.setForeground(new java.awt.Color(0, 0, 0));
        jPf2.setBorder(null);
        jPf2.setCaretColor(new java.awt.Color(0, 0, 0));
        jPf2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPf2ActionPerformed(evt);
            }
        });
        jMainPanelCreateAccount1.add(jPf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 270, 20));

        jSpCreatePassword3.setBackground(new java.awt.Color(1, 97, 112));
        jSpCreatePassword3.setForeground(new java.awt.Color(1, 97, 112));
        jSpCreatePassword3.setMaximumSize(new java.awt.Dimension(0, 3));
        jSpCreatePassword3.setMinimumSize(new java.awt.Dimension(0, 3));
        jMainPanelCreateAccount1.add(jSpCreatePassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 10));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jMainPanelCreateAccount1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 70, 30));

        jPanel2.add(jMainPanelCreateAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTfCreateUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTfCreateUserFocusGained
       
    }//GEN-LAST:event_jTfCreateUserFocusGained

    private void jTfCreateUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfCreateUserMousePressed
        if (jtfUser.getText().equals("Ingrese su nombre de usuario")) {
            jtfUser.setForeground(new Color(0, 147, 147));
        }

        if (String.valueOf(jtfEmail.getText()).equals("")) {
            jtfEmail.setText("Ingrese su correco electrónico");
            jtfEmail.setForeground(new Color(0, 147, 147));
        }
    }//GEN-LAST:event_jTfCreateUserMousePressed

    private void jTfCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfCreateUserActionPerformed

    private void jBtnVerifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnVerifyMouseClicked
     
    }//GEN-LAST:event_jBtnVerifyMouseClicked

    private void jBtnVerifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnVerifyMouseEntered
        jButton1.setBackground(new Color(0, 224, 147));
    }//GEN-LAST:event_jBtnVerifyMouseEntered

    private void jBtnVerifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnVerifyMouseExited
        jButton1.setBackground(new Color(0, 147, 147));
    }//GEN-LAST:event_jBtnVerifyMouseExited

    private void jTfCreateEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTfCreateEmailFocusGained
        jtfEmail.setText("");
    }//GEN-LAST:event_jTfCreateEmailFocusGained

    private void jTfCreateEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfCreateEmailMousePressed
        if (jtfUser.getText().equals("")) {
            jtfUser.setText("Ingrese su nombre de usuario");
            jtfUser.setForeground(new Color(0, 147, 147));
        }

        if (String.valueOf(jtfEmail.getText()).equals("Ingrese su correco electrónico")) {
            jtfEmail.setText("");
            jtfEmail.setForeground(new Color(0, 147, 147));
        }
    }//GEN-LAST:event_jTfCreateEmailMousePressed

    private void jTfCreateEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfCreateEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfCreateEmailActionPerformed

    private void jtfUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfUserFocusGained
        jtfUser.setText("");
    }//GEN-LAST:event_jtfUserFocusGained

    private void jtfUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUserMousePressed
        if (jtfUser.getText().equals("Ingrese su nombre de usuario")) {
            
            jtfUser.setForeground(new Color(0, 147, 147));
        }

        if (String.valueOf(jtfEmail.getText()).equals("")) {
            jtfEmail.setText("Ingrese su correco electrónico");
            jtfEmail.setForeground(new Color(0, 147, 147));
        }
    }//GEN-LAST:event_jtfUserMousePressed

    private void jtfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUserActionPerformed

    private void jtfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailFocusGained

    private void jtfEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfEmailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailMousePressed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void jPf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPf1ActionPerformed

    private void jPf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPf2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            User user = new User(0, this.jtfUser.getText(),
                    this.jtfEmail.getText(), this.checkPass());
            if(checking() == true){
                 if (dUser.addUser(user)) {
                JOptionPane.showMessageDialog(this, "Registro Guardado",
                         "User", JOptionPane.INFORMATION_MESSAGE);
                usuario.fillTable();
                
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar");
            }
            }
           
        } catch (HeadlessException es) {
            System.out.println("Error al intentar guardar" + es.getMessage());
        }finally{
            main.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private String checkPass() {
        Boolean flag = true;
        if(flag) {
            
            if (String.valueOf(jPf1.getText()).equals(String.valueOf(jPf2.getText()))) {
                flag = false;
                return String.valueOf(jPf2.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Contraseñas inválidas",
                        "Vuelva a intentar", JOptionPane.WARNING_MESSAGE);
                flag = true;
                usuario.clearPass();
            }
        }
        return String.valueOf(jPf2.getText());
    }

    public Boolean checking() {
        Boolean flag = false;
        if (String.valueOf(jPf2.getText()).equals(String.valueOf(jPf1.getText())) &&
                String.valueOf(jPf1.getText()).length() != 0 &&
                String.valueOf(jPf1.getText()).length() != 0) {
            if( String.valueOf(jPf1.getText()).length() == String.valueOf(jPf1.getText()).length()){
                flag = true;
            }
            
        }else{
            flag = false;
        }
        return flag;
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
            java.util.logging.Logger.getLogger(FrmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBtnVerify;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLbCreateEmail;
    private javax.swing.JLabel jLbCreateEmail1;
    private javax.swing.JLabel jLbCreatePassword;
    private javax.swing.JLabel jLbCreatePassword1;
    private javax.swing.JLabel jLbCreatePassword2;
    private javax.swing.JLabel jLbCreatePassword3;
    private javax.swing.JLabel jLbVerify;
    private javax.swing.JPanel jMainPanelCreateAccount;
    private javax.swing.JPanel jMainPanelCreateAccount1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPf1;
    private javax.swing.JPasswordField jPf2;
    private javax.swing.JSeparator jSpCreateEmail;
    private javax.swing.JSeparator jSpCreateEmail1;
    private javax.swing.JSeparator jSpCreatePassword;
    private javax.swing.JSeparator jSpCreatePassword1;
    private javax.swing.JSeparator jSpCreatePassword2;
    private javax.swing.JSeparator jSpCreatePassword3;
    private javax.swing.JTextField jTfCreateEmail;
    private javax.swing.JTextField jTfCreateUser;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables
}
