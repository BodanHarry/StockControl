package formularies;

import data.TblMode;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmOptions extends javax.swing.JFrame {

    Color principalColor;
    Color foregroundColor;

    private final TblMode dMode = new TblMode();

    public FrmOptions() {
        initComponents();

        if (dMode.identifier() == 0) {
            principalColor = new Color(255, 255, 255);
            foregroundColor = new Color(32, 32, 34);
        } else {
            principalColor = new Color(32, 32, 34);
            foregroundColor = new Color(255, 255, 255);
        }

        jMainPanelOptions.setBackground(principalColor);
        jLbOptions.setForeground(foregroundColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanelOptions = new javax.swing.JPanel();
        jLbOptions = new javax.swing.JLabel();
        jBtnChangeModeDark = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBtnSpanish = new javax.swing.JButton();
        jBtnEnglish = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 520));

        jMainPanelOptions.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelOptions.setForeground(new java.awt.Color(255, 255, 255));
        jMainPanelOptions.setMaximumSize(new java.awt.Dimension(880, 520));
        jMainPanelOptions.setMinimumSize(new java.awt.Dimension(880, 520));
        jMainPanelOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbOptions.setBackground(new java.awt.Color(0, 0, 0));
        jLbOptions.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLbOptions.setForeground(new java.awt.Color(0, 0, 0));
        jLbOptions.setText("Opciones");
        jMainPanelOptions.add(jLbOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 40));

        jBtnChangeModeDark.setBackground(new java.awt.Color(1, 97, 112));
        jBtnChangeModeDark.setForeground(new java.awt.Color(255, 255, 255));
        jBtnChangeModeDark.setText("Oscuro");
        jBtnChangeModeDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnChangeModeDarkActionPerformed(evt);
            }
        });
        jMainPanelOptions.add(jBtnChangeModeDark, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(1, 97, 112));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Claro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jMainPanelOptions.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 147, 147));
        jSeparator1.setForeground(new java.awt.Color(0, 147, 147));
        jMainPanelOptions.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 880, 30));

        jPanel1.setBackground(new java.awt.Color(0, 147, 147));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Preferencias de idioma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jMainPanelOptions.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 280, 50));

        jPanel2.setBackground(new java.awt.Color(0, 147, 147));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Preferencias de vista");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMainPanelOptions.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 280, 50));

        jPanel3.setBackground(new java.awt.Color(0, 147, 147));
        jPanel3.setForeground(new java.awt.Color(0, 147, 147));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jMainPanelOptions.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 440, 400));

        jBtnSpanish.setBackground(new java.awt.Color(1, 97, 112));
        jBtnSpanish.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSpanish.setText("Español");
        jBtnSpanish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSpanishActionPerformed(evt);
            }
        });
        jMainPanelOptions.add(jBtnSpanish, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jBtnEnglish.setBackground(new java.awt.Color(1, 97, 112));
        jBtnEnglish.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEnglish.setText("Inglés");
        jBtnEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEnglishActionPerformed(evt);
            }
        });
        jMainPanelOptions.add(jBtnEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 147, 147));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar Sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jMainPanelOptions.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnChangeModeDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnChangeModeDarkActionPerformed
        if (dMode.changeMode(1)) {
            System.out.println("Éxito");
        }
        this.repaint();
    }//GEN-LAST:event_jBtnChangeModeDarkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (dMode.changeMode(0)) {
            System.out.println("Éxito");
        }
        this.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnSpanishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSpanishActionPerformed
        JOptionPane.showMessageDialog(this, "Actualmente estás en idioma Español", "Idioma", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBtnSpanishActionPerformed

    private void jBtnEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEnglishActionPerformed
        JOptionPane.showMessageDialog(this, "Necesitas pagar membresía Premium para Inglés", "Idioma", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBtnEnglishActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        FrmMain main = new FrmMain();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    public JPanel getFondo() {
        return jMainPanelOptions;
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
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnChangeModeDark;
    private javax.swing.JButton jBtnEnglish;
    private javax.swing.JButton jBtnSpanish;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbOptions;
    private javax.swing.JPanel jMainPanelOptions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
