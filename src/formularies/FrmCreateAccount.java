package formularies;

import data.TblMode;
import functions.SendEmail;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmCreateAccount extends javax.swing.JFrame {

    Color principalColor;
    Color foregroundColor;
    
    SendEmail sendEmail = new SendEmail();
    
    private final TblMode dMode = new TblMode();

    
    public FrmCreateAccount() {
        initComponents();

        if (dMode.identifier() == 0) {
            principalColor = new Color(255, 255, 255);
            foregroundColor = new Color(32, 32, 34);
        } else {
            principalColor = new Color(32, 32, 34);
            foregroundColor = new Color(255, 255, 255);
        }

        jMainPanelCreateAccount.setBackground(principalColor);
        jLbCreateEmail.setForeground(foregroundColor);
        jLbCreatePassword.setForeground(foregroundColor);
        jTfCreateEmail.setBackground(principalColor);
        jTfCreateUser.setBackground(principalColor);

    }

  
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(290, 200));
        setUndecorated(true);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jMainPanelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jMainPanelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTfCreateUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTfCreateUserFocusGained
        jTfCreateUser.setText("");
    }//GEN-LAST:event_jTfCreateUserFocusGained

    private void jTfCreateUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfCreateUserMousePressed
        if (jTfCreateUser.getText().equals("Ingrese su nombre de usuario")) {
            jTfCreateUser.setText("");
            jTfCreateUser.setForeground(new Color(0, 147, 147));
        }

        if (String.valueOf(jTfCreateEmail.getText()).equals("")) {
            jTfCreateEmail.setText("Ingrese su correco electrónico");
            jTfCreateEmail.setForeground(new Color(0, 147, 147));
        }
    }//GEN-LAST:event_jTfCreateUserMousePressed

    private void jTfCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfCreateUserActionPerformed

    private void jBtnVerifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnVerifyMouseClicked
        JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + jTfCreateUser.getText() + "\nCorreo: " + String.valueOf(jTfCreateEmail.getText()));
        String email = jTfCreateEmail.getText();
        String temporaryPassword = sendEmail.createEmail(email);
        sendEmail.SendEmail();
    }//GEN-LAST:event_jBtnVerifyMouseClicked

    private void jBtnVerifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnVerifyMouseEntered
        jBtnVerify.setBackground(new Color(0, 224, 147));
    }//GEN-LAST:event_jBtnVerifyMouseEntered

    private void jBtnVerifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnVerifyMouseExited
        jBtnVerify.setBackground(new Color(0, 147, 147));
    }//GEN-LAST:event_jBtnVerifyMouseExited

    private void jTfCreateEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTfCreateEmailFocusGained
        jTfCreateEmail.setText("");
    }//GEN-LAST:event_jTfCreateEmailFocusGained

    private void jTfCreateEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfCreateEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfCreateEmailActionPerformed

    private void jTfCreateEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfCreateEmailMousePressed
        if (jTfCreateUser.getText().equals("")) {
            jTfCreateUser.setText("Ingrese su nombre de usuario");
            jTfCreateUser.setForeground(new Color(0, 147, 147));
        }

        if (String.valueOf(jTfCreateEmail.getText()).equals("Ingrese su correco electrónico")) {
            jTfCreateEmail.setText("");
            jTfCreateEmail.setForeground(new Color(0, 147, 147));
        }
    }//GEN-LAST:event_jTfCreateEmailMousePressed

    public JPanel getFondo() {
        return jMainPanelCreateAccount;
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
            java.util.logging.Logger.getLogger(FrmCreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBtnVerify;
    private javax.swing.JLabel jLbCreateEmail;
    private javax.swing.JLabel jLbCreatePassword;
    private javax.swing.JLabel jLbVerify;
    private javax.swing.JPanel jMainPanelCreateAccount;
    private javax.swing.JSeparator jSpCreateEmail;
    private javax.swing.JSeparator jSpCreatePassword;
    private javax.swing.JTextField jTfCreateEmail;
    private javax.swing.JTextField jTfCreateUser;
    // End of variables declaration//GEN-END:variables
}
