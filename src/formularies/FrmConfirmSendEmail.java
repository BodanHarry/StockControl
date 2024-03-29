package formularies;

import java.awt.Color;

public class FrmConfirmSendEmail extends javax.swing.JFrame {

    public FrmConfirmSendEmail() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConfirmEmail = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtnOkeyEmail = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelConfirmEmail.setBackground(new java.awt.Color(244, 244, 244));
        jPanelConfirmEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 224, 147)));
        jPanelConfirmEmail.setForeground(new java.awt.Color(244, 244, 244));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/gifConfirmEmail(168,70).gif"))); // NOI18N

        jBtnOkeyEmail.setBackground(new java.awt.Color(0, 147, 147));
        jBtnOkeyEmail.setForeground(new java.awt.Color(0, 147, 147));
        jBtnOkeyEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnOkeyEmailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnOkeyEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnOkeyEmailMouseExited(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ok");

        javax.swing.GroupLayout jBtnOkeyEmailLayout = new javax.swing.GroupLayout(jBtnOkeyEmail);
        jBtnOkeyEmail.setLayout(jBtnOkeyEmailLayout);
        jBtnOkeyEmailLayout.setHorizontalGroup(
            jBtnOkeyEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        jBtnOkeyEmailLayout.setVerticalGroup(
            jBtnOkeyEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("El correo se ha enviado con éxito!!!");

        javax.swing.GroupLayout jPanelConfirmEmailLayout = new javax.swing.GroupLayout(jPanelConfirmEmail);
        jPanelConfirmEmail.setLayout(jPanelConfirmEmailLayout);
        jPanelConfirmEmailLayout.setHorizontalGroup(
            jPanelConfirmEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfirmEmailLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanelConfirmEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfirmEmailLayout.createSequentialGroup()
                        .addComponent(jBtnOkeyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfirmEmailLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfirmEmailLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(59, 59, 59))))
        );
        jPanelConfirmEmailLayout.setVerticalGroup(
            jPanelConfirmEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfirmEmailLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnOkeyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelConfirmEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelConfirmEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOkeyEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnOkeyEmailMouseClicked
        this.dispose();
    }//GEN-LAST:event_jBtnOkeyEmailMouseClicked

    private void jBtnOkeyEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnOkeyEmailMouseEntered
        jBtnOkeyEmail.setBackground(new Color(0, 224, 147));
    }//GEN-LAST:event_jBtnOkeyEmailMouseEntered

    private void jBtnOkeyEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnOkeyEmailMouseExited
        jBtnOkeyEmail.setBackground(new Color(0, 147, 147));
    }//GEN-LAST:event_jBtnOkeyEmailMouseExited

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
            java.util.logging.Logger.getLogger(FrmConfirmSendEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConfirmSendEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConfirmSendEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConfirmSendEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConfirmSendEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBtnOkeyEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelConfirmEmail;
    // End of variables declaration//GEN-END:variables
}
