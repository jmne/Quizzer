/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.group.gui;

import src.main.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/**
 * @author pasca
 */
public class startbild extends javax.swing.JFrame {

    private String pass = null;
    private String ben = null;
    private String Spass = "menne";
    private String Sben = "jan";
    private String Spass1 = null;
    private String Spass2 = null;
    private ImageIcon pic2;
    private ImageIcon pic1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel einlogg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel registrieren;
    private javax.swing.JPanel strt;

    /**
     * Creates new form startbild
     */
    public startbild() {
        initComponents();
        //this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = 1280;
        int ysize = 1024;
        this.setSize(xsize, ysize);
        mysettings();
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
            java.util.logging.Logger.getLogger(startbild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startbild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startbild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startbild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startbild().setVisible(true);
            }
        });
    }

    private void mysettings() {
        strt.setVisible(false);
        einlogg.setVisible(false);
        registrieren.setVisible(true);
        //setIconImage(new Image(Objects.requireNonNull(getClass().getClassLoader().getResource("Fertiges.mini.logo.png")).getFile()));
        pic2 = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Fertiges.mini.logo.png")).getFile());
        pic1 = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Fertiges.mini.logo.png")).getFile());

    }

    private void einloggen() throws NoSuchAlgorithmException {
        ben = jTextField1.getText();
        pass = String.valueOf(jPasswordField1.getPassword());
        if (Main.user.loginBenutzer(ben, pass, Main.control.connector)) {
            // dispose();
            NewJFrame quiz = new NewJFrame();
            quiz.setVisible(true);
            this.dispose();

            System.out.println(ben + "  " + pass + "  Jo");

        } else {
            System.out.println(pass);
            System.out.println(ben);
            //dispose();
            jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
            jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
            jPasswordField1.setText(null);
        }
    }

    private void regist() {
        Spass1 = String.valueOf(jPasswordField2.getPassword());
        Spass2 = String.valueOf(jPasswordField3.getPassword());
        if (Spass1.equals(Spass2)) {
            Spass = Spass1;
            Sben = jTextField2.getText();
            registrieren.setVisible(false);
            strt.setVisible(false);
        } else {
            jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
            jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
            jPasswordField2.setText(null);
            jPasswordField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
            jPasswordField3.setText(null);
            jPasswordField2.requestFocusInWindow();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        einlogg = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        strt = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        registrieren = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        einlogg.setBackground(new java.awt.Color(255, 255, 255));
        einlogg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // jLabel5.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Fertiges.mini.logo.png")).getFile()));
        einlogg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        einlogg.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 300, -1));

        jPasswordField1.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                try {
                    jPasswordField1KeyPressed(evt);
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
        });
        einlogg.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 300, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Benutzername:");
        einlogg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Passwort:");
        einlogg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, -1, -1));

        jButton1.setText("Anmelden");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
        });
        einlogg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 700, 300, 60));

        getContentPane().add(einlogg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1024));

        strt.setBackground(new java.awt.Color(255, 255, 255));
        strt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //jLabel3.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Fertiges.mini.logo.png")).getFile()));
        strt.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jButton2.setText("Registrieren");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        strt.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, 300, 60));

        jButton3.setText("Anmelden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        strt.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 300, 60));

        jButton4.setText("Schließen");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        strt.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 690, 300, 60));

        getContentPane().add(strt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1024));

        registrieren.setBackground(new java.awt.Color(255, 255, 255));
        registrieren.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // jLabel7.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Fertiges.mini.logo.png")).getFile()));
        registrieren.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        registrieren.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 300, -1));

        jPasswordField2.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });
        registrieren.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 300, -1));

        jPasswordField3.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyPressed(evt);
            }
        });
        registrieren.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 300, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Benutzername:");
        registrieren.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Passwort:");
        registrieren.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Passwort wiederholen:");
        registrieren.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 680, -1, -1));

        jButton5.setText("Registrieren");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        registrieren.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 800, 300, 60));

        getContentPane().add(registrieren, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1024));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) throws NoSuchAlgorithmException {//GEN-FIRST:event_jPasswordField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            einloggen();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField1.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField2.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField3.requestFocusInWindow();
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jPasswordField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            regist();
        }
    }//GEN-LAST:event_jPasswordField3KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws NoSuchAlgorithmException {//GEN-FIRST:event_jButton1ActionPerformed
        einloggen();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        strt.setVisible(false);
        einlogg.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        strt.setVisible(false);
        registrieren.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        regist();
    }//GEN-LAST:event_jButton5ActionPerformed
    // End of variables declaration//GEN-END:variables
}
