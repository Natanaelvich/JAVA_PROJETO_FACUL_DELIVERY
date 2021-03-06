package views;

import java.awt.Color;
import javax.swing.JLabel;

public class ProdutosPitstop extends javax.swing.JPanel {

    JanelaPrinci janelaPrinci = new JanelaPrinci();
        public static boolean ativo = false;

    public ProdutosPitstop() {
        initComponents();
        this.jScrollPane2ProdutosPitsop.getVerticalScrollBar().setUnitIncrement(20);
        qtdcarrinho();
        ativo = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2ProdutosPitsop = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel13RJNome = new javax.swing.JLabel();
        jLabel7RomeuEjuli = new javax.swing.JLabel();
        jLabel9Portuguesa = new javax.swing.JLabel();
        jLabel10Muça = new javax.swing.JLabel();
        jLabel11FrangoCap = new javax.swing.JLabel();
        jLabel12Napoli = new javax.swing.JLabel();
        jLabel24CoxinhaFran = new javax.swing.JLabel();
        jLabel26Pastel = new javax.swing.JLabel();
        jLabel32CoxinhaCopo = new javax.swing.JLabel();
        jLabel34Agua = new javax.swing.JLabel();
        jLabel36Suco = new javax.swing.JLabel();
        jLabel38Refri = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel15nomePortuguesa = new javax.swing.JLabel();
        jLabel16NomeMuça = new javax.swing.JLabel();
        jLabel17CoxinhaCopoNome = new javax.swing.JLabel();
        jLabel18NapoliNome = new javax.swing.JLabel();
        jLabel43FranCatuNome = new javax.swing.JLabel();
        jLabel25CoxinhaDeFrangoNome = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel33PastelNome = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel8PizzaMexicana = new javax.swing.JLabel();
        jLabel48NomeMexicana = new javax.swing.JLabel();
        jLabel9QuantiCarrinho = new javax.swing.JLabel();
        jLabel7CarrinhoTelaInicial = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(760, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2ProdutosPitsop.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(730, 1310));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 1310));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13RJNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13RJNome.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13RJNome.setText("Romeu e Julieta");
        jPanel1.add(jLabel13RJNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, -1, -1));

        jLabel7RomeuEjuli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7RomeuEjuli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PIZZA-ROMEU-E-JULIETA-800x480.png"))); // NOI18N
        jLabel7RomeuEjuli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7RomeuEjuli.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7RomeuEjuliMouseMoved(evt);
            }
        });
        jLabel7RomeuEjuli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7RomeuEjuliMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7RomeuEjuliMouseExited(evt);
            }
        });
        jPanel1.add(jLabel7RomeuEjuli, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 180, 150));

        jLabel9Portuguesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9Portuguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/portuguesa.png"))); // NOI18N
        jLabel9Portuguesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9Portuguesa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9PortuguesaMouseMoved(evt);
            }
        });
        jLabel9Portuguesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9PortuguesaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9PortuguesaMouseExited(evt);
            }
        });
        jPanel1.add(jLabel9Portuguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 180, 150));

        jLabel10Muça.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10Muça.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/muçarela.png"))); // NOI18N
        jLabel10Muça.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10Muça.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MuçaMouseMoved(evt);
            }
        });
        jLabel10Muça.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MuçaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MuçaMouseExited(evt);
            }
        });
        jPanel1.add(jLabel10Muça, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 180, 150));

        jLabel11FrangoCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11FrangoCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Frango-com-catupiry1.png"))); // NOI18N
        jLabel11FrangoCap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11FrangoCap.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel11FrangoCapMouseMoved(evt);
            }
        });
        jLabel11FrangoCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11FrangoCapMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11FrangoCapMouseExited(evt);
            }
        });
        jPanel1.add(jLabel11FrangoCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 180, 150));

        jLabel12Napoli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12Napoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/napolitana.png"))); // NOI18N
        jLabel12Napoli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12Napoli.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel12NapoliMouseMoved(evt);
            }
        });
        jLabel12Napoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12NapoliMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12NapoliMouseExited(evt);
            }
        });
        jPanel1.add(jLabel12Napoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 180, 150));

        jLabel24CoxinhaFran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24CoxinhaFran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coxinha.png"))); // NOI18N
        jLabel24CoxinhaFran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24CoxinhaFran.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel24CoxinhaFranMouseMoved(evt);
            }
        });
        jLabel24CoxinhaFran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24CoxinhaFranMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24CoxinhaFranMouseExited(evt);
            }
        });
        jPanel1.add(jLabel24CoxinhaFran, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 180, 150));

        jLabel26Pastel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26Pastel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pastel.png"))); // NOI18N
        jLabel26Pastel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26Pastel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel26PastelMouseMoved(evt);
            }
        });
        jLabel26Pastel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26PastelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26PastelMouseExited(evt);
            }
        });
        jPanel1.add(jLabel26Pastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 710, 180, 150));

        jLabel32CoxinhaCopo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32CoxinhaCopo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coxinhaDecopo.png"))); // NOI18N
        jLabel32CoxinhaCopo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32CoxinhaCopo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel32CoxinhaCopoMouseMoved(evt);
            }
        });
        jLabel32CoxinhaCopo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32CoxinhaCopoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32CoxinhaCopoMouseExited(evt);
            }
        });
        jPanel1.add(jLabel32CoxinhaCopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 700, 200, 160));

        jLabel34Agua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34Agua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agua.png"))); // NOI18N
        jLabel34Agua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel34Agua.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel34AguaMouseMoved(evt);
            }
        });
        jLabel34Agua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel34AguaMouseExited(evt);
            }
        });
        jPanel1.add(jLabel34Agua, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 1100, 180, 150));

        jLabel36Suco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36Suco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/suco-de-laranja.png"))); // NOI18N
        jLabel36Suco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36Suco.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel36SucoMouseMoved(evt);
            }
        });
        jLabel36Suco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36SucoMouseExited(evt);
            }
        });
        jPanel1.add(jLabel36Suco, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 1100, 180, 150));

        jLabel38Refri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38Refri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coca.png"))); // NOI18N
        jLabel38Refri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38Refri.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel38RefriMouseMoved(evt);
            }
        });
        jLabel38Refri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38RefriMouseExited(evt);
            }
        });
        jPanel1.add(jLabel38Refri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1100, 180, 150));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 102, 51));
        jLabel40.setText("Bebidas");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 950, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 102, 51));
        jLabel42.setText("Pizzas");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1050, 510, 10));

        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 510, 10));

        jSeparator9.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 510, 10));

        jSeparator10.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 690, 510, 10));

        jLabel15nomePortuguesa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15nomePortuguesa.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15nomePortuguesa.setText("Portuguesa");
        jPanel1.add(jLabel15nomePortuguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jLabel16NomeMuça.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16NomeMuça.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16NomeMuça.setText("Muçarela");
        jPanel1.add(jLabel16NomeMuça, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        jLabel17CoxinhaCopoNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17CoxinhaCopoNome.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17CoxinhaCopoNome.setText("Coxinha de copo");
        jPanel1.add(jLabel17CoxinhaCopoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 870, -1, -1));

        jLabel18NapoliNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18NapoliNome.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18NapoliNome.setText(" Napolitana");
        jPanel1.add(jLabel18NapoliNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        jLabel43FranCatuNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43FranCatuNome.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43FranCatuNome.setText("Frango com catupiry");
        jPanel1.add(jLabel43FranCatuNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel25CoxinhaDeFrangoNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25CoxinhaDeFrangoNome.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25CoxinhaDeFrangoNome.setText("Coxinha de Frango");
        jPanel1.add(jLabel25CoxinhaDeFrangoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 860, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Água");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 1270, -1, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 102, 51));
        jLabel44.setText("Salgados");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 910, 510, 10));

        jSeparator12.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 910, 510, 10));

        jLabel33PastelNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33PastelNome.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33PastelNome.setText("Pastel");
        jPanel1.add(jLabel33PastelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 860, -1, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Refri");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1270, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Suco");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1270, -1, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Suco");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1270, -1, -1));

        jLabel8PizzaMexicana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8PizzaMexicana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PizzaMexicana.png"))); // NOI18N
        jLabel8PizzaMexicana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8PizzaMexicana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8PizzaMexicanaMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8PizzaMexicanaMouseMoved(evt);
            }
        });
        jLabel8PizzaMexicana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8PizzaMexicanaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8PizzaMexicanaMouseExited(evt);
            }
        });
        jPanel1.add(jLabel8PizzaMexicana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 150));

        jLabel48NomeMexicana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48NomeMexicana.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48NomeMexicana.setText("Pizza Mexicana");
        jPanel1.add(jLabel48NomeMexicana, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel9QuantiCarrinho.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9QuantiCarrinho.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9QuantiCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9QuantiCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, 40));

        jLabel7CarrinhoTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carrinho.png"))); // NOI18N
        jLabel7CarrinhoTelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7CarrinhoTelaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7CarrinhoTelaInicialMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7CarrinhoTelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        jScrollPane2ProdutosPitsop.setViewportView(jPanel1);

        add(jScrollPane2ProdutosPitsop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, -1, 610));
    }// </editor-fold>//GEN-END:initComponents

   public static void qtdcarrinho() {
        if (JanelaPrinci.produtos.size() > 0) {
            jLabel9QuantiCarrinho.setText(Integer.toString(JanelaPrinci.produtos.size()));
        } else {
            jLabel9QuantiCarrinho.setText("");
        }
    }
    private void jLabel7RomeuEjuliMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7RomeuEjuliMouseMoved
        jLabel7RomeuEjuli.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel7RomeuEjuliMouseMoved

    private void jLabel7RomeuEjuliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7RomeuEjuliMouseExited
        jLabel7RomeuEjuli.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel7RomeuEjuliMouseExited

    private void jLabel9PortuguesaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9PortuguesaMouseMoved
        jLabel9Portuguesa.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel9PortuguesaMouseMoved

    private void jLabel9PortuguesaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9PortuguesaMouseExited
        jLabel9Portuguesa.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel9PortuguesaMouseExited

    private void jLabel10MuçaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MuçaMouseMoved
        jLabel10Muça.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel10MuçaMouseMoved

    private void jLabel10MuçaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MuçaMouseExited
        jLabel10Muça.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel10MuçaMouseExited

    private void jLabel11FrangoCapMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11FrangoCapMouseMoved
        jLabel11FrangoCap.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel11FrangoCapMouseMoved

    private void jLabel11FrangoCapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11FrangoCapMouseExited
        jLabel11FrangoCap.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel11FrangoCapMouseExited

    private void jLabel12NapoliMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12NapoliMouseMoved
        jLabel12Napoli.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel12NapoliMouseMoved

    private void jLabel12NapoliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12NapoliMouseExited
        jLabel12Napoli.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel12NapoliMouseExited

    private void jLabel24CoxinhaFranMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24CoxinhaFranMouseMoved
        jLabel24CoxinhaFran.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel24CoxinhaFranMouseMoved

    private void jLabel24CoxinhaFranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24CoxinhaFranMouseExited
        jLabel24CoxinhaFran.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel24CoxinhaFranMouseExited

    private void jLabel26PastelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26PastelMouseMoved
        jLabel26Pastel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel26PastelMouseMoved

    private void jLabel26PastelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26PastelMouseExited
        jLabel26Pastel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel26PastelMouseExited

    private void jLabel32CoxinhaCopoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32CoxinhaCopoMouseMoved
        jLabel32CoxinhaCopo.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel32CoxinhaCopoMouseMoved

    private void jLabel32CoxinhaCopoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32CoxinhaCopoMouseExited
        // TODO add your handling code here:
        jLabel32CoxinhaCopo.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel32CoxinhaCopoMouseExited

    private void jLabel34AguaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34AguaMouseMoved
        jLabel34Agua.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel34AguaMouseMoved

    private void jLabel34AguaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34AguaMouseExited
        // TODO add your handling code here:
        jLabel34Agua.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel34AguaMouseExited

    private void jLabel36SucoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36SucoMouseMoved
        jLabel36Suco.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel36SucoMouseMoved

    private void jLabel36SucoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36SucoMouseExited
        jLabel36Suco.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel36SucoMouseExited

    private void jLabel38RefriMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38RefriMouseMoved
        jLabel38Refri.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel38RefriMouseMoved

    private void jLabel38RefriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38RefriMouseExited
        jLabel38Refri.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel38RefriMouseExited

    private void jLabel8PizzaMexicanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8PizzaMexicanaMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8PizzaMexicanaMouseDragged

    private void jLabel8PizzaMexicanaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8PizzaMexicanaMouseMoved
        jLabel8PizzaMexicana.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel8PizzaMexicanaMouseMoved

    private void jLabel8PizzaMexicanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8PizzaMexicanaMouseExited
        jLabel8PizzaMexicana.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel8PizzaMexicanaMouseExited

    //exibindo caixa de compra  
    private void mostrarCaixa(JLabel jLabelIcon, JLabel nomeJLabel, String ingredientes, String preco, int id_empresa,int id_produto) {
        CaixaDeCompra caixaDeCompra = new CaixaDeCompra(janelaPrinci, true);
        caixaDeCompra.jLabel2IconProduto.setIcon(jLabelIcon.getIcon());
        caixaDeCompra.jLabel3NomeProduto.setText(nomeJLabel.getText());
        caixaDeCompra.jLabel2Preço.setText(preco);
        caixaDeCompra.jLabel2Igredientes.setText(ingredientes);
        caixaDeCompra.jLabel3Empresa.setText(String.valueOf(id_empresa));
        caixaDeCompra.jLabel3IdProduto.setText(String.valueOf(id_produto));

        caixaDeCompra.setVisible(true);
    }
    private void jLabel8PizzaMexicanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8PizzaMexicanaMouseClicked
        mostrarCaixa(jLabel8PizzaMexicana, jLabel48NomeMexicana, "frango,calabresa,pimenta", "24.99",1,2);
    }//GEN-LAST:event_jLabel8PizzaMexicanaMouseClicked
    private void jLabel9PortuguesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9PortuguesaMouseClicked
        mostrarCaixa(jLabel9Portuguesa, jLabel15nomePortuguesa, "frango,calabresa,pimenta", "49.99",1,3);
    }//GEN-LAST:event_jLabel9PortuguesaMouseClicked
    private void jLabel10MuçaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MuçaMouseClicked
        mostrarCaixa(jLabel10Muça, jLabel16NomeMuça, "frango,calabresa,pimenta", "45.99",1,4);
    }//GEN-LAST:event_jLabel10MuçaMouseClicked
    private void jLabel11FrangoCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11FrangoCapMouseClicked
        mostrarCaixa(jLabel11FrangoCap, jLabel43FranCatuNome, "frango,calabresa,pimenta", "24.99",1,5);
    }//GEN-LAST:event_jLabel11FrangoCapMouseClicked
    private void jLabel12NapoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12NapoliMouseClicked
        mostrarCaixa(jLabel12Napoli, jLabel18NapoliNome, "frango,calabresa,pimenta", "24.99",1,6);
    }//GEN-LAST:event_jLabel12NapoliMouseClicked

    private void jLabel7RomeuEjuliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7RomeuEjuliMouseClicked
        mostrarCaixa(jLabel7RomeuEjuli, jLabel13RJNome, "frango,calabresa,pimenta", "24.99",1,7);
    }//GEN-LAST:event_jLabel7RomeuEjuliMouseClicked

    private void jLabel7CarrinhoTelaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7CarrinhoTelaInicialMouseClicked
        CaixaDeCarrinho caixaDeCarrinho = new CaixaDeCarrinho(janelaPrinci, true);
        caixaDeCarrinho.setVisible(true);
    }//GEN-LAST:event_jLabel7CarrinhoTelaInicialMouseClicked

    private void jLabel24CoxinhaFranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24CoxinhaFranMouseClicked
        mostrarCaixa(jLabel24CoxinhaFran, jLabel25CoxinhaDeFrangoNome, "frango,Massa", "1.99",1,14);
    }//GEN-LAST:event_jLabel24CoxinhaFranMouseClicked

    private void jLabel26PastelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26PastelMouseClicked
        mostrarCaixa(jLabel26Pastel, jLabel33PastelNome, "Massa,Recheio", "3.99",1,15);
    }//GEN-LAST:event_jLabel26PastelMouseClicked

    private void jLabel32CoxinhaCopoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32CoxinhaCopoMouseClicked
        mostrarCaixa(jLabel32CoxinhaCopo, jLabel17CoxinhaCopoNome, "Massa,Recheio", "4.99",1,16);
    }//GEN-LAST:event_jLabel32CoxinhaCopoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10Muça;
    private javax.swing.JLabel jLabel11FrangoCap;
    private javax.swing.JLabel jLabel12Napoli;
    private javax.swing.JLabel jLabel13RJNome;
    private javax.swing.JLabel jLabel15nomePortuguesa;
    private javax.swing.JLabel jLabel16NomeMuça;
    private javax.swing.JLabel jLabel17CoxinhaCopoNome;
    private javax.swing.JLabel jLabel18NapoliNome;
    private javax.swing.JLabel jLabel24CoxinhaFran;
    private javax.swing.JLabel jLabel25CoxinhaDeFrangoNome;
    private javax.swing.JLabel jLabel26Pastel;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32CoxinhaCopo;
    private javax.swing.JLabel jLabel33PastelNome;
    private javax.swing.JLabel jLabel34Agua;
    private javax.swing.JLabel jLabel36Suco;
    private javax.swing.JLabel jLabel38Refri;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43FranCatuNome;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48NomeMexicana;
    private javax.swing.JLabel jLabel7CarrinhoTelaInicial;
    private javax.swing.JLabel jLabel7RomeuEjuli;
    private javax.swing.JLabel jLabel8PizzaMexicana;
    private javax.swing.JLabel jLabel9Portuguesa;
    public static javax.swing.JLabel jLabel9QuantiCarrinho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2ProdutosPitsop;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
