package Midterm_Project;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MainFeed {
    JFrame frame;
    JPanel panel;
    String user;
    String pass;

    public MainFeed(JFrame frame, String user, String pass) {
        this.frame = frame;
        this.user = user;
        this.pass = pass;
        createPanel();
    }

    private void createPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        frame.add(panel);
        panel.setBackground(Color.getHSBColor(44, 35, 90));    
    }

    void createMainFeed() {
        JLabel user_label = new JLabel("Welcome " + user);
        user_label.setBounds(10,20,80,25);

        JTextField userTextfield = new JTextField(25);
        userTextfield.setBounds(10,450,150,25);

        panel.add(user_label);


        JPanel scrollPanel = new JPanel();
        scrollPanel.setPreferredSize(new Dimension(460, 100));
        scrollPanel.setMaximumSize(new Dimension(460, 100));
        scrollPanel.setBounds(10, 40, 460, 300);
        createContentPanel(scrollPanel);
        panel.add(userTextfield);

        frame.setVisible(true);
    }

    private void createContentPanel(JPanel scrollPanel) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setMaximumSize(new Dimension(460, 100));

        JScrollPane scroll = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setMaximumSize(new Dimension(460, 100));
        frame.add(scroll);
        frame.setMaximumSize(new Dimension(460, 300));
        frame.setVisible(true);
        for (int i = 0; i < 80; i++) {
            addPost("Hola");
        }

        frame.setVisible(true);
    }

    private void addPost(String msg) {
        JLabel label = new JLabel(msg);
        label.setAlignmentX(panel.RIGHT_ALIGNMENT);
        panel.add(label);
    }

}
