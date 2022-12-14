package blackJack;

public class BlackJackFrame extends javax.swing.JFrame {

    BlackJack bj = new BlackJack();

    public BlackJackFrame() {
        bj.newDeck();
        bj.newGame();
        initComponents();
        updateAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        newGameBtn = new javax.swing.JButton();
        standBtn = new javax.swing.JButton();
        hitBtn = new javax.swing.JButton();
        doubleDownBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        messageLabel = new javax.swing.JLabel();
        playerChips = new javax.swing.JLabel();
        playerLabel = new javax.swing.JLabel();
        playerHand = new javax.swing.JLabel();
        playerTotal = new javax.swing.JLabel();
        dealerTotal = new javax.swing.JLabel();
        dealerHand = new javax.swing.JLabel();
        dealerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        homeMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        gameMenu = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Blackjack");
        setMinimumSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);

        newGameBtn.setText("New Game");
        newGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newGameBtn);
        newGameBtn.setBounds(40, 370, 90, 23);

        standBtn.setText("Stand");
        standBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standBtnActionPerformed(evt);
            }
        });
        getContentPane().add(standBtn);
        standBtn.setBounds(230, 320, 70, 23);

        hitBtn.setText("Hit");
        hitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(hitBtn);
        hitBtn.setBounds(160, 320, 50, 23);

        doubleDownBtn.setText("Double Down");
        doubleDownBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleDownBtnActionPerformed(evt);
            }
        });
        getContentPane().add(doubleDownBtn);
        doubleDownBtn.setBounds(320, 320, 110, 23);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(150, 310, 290, 40);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(100, 140, 400, 20);

        messageLabel.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 204, 153));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("You win/lose");
        getContentPane().add(messageLabel);
        messageLabel.setBounds(50, 260, 490, 60);

        playerChips.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        playerChips.setForeground(new java.awt.Color(255, 255, 255));
        playerChips.setText("Chips:");
        playerChips.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(playerChips);
        playerChips.setBounds(460, 320, 130, 20);

        playerLabel.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        playerLabel.setForeground(new java.awt.Color(255, 255, 255));
        playerLabel.setText("Your hand:");
        getContentPane().add(playerLabel);
        playerLabel.setBounds(130, 140, 140, 40);

        playerHand.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        playerHand.setForeground(new java.awt.Color(255, 255, 255));
        playerHand.setText("Seven of Diamonds");
        playerHand.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(playerHand);
        playerHand.setBounds(240, 150, 170, 120);

        playerTotal.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        playerTotal.setForeground(new java.awt.Color(255, 255, 255));
        playerTotal.setText("Total: ");
        playerTotal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(playerTotal);
        playerTotal.setBounds(390, 240, 70, 20);

        dealerTotal.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        dealerTotal.setForeground(new java.awt.Color(255, 255, 255));
        dealerTotal.setText("Total: ");
        dealerTotal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(dealerTotal);
        dealerTotal.setBounds(390, 120, 70, 20);

        dealerHand.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        dealerHand.setForeground(new java.awt.Color(255, 255, 255));
        dealerHand.setText(bj.toString(bj.getDealerHand()));
        dealerHand.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(dealerHand);
        dealerHand.setBounds(240, 30, 170, 120);

        dealerLabel.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        dealerLabel.setForeground(new java.awt.Color(255, 255, 255));
        dealerLabel.setText("Dealer's hand:");
        getContentPane().add(dealerLabel);
        dealerLabel.setBounds(100, 20, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/BlackJackTable.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 440);

        fileMenu.setText("File");

        homeMenuItem.setText("Home");
        homeMenuItem.setToolTipText("");
        homeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(homeMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        gameMenu.setText("Game");
        jMenuBar1.add(gameMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>

    private void homeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void doubleDownBtnActionPerformed(java.awt.event.ActionEvent evt) {
        bj.doubleDown();
        updateAll();
    }

    private void hitBtnActionPerformed(java.awt.event.ActionEvent evt) {
        bj.hit();
        updateAll();
    }

    private void standBtnActionPerformed(java.awt.event.ActionEvent evt) {
        bj.stand();
        updateAll();
    }


    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {
        bj.newGame();
        updateAll();
        hitBtn.setEnabled(true);
        standBtn.setEnabled(true);
        doubleDownBtn.setEnabled(true);
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
            java.util.logging.Logger.getLogger(BlackJackFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackJackFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackJackFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackJackFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new BlackJackFrame().setVisible(true);

            }
        });
    }


    public void updateAll() {
        dealerHand.setText(bj.dealerToString(bj.getDealerHand()));
        playerHand.setText(bj.toString(bj.getPlayerHand()));
        playerTotal.setText("Total: " + bj.handValue(bj.getPlayerHand()));
        playerChips.setText("Chips: " + bj.getChips());
        messageLabel.setText(bj.getResult());
        doubleDownBtn.setEnabled(bj.isFirstTurn());

        if (bj.getPlayerHandValue() >= 21) {
            hitBtn.setEnabled(false);
        }
        if (bj.isEndHand()) {
            dealerTotal.setText("Total: " + bj.handValue(bj.getDealerHand()));
            standBtn.setEnabled(false);
            hitBtn.setEnabled(false);
            doubleDownBtn.setEnabled(false);
            newGameBtn.setEnabled(true);
        } else {
            dealerTotal.setText("Total: ???");
            newGameBtn.setEnabled(false);
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel dealerHand;
    private javax.swing.JLabel dealerLabel;
    private javax.swing.JLabel dealerTotal;
    private javax.swing.JButton doubleDownBtn;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu gameMenu;
    private javax.swing.JButton hitBtn;
    private javax.swing.JMenuItem homeMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton newGameBtn;
    private javax.swing.JLabel playerChips;
    private javax.swing.JLabel playerHand;
    private javax.swing.JLabel playerLabel;
    private javax.swing.JLabel playerTotal;
    private javax.swing.JButton standBtn;
    // End of variables declaration
}
