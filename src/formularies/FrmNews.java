package formularies;

import javax.swing.JPanel;

public class FrmNews extends javax.swing.JFrame {

    public FrmNews() {
        initComponents();
        jImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/China.gif")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanelNews = new javax.swing.JPanel();
        jImages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 520));
        setSize(new java.awt.Dimension(880, 520));

        jMainPanelNews.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanelNews.setForeground(new java.awt.Color(255, 255, 255));
        jMainPanelNews.setMaximumSize(new java.awt.Dimension(880, 520));
        jMainPanelNews.setMinimumSize(new java.awt.Dimension(880, 520));
        jMainPanelNews.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jImages.setBackground(new java.awt.Color(0, 0, 0));
        jImages.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jImages.setForeground(new java.awt.Color(0, 0, 0));
        jImages.setMaximumSize(new java.awt.Dimension(880, 520));
        jImages.setMinimumSize(new java.awt.Dimension(880, 520));
        jImages.setPreferredSize(new java.awt.Dimension(880, 520));
        jMainPanelNews.add(jImages, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanelNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getFondo() {
        return jMainPanelNews;
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
            java.util.logging.Logger.getLogger(FrmNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jImages;
    private javax.swing.JPanel jMainPanelNews;
    // End of variables declaration//GEN-END:variables
}
