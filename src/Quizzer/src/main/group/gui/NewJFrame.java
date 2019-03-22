/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.group.gui;

import src.main.group.utils.Question;
import src.main.group.utils.Statistik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author pasca
 */
public class NewJFrame extends javax.swing.JFrame {

    private boolean jaja = true;
    private boolean jaja1 = true;
    private boolean ant = false;
    private int rAnt = 0;
    private int text = 0;
    private ImageIcon pic2;
    private ImageIcon pic1;
    private String pass1;
    private String pass2;
    private String pass3;
    private String ben1;
    private String frage = "";
    private String a1 = "";
    private String a2 = "";
    private String a3 = "";
    private String a4 = "";
    private int anzahl = 0;
    private int richtig = 0;
    private Question question;
    private String[] brf;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JPasswordField jPasswordField6;
    private javax.swing.JTextField jTextField1;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        // this.setUndecorated(true);
        // this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = 1280;
        int ysize = 1024;
        this.setSize(xsize, ysize);
        mySettings();


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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    public void pandern() {
        pass1 = String.valueOf(jPasswordField4.getPassword());
        pass2 = String.valueOf(jPasswordField5.getPassword());
        pass3 = String.valueOf(jPasswordField6.getPassword());
        /*
           if(!pass1.equals(pass)){
        jPasswordField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
        jPasswordField4.setText(null);
        } else {
        if(!pass2.equals(pass3)){
        jPasswordField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
        jPasswordField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
        jPasswordField5.setText(null);
        jPasswordField6.setText(null);
        } else {
        pass = pass2;
        }
        }
        */

    }

    public void bander() {
       /* ben1 = jTextField1.getText(){
        if(ben1.equals(ben){
        jTextfield1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
        } else {

        ben = ben1;
        }
        }

        */
    }

    public void mySettings() {
        jButton2.setVisible(false);

        jPanel1.setOpaque(false);
        jPanel5.setVisible(true);
        jPanel4.setVisible(false);
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);
        jPanel13.setVisible(false);
        jPanel5.setVisible(false);
        jPanel10.setVisible(false);


        jPanel15.setVisible(false);
        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.gray));
        jLabel26.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.gray));

        jPanel8.setVisible(true);
        //jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.red));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        jPasswordField5 = new javax.swing.JPasswordField();
        jPasswordField6 = new javax.swing.JPasswordField();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1280, 1024));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(59, 59, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("<<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(59, 59, 61));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 2, 15)); // NOI18N
        jLabel2.setText(frage);
        jLabel2.setHorizontalTextPosition(JLabel.CENTER);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 860, 70));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Frage:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 60, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("" + anzahl);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -3, 70, 20));

        //jLabel3.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Fertiges.mini.logo.png")).getFile()));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 440, 140));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(a1);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 550, 80));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText(a2);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 550, 80));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText(a3);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 550, 80));

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText(a4);
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 550, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1240, 830));

        jButton2.setText("Nächste Frage");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 900, 300, 60));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1024));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1004));

        jPanel4.setBackground(new java.awt.Color(59, 59, 61));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brf = new Statistik().stats;


        jLabel6.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel6.setText("Bearbeitete Fragen:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 360, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Fragen richtig beantwortet :");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel19.setText(brf[0] + "/215");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 375, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel24.setText(brf[1] + "/215");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1240, 964));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1004));

        jPanel8.setBackground(new java.awt.Color(59, 59, 61));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Statistiken");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 310, 60));

        jButton8.setText("Spielen");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 310, 60));

        jButton9.setText("Einstellungen");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 310, 60));

        jPanel8.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1240, 964));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1004));

        jPanel9.setBackground(new java.awt.Color(59, 59, 61));
        jPanel9.setMinimumSize(new java.awt.Dimension(1280, 1004));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setToolTipText("dad");
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(102, 102, 102));
        jLabel25.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel25.setText("-> Benutzernamen ändern");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel25MousePressed(evt);
            }
        });
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        jLabel26.setBackground(new java.awt.Color(102, 102, 102));
        jLabel26.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel26.setText("-> Passwort ändern");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel26MousePressed(evt);
            }
        });
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));
        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1240, 964));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1004));

        jPanel13.setBackground(new java.awt.Color(59, 59, 61));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel27.setText("Neuer Benutzername:");
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 420, -1));

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel11.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 240, -1));

        jButton10.setText("Benutzernamen festlegen");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        jPanel13.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1240, 964));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1024));

        jPanel14.setBackground(new java.awt.Color(59, 59, 61));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel33.setText("Altes Passwort:");
        jPanel15.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 180, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel34.setText("Neues Passwort:");
        jPanel15.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel35.setText("Passwort wiederholen:");
        jPanel15.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, -1));

        jPasswordField4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jPasswordField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField4KeyPressed(evt);
            }
        });
        jPanel15.add(jPasswordField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 310, -1));

        jPasswordField5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jPasswordField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField5KeyPressed(evt);
            }
        });
        jPanel15.add(jPasswordField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 310, -1));

        jPasswordField6.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jPasswordField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField6KeyPressed(evt);
            }
        });
        jPanel15.add(jPasswordField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 310, -1));

        jButton11.setText("Passwort ändern");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, -1, -1));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1240, 964));

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1024));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MousePressed
        jPanel10.setVisible(false);
        jPanel9.setVisible(false);
        jPanel13.setVisible(true);
    }//GEN-LAST:event_jLabel25MousePressed

    private void jLabel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MousePressed
        jPanel10.setVisible(false);
        jPanel9.setVisible(false);
        jPanel15.setVisible(true);
    }//GEN-LAST:event_jLabel26MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //benutzername
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField5.requestFocusInWindow();
        }
    }//GEN-LAST:event_jPasswordField4KeyPressed

    private void jPasswordField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField6.requestFocusInWindow();
        }
    }//GEN-LAST:event_jPasswordField5KeyPressed

    private void jPasswordField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pandern();
        }
    }//GEN-LAST:event_jPasswordField6KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        jPanel5.setVisible(false);
        jPanel13.setVisible(false);
        jPanel15.setVisible(false);

        jPanel8.setVisible(true);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);


        jPanel5.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setVisible(false);

        jaja = true;

        jButton3.setBackground(Color.gray);
        jButton4.setBackground(Color.gray);
        jButton5.setBackground(Color.gray);
        jButton6.setBackground(Color.gray);
        ant = false;

        question = new Question();
        frage = question.getFrage();
        a1 = question.getA1();
        a2 = question.getA2();
        a3 = question.getA3();
        a4 = question.getA4();
        anzahl = anzahl + 1;


        set();
        rAnt = Integer.parseInt(question.getRichtigA());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (ant == false) {
            if (rAnt == 1) {
                richtig = richtig + 1;
                jButton3.setBackground(Color.green);

                question.submit(true);

            } else {
                jButton3.setBackground(Color.red);
                richtigeA();
                question.submit(false);


            }

            jButton2.setVisible(true);

            jaja = false;
            ant = true;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (ant == false) {
            if (rAnt == 2) {
                richtig = richtig + 1;
                question.submit(true);

                jButton4.setBackground(Color.green);
            } else {
                jButton4.setBackground(Color.red);
                richtigeA();
                question.submit(false);

            }

            jButton2.setVisible(true);

            jaja = false;
            ant = true;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (ant == false) {
            if (rAnt == 3) {
                richtig = richtig + 1;
                question.submit(true);

                jButton5.setBackground(Color.green);
            } else {
                jButton5.setBackground(Color.red);
                richtigeA();
                question.submit(false);

            }

            jButton2.setVisible(true);

            jaja = false;
            ant = true;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (ant == false) {
            if (rAnt == 4) {
                richtig = richtig + 1;
                question.submit(true);

                jButton6.setBackground(Color.green);
            } else {
                jButton6.setBackground(Color.red);
                richtigeA();
                question.submit(false);

            }

            jButton2.setVisible(true);

            jaja = false;
            ant = true;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jPanel8.setVisible(false);

        brf = new Statistik().stats;


        jLabel19.setText("12/215");

        jLabel24.setText("7/215");

        set();

        jPanel1.setVisible(true);
        jPanel4.setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jPanel8.setVisible(false);

        question = new Question();
        frage = question.getFrage();
        a1 = question.getA1();
        a2 = question.getA2();
        a3 = question.getA3();
        a4 = question.getA4();
        anzahl = 1;
        richtig = 0;
        rAnt = Integer.parseInt(question.getRichtigA());

        set();

        jPanel5.setVisible(true);
        jPanel1.setVisible(true);


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jPanel8.setVisible(false);
        jPanel1.setVisible(true);
        jPanel10.setVisible(true);
        jPanel9.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //idk

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        pandern();
    }//GEN-LAST:event_jButton11ActionPerformed
    // End of variables declaration//GEN-END:variables

    private void set() {
        jButton3.setText(a1);
        jButton4.setText(a2);
        jButton5.setText(a3);
        jButton6.setText(a4);
        jLabel2.setText(frage);
        jLabel5.setText(anzahl + "/210");


        SwingUtilities.updateComponentTreeUI(this);
        this.invalidate();
        this.validate();
        this.repaint();

    }

    public void richtigeA() {


        if (rAnt == 1) {

            jButton3.setBackground(Color.green);

        } else if (rAnt == 2) {

            jButton4.setBackground(Color.green);

        } else if (rAnt == 3) {

            jButton5.setBackground(Color.green);

        } else if (rAnt == 4) {

            jButton6.setBackground(Color.green);

        }

    }

}

