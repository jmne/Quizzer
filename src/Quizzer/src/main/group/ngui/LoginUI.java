/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

package src.main.group.ngui;

import src.main.Main;
import src.main.group.gui.NewJFrame;
import src.main.group.gui.startbild;
import src.main.group.handlers.GameState;
import src.main.group.ngui.Toaster.Toaster;
import src.main.group.ngui.Utils.HyperlinkText;
import src.main.group.ngui.Utils.TextFieldPassword;
import src.main.group.ngui.Utils.TextFieldUsername;
import src.main.group.ngui.Utils.UIUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class LoginUI extends JFrame {

    private final Toaster toaster;
    JFrame th = this;
    private TextFieldUsername usernameField;
    private TextFieldPassword passwordField;

    public LoginUI() {
        JPanel mainJPanel = getMainJPanel();

        addLogo(mainJPanel);

        addSeparator(mainJPanel);

        addUsernameTextField(mainJPanel);

        addPasswordTextField(mainJPanel);

        addLoginButton(mainJPanel);

        addForgotPasswordButton(mainJPanel);

        addRegisterButton(mainJPanel);

        this.add(mainJPanel);
        this.pack();
        this.setVisible(true);
        this.toFront();


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width / 2 - getWidth() / 2, screenSize.height / 2 - getHeight() / 2);

        toaster = new Toaster(mainJPanel);
    }

    public static void main(String[] args) {
        new LoginUI();
    }

    private JPanel getMainJPanel() {
        this.setUndecorated(false);

        Dimension size = new Dimension(800, 400);

        JPanel panel1 = new JPanel();
        panel1.setSize(size);
        panel1.setPreferredSize(size);
        panel1.setBackground(UIUtils.COLOR_BACKGROUND);
        panel1.setLayout(null);

        MouseAdapter ma = new MouseAdapter() {
            int lastX, lastY;

            @Override
            public void mousePressed(MouseEvent e) {
                lastX = e.getXOnScreen();
                lastY = e.getYOnScreen();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                setLocation(getLocationOnScreen().x + x - lastX, getLocationOnScreen().y + y - lastY);
                lastX = x;
                lastY = y;
            }
        };

        panel1.addMouseListener(ma);
        panel1.addMouseMotionListener(ma);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        return panel1;
    }

    private void addSeparator(JPanel panel1) {
        JSeparator separator1 = new JSeparator();
        separator1.setOrientation(SwingConstants.VERTICAL);
        separator1.setForeground(UIUtils.COLOR_OUTLINE);
        panel1.add(separator1);
        separator1.setBounds(310, 80, 1, 240);
    }

    private void addLogo(JPanel panel1) {
        JLabel label1 = new JLabel();
        label1.setFocusable(false);
        panel1.add(label1);
        label1.setBounds(130, 106, 200, 150);
        label1.setFont(new java.awt.Font("Verdana", 0, 80));
        label1.setText("Q");
        label1.setForeground(Color.white);
    }

    private void addUsernameTextField(JPanel panel1) {
        usernameField = new TextFieldUsername();

        usernameField.setBounds(423, 109, 250, 44);
        usernameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usernameField.getText().equals(UIUtils.PLACEHOLDER_TEXT_USERNAME)) {
                    usernameField.setText("");
                }
                usernameField.setForeground(Color.white);
                usernameField.setBorderColor(UIUtils.COLOR_INTERACTIVE);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usernameField.getText().isEmpty()) {
                    usernameField.setText(UIUtils.PLACEHOLDER_TEXT_USERNAME);
                }
                usernameField.setForeground(UIUtils.COLOR_OUTLINE);
                usernameField.setBorderColor(UIUtils.COLOR_OUTLINE);
            }
        });

        panel1.add(usernameField);
    }

    private void addPasswordTextField(JPanel panel1) {
        passwordField = new TextFieldPassword();
        passwordField.setText("Password");
        passwordField.setForeground(UIUtils.COLOR_OUTLINE);
        passwordField.setBorderColor(UIUtils.COLOR_OUTLINE);
        passwordField.setBounds(423, 168, 250, 44);
        passwordField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                passwordField.setForeground(Color.white);
                passwordField.setBorderColor(UIUtils.COLOR_INTERACTIVE);
                if (passwordField.getText().equalsIgnoreCase("Password")) {
                    passwordField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                passwordField.setForeground(UIUtils.COLOR_OUTLINE);
                passwordField.setBorderColor(UIUtils.COLOR_OUTLINE);
                if (passwordField.getText().isEmpty()) {
                    passwordField.setText("Password");
                }
            }
        });

        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER)
                    loginEventHandler();
            }
        });

        panel1.add(passwordField);
    }

    private void addLoginButton(JPanel panel1) {
        final Color[] loginButtonColors = {UIUtils.COLOR_INTERACTIVE, Color.white};

        JLabel loginButton = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = UIUtils.get2dGraphics(g);
                super.paintComponent(g2);

                Insets insets = getInsets();
                int w = getWidth() - insets.left - insets.right;
                int h = getHeight() - insets.top - insets.bottom;
                g2.setColor(loginButtonColors[0]);
                g2.fillRoundRect(insets.left, insets.top, w, h, UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);

                FontMetrics metrics = g2.getFontMetrics(UIUtils.FONT_GENERAL_UI);
                int x2 = (getWidth() - metrics.stringWidth(UIUtils.BUTTON_TEXT_LOGIN)) / 2;
                int y2 = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g2.setFont(UIUtils.FONT_GENERAL_UI);
                g2.setColor(loginButtonColors[1]);
                g2.drawString(UIUtils.BUTTON_TEXT_LOGIN, x2, y2);
            }
        };

        loginButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                loginEventHandler();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                loginButtonColors[0] = UIUtils.COLOR_INTERACTIVE_DARKER;
                loginButtonColors[1] = UIUtils.OFFWHITE;
                loginButton.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginButtonColors[0] = UIUtils.COLOR_INTERACTIVE;
                loginButtonColors[1] = Color.white;
                loginButton.repaint();
            }
        });

        loginButton.setBackground(UIUtils.COLOR_BACKGROUND);
        loginButton.setBounds(423, 247, 250, 44);
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel1.add(loginButton);
    }

    private void addForgotPasswordButton(JPanel panel1) {
        panel1.add(new HyperlinkText(UIUtils.BUTTON_TEXT_FORGOT_PASS, 423, 300, () -> {
            toaster.error("Pech gehabt (Neuer Account)");
        }));
    }

    private void addRegisterButton(JPanel panel1) {
        panel1.add(new HyperlinkText(UIUtils.BUTTON_TEXT_REGISTER, 631, 300, () -> {
            toaster.success("Bitte das Formular ausfüllen");
            startbild start = new startbild();
        }));
    }

    private void loginEventHandler() {
        if (usernameField.getText() == null || passwordField.getPassword().length < 1 || passwordField.getText().equalsIgnoreCase("Password")) {
            toaster.error("Bitte alle Daten angeben!");
        } else {
            try {
                if (Main.user.loginBenutzer(usernameField.getText(), passwordField.getText(), Main.control.connector)) {
                    toaster.success("Du wirst eingeloggt..");

                    ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);

                    exec.schedule(new Runnable() {
                        public void run() {

                            NewJFrame quiz = new NewJFrame();
                            quiz.setVisible(true);
                            th.dispose();
                            GameState.setState(GameState.MENU);

                        }
                    }, 2, TimeUnit.SECONDS);


                } else {
                    toaster.error("Falsche Daten");
                    passwordField.setText("");
                }
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
    }
}