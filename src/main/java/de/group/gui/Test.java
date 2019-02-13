package de.group.gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;

public class Test {
    public Test() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Jan Apre
        Quizzer = new JSplitPane();
        scrollPane1 = new JScrollPane();
        tree1 = new JTree();
        panel1 = new JPanel();
        layeredPane1 = new JLayeredPane();
        label1 = new JLabel();

        //======== Test ========
        {
            Quizzer.setMinimumSize(new Dimension(700, 700));
            Quizzer.setPreferredSize(new Dimension(1000, 562));

            //======== scrollPane1 ========
            {

                //---- tree1 ----
                tree1.setPreferredSize(new Dimension(150, 72));
                scrollPane1.setViewportView(tree1);
            }
            Quizzer.setLeftComponent(scrollPane1);

            //======== panel1 ========
            {
                panel1.setPreferredSize(new Dimension(300, 200));

                // JFormDesigner evaluation mark
                panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

                panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

                //======== layeredPane1 ========
                {
                    layeredPane1.setBackground(new Color(51, 51, 51));
                    layeredPane1.setForeground(Color.white);
                    layeredPane1.setBorder(null);

                    //---- label1 ----
                    label1.setText("text");
                    label1.setBackground(new Color(51, 51, 51));
                    label1.setHorizontalAlignment(SwingConstants.CENTER);
                    layeredPane1.add(label1, JLayeredPane.DEFAULT_LAYER);
                    label1.setBounds(145, 140, 255, label1.getPreferredSize().height);
                }
                panel1.add(layeredPane1);
            }
            Quizzer.setRightComponent(panel1);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Jan Apre
    private JSplitPane Quizzer;
    private JScrollPane scrollPane1;
    private JTree tree1;
    private JPanel panel1;
    private JLayeredPane layeredPane1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
