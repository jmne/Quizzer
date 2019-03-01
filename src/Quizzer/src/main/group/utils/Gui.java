package src.main.group.utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {

    private JPanel contentPane;
    private JRadioButton rdbtnAntwort1;
    private JRadioButton rdbtnAntwort2;
    private JRadioButton rdbtnAntwort3;
    private JRadioButton rdbtnAntwort4;
    private JLabel lblFrage;
    private CardLayout cl;

    /**
     * Create the frame.
     */

    public Gui() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 384);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        cl = new CardLayout(0, 0);
        contentPane.setLayout(cl);

        JPanel home = new JPanel();
        contentPane.add(home, "Home");
        home.setLayout(null);

        JButton btnPlay = new JButton("Spielen");
        btnPlay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(contentPane, "Quizselect");
            }
        });
        btnPlay.setBounds(158, 109, 121, 38);
        home.add(btnPlay);

        JButton btnNewButton_3 = new JButton("Statistik");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.show(contentPane, "Statistik");
            }
        });
        btnNewButton_3.setBounds(158, 158, 121, 38);
        home.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Einstellungen");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.show(contentPane, "Settings");
            }
        });
        btnNewButton_4.setBounds(158, 207, 121, 38);
        home.add(btnNewButton_4);

        JLabel lblDasBesteQuiz = new JLabel("Das beste Quiz EUW");
        lblDasBesteQuiz.setHorizontalAlignment(SwingConstants.CENTER);
        lblDasBesteQuiz.setBounds(119, 48, 196, 14);
        home.add(lblDasBesteQuiz);

        JPanel quizselect = new JPanel();
        contentPane.add(quizselect, "Quizselect");
        quizselect.setLayout(null);

        JButton btnNewButton_5 = new JButton("Normales Quiz");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(contentPane, "NormalQuiz");
            }
        });
        btnNewButton_5.setBounds(158, 109, 121, 38);
        quizselect.add(btnNewButton_5);

        JButton btnNewButton_6 = new JButton("Intelligentes Quiz");
        btnNewButton_6.setHorizontalAlignment(SwingConstants.TRAILING);
        btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(contentPane, "IntQuiz");
            }
        });
        btnNewButton_6.setBounds(158, 158, 121, 38);
        quizselect.add(btnNewButton_6);

        JPanel quiz = new JPanel();
        contentPane.add(quiz, "NormalQuiz");
        quiz.setLayout(null);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setMaximum(10);
        progressBar.setBounds(10, 299, 414, 36);
        quiz.add(progressBar);

        JButton btnBestätigen = new JButton("Best\u00E4tigen");
        btnBestätigen.setBounds(154, 248, 112, 36);
        quiz.add(btnBestätigen);

        rdbtnAntwort1 = new JRadioButton("New radio button");
        rdbtnAntwort1.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnAntwort1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnAntwort1.isSelected()) {
                    rdbtnAntwort2.setSelected(false);
                    rdbtnAntwort3.setSelected(false);
                    rdbtnAntwort4.setSelected(false);
                }
            }
        });
        rdbtnAntwort1.setBounds(10, 96, 414, 23);
        quiz.add(rdbtnAntwort1);

        rdbtnAntwort2 = new JRadioButton("New radio button");
        rdbtnAntwort2.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnAntwort2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnAntwort2.isSelected()) {
                    rdbtnAntwort1.setSelected(false);
                    rdbtnAntwort3.setSelected(false);
                    rdbtnAntwort4.setSelected(false);
                }
            }
        });
        rdbtnAntwort2.setBounds(10, 122, 414, 23);
        quiz.add(rdbtnAntwort2);

        rdbtnAntwort3 = new JRadioButton("New radio button");
        rdbtnAntwort3.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnAntwort3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnAntwort3.isSelected()) {
                    rdbtnAntwort2.setSelected(false);
                    rdbtnAntwort1.setSelected(false);
                    rdbtnAntwort4.setSelected(false);
                }
            }
        });
        rdbtnAntwort3.setBounds(10, 148, 414, 23);
        quiz.add(rdbtnAntwort3);

        rdbtnAntwort4 = new JRadioButton("New radio button");
        rdbtnAntwort4.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnAntwort4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnAntwort4.isSelected()) {
                    rdbtnAntwort2.setSelected(false);
                    rdbtnAntwort3.setSelected(false);
                    rdbtnAntwort1.setSelected(false);
                }
            }
        });
        rdbtnAntwort4.setBounds(10, 174, 414, 23);
        quiz.add(rdbtnAntwort4);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 215, 414, 14);
        quiz.add(lblNewLabel);

        JButton btnBackHome = new JButton("Hauptmen\u00FC");
        btnBackHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.show(contentPane, "Home");
            }
        });
        btnBackHome.setBounds(10, 11, 122, 29);
        quiz.add(btnBackHome);

        lblFrage = new JLabel("New label");
        lblFrage.setHorizontalAlignment(SwingConstants.CENTER);
        lblFrage.setBounds(10, 55, 414, 34);
        quiz.add(lblFrage);

        JPanel intQuiz = new JPanel();
        contentPane.add(intQuiz, "IntQuiz");
        intQuiz.setLayout(null);

        JPanel statistik = new JPanel();
        contentPane.add(statistik, "Statistik");
        statistik.setLayout(null);

        JButton btnBackHome2 = new JButton("Hauptmen\u00FC");
        btnBackHome2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.show(contentPane, "Home");
            }
        });
        statistik.setLayout(null);
        btnBackHome2.setBounds(10, 11, 122, 29);
        statistik.add(btnBackHome2);

        JPanel settings = new JPanel();
        contentPane.add(settings, "Settings");
        settings.setLayout(null);

        JButton btnBackHome3 = new JButton("Hauptmen\u00FC");
        btnBackHome3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.show(contentPane, "Home");
            }
        });
        btnBackHome3.setBounds(10, 11, 122, 29);
        settings.add(btnBackHome3);

        JButton btnBackHome4 = new JButton("Hauptmen\u00FC");
        btnBackHome4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.show(contentPane, "Home");
            }
        });
        btnBackHome4.setBounds(10, 11, 122, 29);
        quizselect.add(btnBackHome4);

        JButton btnBackHome5 = new JButton("Hauptmen\u00FC");
        btnBackHome5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.show(contentPane, "Home");
            }
        });
        btnBackHome5.setBounds(10, 11, 122, 29);
        intQuiz.add(btnBackHome5);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Gui frame = new Gui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}