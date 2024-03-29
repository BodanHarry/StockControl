package formularies;

import data.TblMode;
import data.TblUser;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmLogin extends javax.swing.JFrame {

    Color principalColor;
    Color foregroundColor;

    private final TblUser dUser = new TblUser();
    private final TblMode dMode = new TblMode();

    public FrmLogin() {
        initComponents();

        if (dMode.identifier() == 0) {
            principalColor = new Color(255, 255, 255);
            foregroundColor = new Color(32, 32, 34);
        } else {
            principalColor = new Color(32, 32, 34);
            foregroundColor = new Color(255, 255, 255);
        }

        jMainPanelLogin.setBackground(principalColor);
        jLbUser.setForeground(foregroundColor);
        jLbPassword.setForeground(foregroundColor);
        jTfUser.setBackground(principalColor);
        jPfPassword.setBackground(principalColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanelLogin = new javax.swing.JPanel();
        jLbUser = new javax.swing.JLabel();
        jTfUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLbPassword = new javax.swing.JLabel();
        jPfPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jBtnLogin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(290, 200));
        setUndecorated(true);

        jMainPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelLogin.setForeground(new java.awt.Color(0, 0, 0));
        jMainPanelLogin.setMaximumSize(new java.awt.Dimension(290, 200));
        jMainPanelLogin.setMinimumSize(new java.awt.Dimension(290, 200));
        jMainPanelLogin.setPreferredSize(new java.awt.Dimension(290, 200));
        jMainPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLbUser.setForeground(new java.awt.Color(1, 97, 112));
        jLbUser.setText("Usuario");
        jMainPanelLogin.add(jLbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTfUser.setBackground(new java.awt.Color(255, 255, 255));
        jTfUser.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jTfUser.setForeground(new java.awt.Color(0, 147, 147));
        jTfUser.setText("Ingrese su correo electrónico");
        jTfUser.setBorder(null);
        jTfUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTfUserFocusGained(evt);
            }
        });
        jTfUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTfUserMousePressed(evt);
            }
        });
        jTfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfUserActionPerformed(evt);
            }
        });
        jMainPanelLogin.add(jTfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 30));

        jSeparator1.setBackground(new java.awt.Color(1, 97, 112));
        jSeparator1.setForeground(new java.awt.Color(1, 97, 112));
        jSeparator1.setMaximumSize(new java.awt.Dimension(0, 3));
        jSeparator1.setMinimumSize(new java.awt.Dimension(0, 3));
        jMainPanelLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 270, 10));

        jLbPassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLbPassword.setForeground(new java.awt.Color(1, 97, 112));
        jLbPassword.setText("Contraseña");
        jLbPassword.setMaximumSize(new java.awt.Dimension(133, 19));
        jLbPassword.setMinimumSize(new java.awt.Dimension(133, 19));
        jLbPassword.setPreferredSize(new java.awt.Dimension(133, 19));
        jMainPanelLogin.add(jLbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jPfPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPfPassword.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jPfPassword.setForeground(new java.awt.Color(0, 147, 147));
        jPfPassword.setText("****************");
        jPfPassword.setBorder(null);
        jPfPassword.setPreferredSize(new java.awt.Dimension(153, 16));
        jPfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPfPasswordFocusGained(evt);
            }
        });
        jPfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPfPasswordMousePressed(evt);
            }
        });
        jMainPanelLogin.add(jPfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 270, 30));

        jSeparator2.setBackground(new java.awt.Color(1, 97, 112));
        jSeparator2.setForeground(new java.awt.Color(1, 97, 112));
        jSeparator2.setMaximumSize(new java.awt.Dimension(0, 3));
        jSeparator2.setMinimumSize(new java.awt.Dimension(0, 3));
        jMainPanelLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 10));

        jBtnLogin.setBackground(new java.awt.Color(0, 147, 147));
        jBtnLogin.setForeground(new java.awt.Color(0, 147, 147));
        jBtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnLoginMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciar Sesión");

        javax.swing.GroupLayout jBtnLoginLayout = new javax.swing.GroupLayout(jBtnLogin);
        jBtnLogin.setLayout(jBtnLoginLayout);
        jBtnLoginLayout.setHorizontalGroup(
            jBtnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBtnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jBtnLoginLayout.setVerticalGroup(
            jBtnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBtnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMainPanelLogin.add(jBtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jMainPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jMainPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfUserActionPerformed

    private void jTfUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfUserMousePressed
        if (jTfUser.getText().equals("Ingrese su usuario")) {
            jTfUser.setText("");
            jTfUser.setForeground(new Color(0, 147, 147));
        }

        if (String.valueOf(jPfPassword.getPassword()).equals("")) {
            jPfPassword.setText("****************");
            jPfPassword.setForeground(new Color(0, 147, 147));
        }
    }//GEN-LAST:event_jTfUserMousePressed

    private void jTfUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTfUserFocusGained
        jTfUser.setText("");
    }//GEN-LAST:event_jTfUserFocusGained

    public JPanel getFondo() {
        return jMainPanelLogin;
    }

    private void jPfPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPfPasswordMousePressed
        if (jPfPassword.getPassword().equals("****************")) {
            jPfPassword.setText("");
            jPfPassword.setForeground(new Color(0, 147, 147));
        }

        if (String.valueOf(jTfUser.getText()).equals("")) {
            jTfUser.setText("Ingrese su usuario");
            jTfUser.setForeground(new Color(0, 147, 147));
        }
    }//GEN-LAST:event_jPfPasswordMousePressed

    private void jPfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPfPasswordFocusGained
        jPfPassword.setText("");
    }//GEN-LAST:event_jPfPasswordFocusGained

    private void jBtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLoginMouseClicked
        JOptionPane.showMessageDialog(null, "Credenciales enviadas");
        //if(jTfEmail.getText().equals("aa") || jPfPassword.getPassword().equals("aa")){
        //FrmMenu menu = new FrmMenu();
        //menu.setVisible(true);
        //}
        //jTfEmail.setText("");
        //jPfPassword.setText("");
        checkUser(jTfUser.getText(), String.valueOf(jPfPassword.getPassword()));
    }//GEN-LAST:event_jBtnLoginMouseClicked


    private void jBtnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLoginMouseEntered
        jBtnLogin.setBackground(new Color(0, 224, 147));
    }//GEN-LAST:event_jBtnLoginMouseEntered

    private void jBtnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLoginMouseExited
        jBtnLogin.setBackground(new Color(0, 147, 147));
    }//GEN-LAST:event_jBtnLoginMouseExited

    private void checkUser(String username, String password) {
        if (dUser.existUser(username)) {
            dUser.getUser(username);
            if (dUser.getUserName(username).equals(username)
                    && dUser.getUserPassword(username).equals(password)) {
                FrmMenu menu = new FrmMenu();
                menu.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "La contraseña de el "
                        + "usuario es invalido, vuelva a intentar ");
            }
        }
        jTfUser.setText("");
        jPfPassword.setText("");
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBtnLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbPassword;
    private javax.swing.JLabel jLbUser;
    private javax.swing.JPanel jMainPanelLogin;
    private javax.swing.JPasswordField jPfPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTfUser;
    // End of variables declaration//GEN-END:variables
}
