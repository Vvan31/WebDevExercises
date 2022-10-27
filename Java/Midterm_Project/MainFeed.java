package Midterm_Project;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MainFeed {
    JFrame frame;
    JPanel mainPanel;
    JPanel scrollPanel;
    String user;
    String pass;

    public MainFeed(JFrame frame, String user, String pass) {
        this.frame = frame;
        this.user = user;
        this.pass = pass;
        createPanel();
    }

    private void createPanel() {
        mainPanel =  new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        mainPanel.setBackground(Color.getHSBColor(44, 35, 90)); 

        scrollPanel = new JPanel();
        scrollPanel.setPreferredSize( new Dimension(400, 200));
        scrollPanel.setBackground(Color.getHSBColor(80, 50, 90)); 
        scrollPanel.setBounds(10, 100,300,300);
    }

    void createMainFeed() {
        JLabel user_label = new JLabel("Welcome " + user);
        user_label.setBounds(10,20,80,25);

        JButton options = new JButton("Options");
        options.setBounds(450,20,60,25);
        options.addActionListener(new OptionsButtonListener(user, pass, frame));

        JTextField userTextfield = new JTextField(25);
        userTextfield.setBounds(10,500,150,50);

        JButton postBtn = new JButton("Submit");
        options.setBounds(450,500,60,25);

        mainPanel.add(user_label);
        mainPanel.add(options);

        //mainPanel.add(scrollPanel);

        createContentPanel();

        mainPanel.add(userTextfield);
        mainPanel.add(postBtn);
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private void createContentPanel() {

        //JScrollPane scroll = new JScrollPane(scrollPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JScrollPane scroll = new JScrollPane(scrollPanel);
        for (int i = 0; i < 80; i++) {
            addPost("Hola", scroll);
        }
        //scrollPanel.add(scroll);
        mainPanel.add(scrollPanel);
    }

    private void addPost(String msg, JScrollPane scroll) {
        JLabel label = new JLabel(msg);
        label.setAlignmentX(scroll.RIGHT_ALIGNMENT);
        scroll.add(label);
    }

}
