package formularies;

import java.awt.Color;
import javax.swing.JPanel;


public class FrmMain extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    
    public FrmMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        FrmLogin start = new FrmLogin();
        showPanel(start.getFondo());
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSpCreateAccount = new javax.swing.JSeparator();
        jSpLogin = new javax.swing.JSeparator();
        jSpSeparator = new javax.swing.JSeparator();
        jBtnClose = new javax.swing.JPanel();
        jLbClose = new javax.swing.JLabel();
        jPanelBar = new javax.swing.JPanel();
        jBtnMin = new javax.swing.JPanel();
        jLbMin = new javax.swing.JLabel();
        jPanels = new javax.swing.JPanel();
        jLbCreateAccount = new javax.swing.JLabel();
        jBtnCreateAccount = new javax.swing.JPanel();
        jLbLogin = new javax.swing.JLabel();
        jBtnLogin = new javax.swing.JPanel();
        jMainPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 353));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(15, 23, 46));
        jPanel2.setForeground(new java.awt.Color(15, 23, 46));
        jPanel2.setMaximumSize(new java.awt.Dimension(560, 353));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSpCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSpCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 100, 10));

        jSpLogin.setForeground(new java.awt.Color(15, 23, 46));
        jPanel2.add(jSpLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 100, 10));

        jSpSeparator.setBackground(new java.awt.Color(1, 97, 112));
        jSpSeparator.setForeground(new java.awt.Color(1, 97, 112));
        jSpSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSpSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 18, 19));

        jBtnClose.setBackground(new java.awt.Color(255, 102, 102));
        jBtnClose.setForeground(new java.awt.Color(255, 102, 102));
        jBtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnCloseMouseExited(evt);
            }
        });

        jLbClose.setBackground(new java.awt.Color(255, 255, 255));
        jLbClose.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLbClose.setForeground(new java.awt.Color(255, 255, 255));
        jLbClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbClose.setText("X");

        javax.swing.GroupLayout jBtnCloseLayout = new javax.swing.GroupLayout(jBtnClose);
        jBtnClose.setLayout(jBtnCloseLayout);
        jBtnCloseLayout.setHorizontalGroup(
            jBtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jBtnCloseLayout.setVerticalGroup(
            jBtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jBtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 50, 20));

        jPanelBar.setBackground(new java.awt.Color(15, 23, 46));
        jPanelBar.setMaximumSize(new java.awt.Dimension(560, 20));
        jPanelBar.setMinimumSize(new java.awt.Dimension(560, 20));
        jPanelBar.setPreferredSize(new java.awt.Dimension(560, 20));
        jPanelBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelBarMouseDragged(evt);
            }
        });
        jPanelBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarMousePressed(evt);
            }
        });

        jBtnMin.setBackground(new java.awt.Color(1, 97, 112));
        jBtnMin.setForeground(new java.awt.Color(1, 97, 112));
        jBtnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnMinMouseExited(evt);
            }
        });

        jLbMin.setBackground(new java.awt.Color(255, 255, 255));
        jLbMin.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLbMin.setForeground(new java.awt.Color(255, 255, 255));
        jLbMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbMin.setText("-");

        javax.swing.GroupLayout jBtnMinLayout = new javax.swing.GroupLayout(jBtnMin);
        jBtnMin.setLayout(jBtnMinLayout);
        jBtnMinLayout.setHorizontalGroup(
            jBtnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBtnMinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLbMin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jBtnMinLayout.setVerticalGroup(
            jBtnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBtnMinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLbMin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelBarLayout = new javax.swing.GroupLayout(jPanelBar);
        jPanelBar.setLayout(jPanelBarLayout);
        jPanelBarLayout.setHorizontalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarLayout.createSequentialGroup()
                .addComponent(jBtnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 520, Short.MAX_VALUE))
        );
        jPanelBarLayout.setVerticalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 20));

        jPanels.setBackground(new java.awt.Color(255, 255, 255));
        jPanels.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelsLayout = new javax.swing.GroupLayout(jPanels);
        jPanels.setLayout(jPanelsLayout);
        jPanelsLayout.setHorizontalGroup(
            jPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanelsLayout.setVerticalGroup(
            jPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel2.add(jPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 290, 200));

        jLbCreateAccount.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLbCreateAccount.setForeground(new java.awt.Color(0, 147, 147));
        jLbCreateAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbCreateAccount.setText("Crear Cuenta");
        jLbCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbCreateAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbCreateAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbCreateAccountMouseExited(evt);
            }
        });
        jPanel2.add(jLbCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 120, 20));

        jBtnCreateAccount.setBackground(new java.awt.Color(255, 255, 255));
        jBtnCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnCreateAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jBtnCreateAccountLayout = new javax.swing.GroupLayout(jBtnCreateAccount);
        jBtnCreateAccount.setLayout(jBtnCreateAccountLayout);
        jBtnCreateAccountLayout.setHorizontalGroup(
            jBtnCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jBtnCreateAccountLayout.setVerticalGroup(
            jBtnCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jBtnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 20));

        jLbLogin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLbLogin.setForeground(new java.awt.Color(0, 147, 147));
        jLbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbLogin.setText("Iniciar Sesión");
        jLbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbLoginMouseExited(evt);
            }
        });
        jPanel2.add(jLbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 120, 20));

        jBtnLogin.setBackground(new java.awt.Color(255, 255, 255));
        jBtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        jBtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jBtnLoginLayout = new javax.swing.GroupLayout(jBtnLogin);
        jBtnLogin.setLayout(jBtnLoginLayout);
        jBtnLoginLayout.setHorizontalGroup(
            jBtnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jBtnLoginLayout.setVerticalGroup(
            jBtnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jBtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 100, 20));

        jMainPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hamacas(563,353).png"))); // NOI18N
        jMainPanel.setMaximumSize(new java.awt.Dimension(560, 353));
        jMainPanel.setMinimumSize(new java.awt.Dimension(560, 353));
        jMainPanel.setPreferredSize(new java.awt.Dimension(560, 353));
        jPanel2.add(jMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLoginMouseClicked
        jSpLogin.setForeground(new Color(15,23,46));
        jSpCreateAccount.setForeground(new Color(255,255,255));
        FrmLogin login = new FrmLogin();
        showPanel(login.getFondo());
    }//GEN-LAST:event_jBtnLoginMouseClicked

    private void jLbLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbLoginMouseClicked
        jSpLogin.setForeground(new Color(15,23,46));
        jSpCreateAccount.setForeground(new Color(255,255,255));
        FrmLogin login = new FrmLogin();
        showPanel(login.getFondo());
    }//GEN-LAST:event_jLbLoginMouseClicked

    private void jBtnCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCreateAccountMouseClicked
        jSpCreateAccount.setForeground(new Color(15,23,46));
        jSpLogin.setForeground(new Color(255,255,255));
        FrmCreateAccount createAccount = new FrmCreateAccount();
        showPanel(createAccount.getFondo());
    }//GEN-LAST:event_jBtnCreateAccountMouseClicked

    private void jPanelBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelBarMousePressed

    private void jPanelBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanelBarMouseDragged

    private void jBtnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseEntered
        jBtnClose.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_jBtnCloseMouseEntered

    private void jBtnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseExited
        jBtnClose.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_jBtnCloseMouseExited

    private void jBtnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jBtnCloseMouseClicked

    private void jLbLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbLoginMouseEntered
        jLbLogin.setForeground(new Color(15,23,46));
    }//GEN-LAST:event_jLbLoginMouseEntered

    private void jLbLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbLoginMouseExited
        jLbLogin.setForeground(new Color(0,147,147));
    }//GEN-LAST:event_jLbLoginMouseExited

    private void jLbCreateAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbCreateAccountMouseEntered
        jLbCreateAccount.setForeground(new Color(15,23,46));
    }//GEN-LAST:event_jLbCreateAccountMouseEntered

    private void jLbCreateAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbCreateAccountMouseExited
        jLbCreateAccount.setForeground(new Color(0,147,147));
    }//GEN-LAST:event_jLbCreateAccountMouseExited

    private void jLbCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbCreateAccountMouseClicked
        jSpCreateAccount.setForeground(new Color(15,23,46));
        jSpLogin.setForeground(new Color(255,255,255));
        FrmCreateAccount createAccount = new FrmCreateAccount();
        showPanel(createAccount.getFondo());
    }//GEN-LAST:event_jLbCreateAccountMouseClicked

    private void jBtnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnMinMouseEntered
        jBtnMin.setBackground(new Color(0,147,147));
    }//GEN-LAST:event_jBtnMinMouseEntered

    private void jBtnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnMinMouseExited
        jBtnMin.setBackground(new Color(1,97,112));
    }//GEN-LAST:event_jBtnMinMouseExited

    private void jBtnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnMinMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jBtnMinMouseClicked

    private void showPanel(JPanel p){
        p.setSize(290, 200);
        p.setLocation(0, 0);
        jPanels.removeAll();
        jPanels.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        jPanels.revalidate();
        jPanels.repaint();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBtnClose;
    private javax.swing.JPanel jBtnCreateAccount;
    private javax.swing.JPanel jBtnLogin;
    private javax.swing.JPanel jBtnMin;
    private javax.swing.JLabel jLbClose;
    private javax.swing.JLabel jLbCreateAccount;
    private javax.swing.JLabel jLbLogin;
    private javax.swing.JLabel jLbMin;
    private javax.swing.JLabel jMainPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBar;
    private javax.swing.JPanel jPanels;
    private javax.swing.JSeparator jSpCreateAccount;
    private javax.swing.JSeparator jSpLogin;
    private javax.swing.JSeparator jSpSeparator;
    // End of variables declaration//GEN-END:variables
}
