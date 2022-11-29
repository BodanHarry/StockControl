package formularies;

import data.TblMode;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmMenu extends javax.swing.JFrame {

    private final TblMode dMode = new TblMode();

    ArrayList<JPanel> panelsArray = new ArrayList<>();
    ArrayList<JLabel> labelsArray = new ArrayList<>();

    int xMouse, yMouse;

    Color principalColor;

    public FrmMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        FrmNews start = new FrmNews();
        showPanel(start.getFondo());
        if (dMode.identifier() == 0) {
            principalColor = new Color(255, 255, 255);
        } else {
            principalColor = new Color(32, 32, 34);
        }

        jPanelMenu.setBackground(principalColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jBarMenu = new javax.swing.JPanel();
        jBtnClose = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBtnMin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelNews = new javax.swing.JPanel();
        jLbNews = new javax.swing.JLabel();
        jPanelinput = new javax.swing.JPanel();
        jLbInputs = new javax.swing.JLabel();
        jPanelProducts = new javax.swing.JPanel();
        jLbProducts = new javax.swing.JLabel();
        jPanelCategory = new javax.swing.JPanel();
        jLbCategories = new javax.swing.JLabel();
        jPanelOutput = new javax.swing.JPanel();
        jLbOutputs = new javax.swing.JLabel();
        jPanelUser = new javax.swing.JPanel();
        jLbUser = new javax.swing.JLabel();
        jPanelOptions = new javax.swing.JPanel();
        jLbOptions = new javax.swing.JLabel();
        jMainPanels = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 560));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 560));

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setMaximumSize(new java.awt.Dimension(1080, 560));
        jPanelMenu.setMinimumSize(new java.awt.Dimension(1080, 560));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(1080, 560));
        jPanelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelMenuMouseEntered(evt);
            }
        });
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBarMenu.setBackground(new java.awt.Color(15, 23, 46));
        jBarMenu.setForeground(new java.awt.Color(15, 23, 46));
        jBarMenu.setMaximumSize(new java.awt.Dimension(1080, 20));
        jBarMenu.setMinimumSize(new java.awt.Dimension(1080, 20));
        jBarMenu.setPreferredSize(new java.awt.Dimension(1080, 20));
        jBarMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jBarMenuMouseDragged(evt);
            }
        });
        jBarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBarMenuMousePressed(evt);
            }
        });

        jBtnClose.setBackground(new java.awt.Color(255, 102, 102));
        jBtnClose.setForeground(new java.awt.Color(255, 102, 102));
        jBtnClose.setMaximumSize(new java.awt.Dimension(50, 20));
        jBtnClose.setMinimumSize(new java.awt.Dimension(50, 20));
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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout jBtnCloseLayout = new javax.swing.GroupLayout(jBtnClose);
        jBtnClose.setLayout(jBtnCloseLayout);
        jBtnCloseLayout.setHorizontalGroup(
            jBtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jBtnCloseLayout.setVerticalGroup(
            jBtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBtnCloseLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jBtnMin.setBackground(new java.awt.Color(1, 97, 112));
        jBtnMin.setForeground(new java.awt.Color(1, 97, 112));
        jBtnMin.setMaximumSize(new java.awt.Dimension(50, 20));
        jBtnMin.setMinimumSize(new java.awt.Dimension(50, 20));
        jBtnMin.setPreferredSize(new java.awt.Dimension(50, 20));
        jBtnMin.setRequestFocusEnabled(false);
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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout jBtnMinLayout = new javax.swing.GroupLayout(jBtnMin);
        jBtnMin.setLayout(jBtnMinLayout);
        jBtnMinLayout.setHorizontalGroup(
            jBtnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jBtnMinLayout.setVerticalGroup(
            jBtnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBtnMinLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jBarMenuLayout = new javax.swing.GroupLayout(jBarMenu);
        jBarMenu.setLayout(jBarMenuLayout);
        jBarMenuLayout.setHorizontalGroup(
            jBarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBarMenuLayout.createSequentialGroup()
                .addComponent(jBtnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 980, Short.MAX_VALUE)
                .addComponent(jBtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jBarMenuLayout.setVerticalGroup(
            jBarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBarMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jBarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnMin, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
        );

        jPanelMenu.add(jBarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 20));
        jBarMenu.getAccessibleContext().setAccessibleDescription("");

        jPanel1.setBackground(new java.awt.Color(15, 23, 46));
        jPanel1.setForeground(new java.awt.Color(15, 23, 46));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(140, 520));
        jPanel1.setMinimumSize(new java.awt.Dimension(140, 520));

        jPanelNews.setBackground(new java.awt.Color(15, 23, 46));
        jPanelNews.setForeground(new java.awt.Color(15, 23, 46));
        jPanelNews.setToolTipText("");
        jPanelNews.setMaximumSize(new java.awt.Dimension(140, 50));
        jPanelNews.setMinimumSize(new java.awt.Dimension(140, 50));
        jPanelNews.setPreferredSize(new java.awt.Dimension(140, 50));
        jPanelNews.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelNewsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelNewsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelNewsMouseExited(evt);
            }
        });

        jLbNews.setBackground(new java.awt.Color(255, 255, 255));
        jLbNews.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLbNews.setForeground(new java.awt.Color(255, 255, 255));
        jLbNews.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbNews.setText("Noticias");
        jLbNews.setMaximumSize(new java.awt.Dimension(140, 50));
        jLbNews.setMinimumSize(new java.awt.Dimension(140, 50));
        jLbNews.setPreferredSize(new java.awt.Dimension(140, 50));

        javax.swing.GroupLayout jPanelNewsLayout = new javax.swing.GroupLayout(jPanelNews);
        jPanelNews.setLayout(jPanelNewsLayout);
        jPanelNewsLayout.setHorizontalGroup(
            jPanelNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelNewsLayout.setVerticalGroup(
            jPanelNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelinput.setBackground(new java.awt.Color(15, 23, 46));
        jPanelinput.setForeground(new java.awt.Color(15, 23, 46));
        jPanelinput.setMaximumSize(new java.awt.Dimension(140, 50));
        jPanelinput.setMinimumSize(new java.awt.Dimension(140, 50));
        jPanelinput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelinputMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelinputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelinputMouseExited(evt);
            }
        });

        jLbInputs.setBackground(new java.awt.Color(255, 255, 255));
        jLbInputs.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLbInputs.setForeground(new java.awt.Color(255, 255, 255));
        jLbInputs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbInputs.setText("Entradas");
        jLbInputs.setMaximumSize(new java.awt.Dimension(140, 50));
        jLbInputs.setMinimumSize(new java.awt.Dimension(140, 50));
        jLbInputs.setPreferredSize(new java.awt.Dimension(140, 50));

        javax.swing.GroupLayout jPanelinputLayout = new javax.swing.GroupLayout(jPanelinput);
        jPanelinput.setLayout(jPanelinputLayout);
        jPanelinputLayout.setHorizontalGroup(
            jPanelinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelinputLayout.setVerticalGroup(
            jPanelinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbInputs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelProducts.setBackground(new java.awt.Color(15, 23, 46));
        jPanelProducts.setForeground(new java.awt.Color(15, 23, 46));
        jPanelProducts.setMaximumSize(new java.awt.Dimension(140, 50));
        jPanelProducts.setMinimumSize(new java.awt.Dimension(140, 50));
        jPanelProducts.setPreferredSize(new java.awt.Dimension(140, 50));
        jPanelProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelProductsMouseExited(evt);
            }
        });

        jLbProducts.setBackground(new java.awt.Color(255, 255, 255));
        jLbProducts.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLbProducts.setForeground(new java.awt.Color(255, 255, 255));
        jLbProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbProducts.setText("Productos");
        jLbProducts.setMaximumSize(new java.awt.Dimension(140, 50));
        jLbProducts.setMinimumSize(new java.awt.Dimension(140, 50));
        jLbProducts.setPreferredSize(new java.awt.Dimension(140, 50));

        javax.swing.GroupLayout jPanelProductsLayout = new javax.swing.GroupLayout(jPanelProducts);
        jPanelProducts.setLayout(jPanelProductsLayout);
        jPanelProductsLayout.setHorizontalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelProductsLayout.setVerticalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelCategory.setBackground(new java.awt.Color(15, 23, 46));
        jPanelCategory.setForeground(new java.awt.Color(15, 23, 46));
        jPanelCategory.setMaximumSize(new java.awt.Dimension(140, 50));
        jPanelCategory.setMinimumSize(new java.awt.Dimension(140, 50));
        jPanelCategory.setPreferredSize(new java.awt.Dimension(140, 50));
        jPanelCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCategoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCategoryMouseExited(evt);
            }
        });

        jLbCategories.setBackground(new java.awt.Color(255, 255, 255));
        jLbCategories.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLbCategories.setForeground(new java.awt.Color(255, 255, 255));
        jLbCategories.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbCategories.setText("Categorias");
        jLbCategories.setMaximumSize(new java.awt.Dimension(140, 50));
        jLbCategories.setMinimumSize(new java.awt.Dimension(140, 50));
        jLbCategories.setPreferredSize(new java.awt.Dimension(140, 50));

        javax.swing.GroupLayout jPanelCategoryLayout = new javax.swing.GroupLayout(jPanelCategory);
        jPanelCategory.setLayout(jPanelCategoryLayout);
        jPanelCategoryLayout.setHorizontalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbCategories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCategoryLayout.setVerticalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelOutput.setBackground(new java.awt.Color(15, 23, 46));
        jPanelOutput.setForeground(new java.awt.Color(15, 23, 46));
        jPanelOutput.setMaximumSize(new java.awt.Dimension(140, 50));
        jPanelOutput.setMinimumSize(new java.awt.Dimension(140, 50));
        jPanelOutput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOutputMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelOutputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelOutputMouseExited(evt);
            }
        });

        jLbOutputs.setBackground(new java.awt.Color(255, 255, 255));
        jLbOutputs.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLbOutputs.setForeground(new java.awt.Color(255, 255, 255));
        jLbOutputs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbOutputs.setText("Salidas");
        jLbOutputs.setMaximumSize(new java.awt.Dimension(140, 50));
        jLbOutputs.setMinimumSize(new java.awt.Dimension(140, 50));
        jLbOutputs.setPreferredSize(new java.awt.Dimension(140, 50));

        javax.swing.GroupLayout jPanelOutputLayout = new javax.swing.GroupLayout(jPanelOutput);
        jPanelOutput.setLayout(jPanelOutputLayout);
        jPanelOutputLayout.setHorizontalGroup(
            jPanelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbOutputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelOutputLayout.setVerticalGroup(
            jPanelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbOutputs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelUser.setBackground(new java.awt.Color(15, 23, 46));
        jPanelUser.setForeground(new java.awt.Color(15, 23, 46));
        jPanelUser.setMaximumSize(new java.awt.Dimension(140, 50));
        jPanelUser.setMinimumSize(new java.awt.Dimension(140, 50));
        jPanelUser.setRequestFocusEnabled(false);
        jPanelUser.setVerifyInputWhenFocusTarget(false);
        jPanelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelUserMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelUserMousePressed(evt);
            }
        });

        jLbUser.setBackground(new java.awt.Color(255, 255, 255));
        jLbUser.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLbUser.setForeground(new java.awt.Color(255, 255, 255));
        jLbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbUser.setText("Usuario");
        jLbUser.setMaximumSize(new java.awt.Dimension(140, 50));
        jLbUser.setMinimumSize(new java.awt.Dimension(140, 50));
        jLbUser.setPreferredSize(new java.awt.Dimension(140, 50));

        javax.swing.GroupLayout jPanelUserLayout = new javax.swing.GroupLayout(jPanelUser);
        jPanelUser.setLayout(jPanelUserLayout);
        jPanelUserLayout.setHorizontalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelUserLayout.setVerticalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelOptions.setBackground(new java.awt.Color(15, 23, 46));
        jPanelOptions.setForeground(new java.awt.Color(15, 23, 46));
        jPanelOptions.setToolTipText("");
        jPanelOptions.setMaximumSize(new java.awt.Dimension(140, 50));
        jPanelOptions.setMinimumSize(new java.awt.Dimension(140, 50));
        jPanelOptions.setRequestFocusEnabled(false);
        jPanelOptions.setVerifyInputWhenFocusTarget(false);
        jPanelOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOptionsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelOptionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelOptionsMouseExited(evt);
            }
        });

        jLbOptions.setBackground(new java.awt.Color(255, 255, 255));
        jLbOptions.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLbOptions.setForeground(new java.awt.Color(255, 255, 255));
        jLbOptions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbOptions.setText("Opciones");
        jLbOptions.setMaximumSize(new java.awt.Dimension(140, 50));
        jLbOptions.setMinimumSize(new java.awt.Dimension(140, 50));
        jLbOptions.setPreferredSize(new java.awt.Dimension(140, 50));

        javax.swing.GroupLayout jPanelOptionsLayout = new javax.swing.GroupLayout(jPanelOptions);
        jPanelOptions.setLayout(jPanelOptionsLayout);
        jPanelOptionsLayout.setHorizontalGroup(
            jPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelOptionsLayout.setVerticalGroup(
            jPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanelNews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanelMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, 520));

        jMainPanels.setMaximumSize(new java.awt.Dimension(880, 520));
        jMainPanels.setMinimumSize(new java.awt.Dimension(880, 520));

        javax.swing.GroupLayout jMainPanelsLayout = new javax.swing.GroupLayout(jMainPanels);
        jMainPanels.setLayout(jMainPanelsLayout);
        jMainPanelsLayout.setHorizontalGroup(
            jMainPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jMainPanelsLayout.setVerticalGroup(
            jMainPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanelMenu.add(jMainPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 880, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addArrays() {
        panelsArray.add(jPanelNews);
        panelsArray.add(jPanelProducts);
        panelsArray.add(jPanelCategory);
        panelsArray.add(jPanelinput);
        panelsArray.add(jPanelOutput);
        panelsArray.add(jPanelUser);
        panelsArray.add(jPanelOptions);

        labelsArray.add(jLbNews);
        labelsArray.add(jLbProducts);
        labelsArray.add(jLbCategories);
        labelsArray.add(jLbInputs);
        labelsArray.add(jLbOutputs);
        labelsArray.add(jLbUser);
        labelsArray.add(jLbOptions);
    }

    private void setColors(JPanel panel, JLabel label) {
        for (JPanel actualPanel : panelsArray) {
            if (actualPanel == panel) {
                actualPanel.setBackground(new Color(255, 255, 255));
            } else {
                actualPanel.setBackground(new Color(15, 23, 46));
            }
        }

        for (JLabel actualLabel : labelsArray) {
            if (actualLabel == label) {
                label.setForeground(new Color(15, 23, 46));
            } else {
                actualLabel.setForeground(new Color(255, 255, 255));
            }
        }
    }


    private void jBtnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnMinMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jBtnMinMouseClicked

    private void jBtnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnMinMouseEntered
        jBtnMin.setBackground(new Color(0, 34, 147));
    }//GEN-LAST:event_jBtnMinMouseEntered

    private void jBtnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnMinMouseExited
        jBtnMin.setBackground(new Color(0, 200, 112));
    }//GEN-LAST:event_jBtnMinMouseExited

    private void jBtnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jBtnCloseMouseClicked

    private void jBtnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseEntered
        jBtnClose.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_jBtnCloseMouseEntered

    private void jBtnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseExited
        jBtnClose.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_jBtnCloseMouseExited

    private void jPanelMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelMenuMouseEntered

    private void jPanelProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProductsMouseEntered

    }//GEN-LAST:event_jPanelProductsMouseEntered

    private void jPanelProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProductsMouseExited

    }//GEN-LAST:event_jPanelProductsMouseExited

    private void jPanelCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCategoryMouseEntered

    }//GEN-LAST:event_jPanelCategoryMouseEntered

    private void jPanelCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCategoryMouseExited

    }//GEN-LAST:event_jPanelCategoryMouseExited

    private void jPanelNewsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelNewsMouseExited

    }//GEN-LAST:event_jPanelNewsMouseExited

    private void jPanelNewsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelNewsMouseEntered

    }//GEN-LAST:event_jPanelNewsMouseEntered

    private void jPanelinputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelinputMouseEntered

    }//GEN-LAST:event_jPanelinputMouseEntered

    private void jPanelinputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelinputMouseExited

    }//GEN-LAST:event_jPanelinputMouseExited

    private void jPanelOutputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOutputMouseEntered

    }//GEN-LAST:event_jPanelOutputMouseEntered

    private void jPanelOutputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOutputMouseExited

    }//GEN-LAST:event_jPanelOutputMouseExited

    private void jPanelUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUserMouseEntered

    }//GEN-LAST:event_jPanelUserMouseEntered

    private void jPanelUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUserMouseExited

    }//GEN-LAST:event_jPanelUserMouseExited

    private void jPanelUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUserMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelUserMousePressed

    private void jPanelOptionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOptionsMouseEntered

    }//GEN-LAST:event_jPanelOptionsMouseEntered

    private void jPanelOptionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOptionsMouseExited

    }//GEN-LAST:event_jPanelOptionsMouseExited

    private void jPanelNewsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelNewsMouseClicked
        this.addArrays();
        this.setColors(jPanelNews, jLbNews);
        FrmNews news = new FrmNews();
        showPanel(news.getFondo());
    }//GEN-LAST:event_jPanelNewsMouseClicked


    private void jPanelProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProductsMouseClicked
        this.addArrays();
        this.setColors(jPanelProducts, jLbProducts);
        FrmProduct product = new FrmProduct();
        showPanel(product.getFondo());

    }//GEN-LAST:event_jPanelProductsMouseClicked

    private void jPanelCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCategoryMouseClicked
        this.addArrays();
        this.setColors(jPanelCategory, jLbCategories);
        FrmCategory category = new FrmCategory();
        showPanel(category.getFondo());
    }//GEN-LAST:event_jPanelCategoryMouseClicked

    private void jPanelinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelinputMouseClicked
        this.addArrays();
        this.setColors(jPanelinput, jLbInputs);
        FrmInput input = new FrmInput();
        showPanel(input.getFondo());
    }//GEN-LAST:event_jPanelinputMouseClicked

    private void jPanelOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOutputMouseClicked
        this.addArrays();
        this.setColors(jPanelOutput, jLbOutputs);
        FrmOutput output = new FrmOutput();
        showPanel(output.getFondo());
    }//GEN-LAST:event_jPanelOutputMouseClicked

    private void jPanelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUserMouseClicked
        this.addArrays();
        this.setColors(jPanelUser, jLbUser);
        FrmUser user = new FrmUser();
        showPanel(user.getFondo());
    }//GEN-LAST:event_jPanelUserMouseClicked

    private void jPanelOptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOptionsMouseClicked
        this.addArrays();
        this.setColors(jPanelOptions, jLbOptions);
        FrmOptions options = new FrmOptions();
        showPanel(options.getFondo());
    }//GEN-LAST:event_jPanelOptionsMouseClicked

    private void jBarMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBarMenuMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jBarMenuMousePressed

    private void jBarMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBarMenuMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jBarMenuMouseDragged

    private void showPanel(JPanel p) {
        p.setSize(880, 520);
        p.setLocation(0, 0);
        jMainPanels.removeAll();
        jMainPanels.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jMainPanels.revalidate();
        jMainPanels.repaint();
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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBarMenu;
    private javax.swing.JPanel jBtnClose;
    private javax.swing.JPanel jBtnMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLbCategories;
    private javax.swing.JLabel jLbInputs;
    private javax.swing.JLabel jLbNews;
    private javax.swing.JLabel jLbOptions;
    private javax.swing.JLabel jLbOutputs;
    private javax.swing.JLabel jLbProducts;
    private javax.swing.JLabel jLbUser;
    private javax.swing.JPanel jMainPanels;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCategory;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelNews;
    private javax.swing.JPanel jPanelOptions;
    private javax.swing.JPanel jPanelOutput;
    private javax.swing.JPanel jPanelProducts;
    private javax.swing.JPanel jPanelUser;
    private javax.swing.JPanel jPanelinput;
    // End of variables declaration//GEN-END:variables
}
