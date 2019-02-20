package group.utils;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Gui extends JFrame {

    private JPanel contentPane;
    private JRadioButton rdbtnAntwort1;
    private JRadioButton rdbtnAntwort2;
    private JRadioButton rdbtnAntwort3;
    private JRadioButton rdbtnAntwort4;
    private JLabel lblFrage;
    private CardLayout cl;

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

        JButton btnNewButton_2 = new JButton("Spielen");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.next(contentPane);
            }
        });
        btnNewButton_2.setBounds(158, 109, 121, 38);
        home.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Statistik");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.show(contentPane, "Statistik");
            }
        });
        btnNewButton_3.setBounds(158, 158, 121, 38);
        home.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Einstellungen");
        btnNewButton_4.setBounds(158, 207, 121, 38);
        home.add(btnNewButton_4);

        JLabel lblDasBesteGui = new JLabel("Das beste Gui EUW");
        lblDasBesteGui.setHorizontalAlignment(SwingConstants.CENTER);
        lblDasBesteGui.setBounds(119, 48, 196, 14);
        home.add(lblDasBesteGui);

        JPanel Guiselect = new JPanel();
        contentPane.add(Guiselect, "name_1495728047919");
        Guiselect.setLayout(null);

        JButton btnNewButton_5 = new JButton("Normales Gui");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.next(contentPane);
            }
        });
        btnNewButton_5.setBounds(148, 108, 124, 40);
        Guiselect.add(btnNewButton_5);

        JButton btnNewButton_6 = new JButton("Intelligentes Gui");
        btnNewButton_6.setBounds(148, 175, 124, 40);
        Guiselect.add(btnNewButton_6);

        JPanel Gui = new JPanel();
        contentPane.add(Gui, "name_643954445339");
        Gui.setLayout(null);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setMaximum(10);
        progressBar.setBounds(10, 299, 414, 36);
        Gui.add(progressBar);

        JButton btnBestätigen = new JButton("Best\u00E4tigen");
        btnBestätigen.setBounds(154, 248, 112, 36);
        Gui.add(btnBestätigen);

        rdbtnAntwort1 = new JRadioButton("New radio button");
        rdbtnAntwort1.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnAntwort1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdbtnAntwort1.isSelected())
                {
                    rdbtnAntwort2.setSelected(false);
                    rdbtnAntwort3.setSelected(false);
                    rdbtnAntwort4.setSelected(false);
                }
            }
        });
        rdbtnAntwort1.setBounds(10, 96, 414, 23);
        Gui.add(rdbtnAntwort1);

        rdbtnAntwort2 = new JRadioButton("New radio button");
        rdbtnAntwort2.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnAntwort2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdbtnAntwort2.isSelected())
                {
                    rdbtnAntwort1.setSelected(false);
                    rdbtnAntwort3.setSelected(false);
                    rdbtnAntwort4.setSelected(false);
                }
            }
        });
        rdbtnAntwort2.setBounds(10, 122, 414, 23);
        Gui.add(rdbtnAntwort2);

        rdbtnAntwort3 = new JRadioButton("New radio button");
        rdbtnAntwort3.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnAntwort3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdbtnAntwort3.isSelected())
                {
                    rdbtnAntwort2.setSelected(false);
                    rdbtnAntwort1.setSelected(false);
                    rdbtnAntwort4.setSelected(false);
                }
            }
        });
        rdbtnAntwort3.setBounds(10, 148, 414, 23);
        Gui.add(rdbtnAntwort3);

        rdbtnAntwort4 = new JRadioButton("New radio button");
        rdbtnAntwort4.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnAntwort4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdbtnAntwort4.isSelected())
                {
                    rdbtnAntwort2.setSelected(false);
                    rdbtnAntwort3.setSelected(false);
                    rdbtnAntwort1.setSelected(false);
                }
            }
        });
        rdbtnAntwort4.setBounds(10, 174, 414, 23);
        Gui.add(rdbtnAntwort4);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(188, 215, 46, 14);
        Gui.add(lblNewLabel);

        JButton btnBackHome = new JButton("Hauptmen\u00FC");
        btnBackHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.show(contentPane, "Home");
            }
        });
        btnBackHome.setBounds(10, 11, 122, 29);
        Gui.add(btnBackHome);

        lblFrage = new JLabel("New label");
        lblFrage.setHorizontalAlignment(SwingConstants.CENTER);
        lblFrage.setBounds(10, 55, 414, 34);
        Gui.add(lblFrage);

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
        contentPane.add(settings, "name_5202597872108");
    }
}
