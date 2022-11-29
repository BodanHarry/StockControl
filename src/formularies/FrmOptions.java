package formularies;

import data.TblMode;
import java.awt.Color;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanelOptions = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtnChangeModeDark = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 520));

        jMainPanelOptions.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelOptions.setForeground(new java.awt.Color(255, 255, 255));
        jMainPanelOptions.setMaximumSize(new java.awt.Dimension(880, 520));
        jMainPanelOptions.setMinimumSize(new java.awt.Dimension(880, 520));
        jMainPanelOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Options");
        jMainPanelOptions.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jBtnChangeModeDark.setText("Oscuro");
        jBtnChangeModeDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnChangeModeDarkActionPerformed(evt);
            }
        });
        jMainPanelOptions.add(jBtnChangeModeDark, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jButton1.setText("Claro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jMainPanelOptions.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jMainPanelOptions;
    // End of variables declaration//GEN-END:variables
}
