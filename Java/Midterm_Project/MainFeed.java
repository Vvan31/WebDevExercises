package Midterm_Project;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

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
        scrollPanel.setLayout(new BoxLayout(scrollPanel, BoxLayout.PAGE_AXIS));
        scrollPanel.setPreferredSize( new Dimension(500, 450));
        scrollPanel.setBackground(Color.getHSBColor(80, 50, 90)); 
        scrollPanel.setBounds(10, 100,300,300);
    }

    void createMainFeed() {
        JLabel user_label = new JLabel("Welcome " + user);
        user_label.setBounds(10,20,80,25);

        JButton options = new JButton("Options");
        options.setBounds(450,20,60,25);
        options.addActionListener(new OptionsButtonListener(user, pass, frame, scrollPanel));

        JTextField userTextfield = new JTextField(25);
        userTextfield.setBounds(10,500,150,100);

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
        for (int i = 0; i < 230; i++) {
            addPost("Hola  -"+user+"\n", scrollPanel);
        }
        JScrollPane scroll = new JScrollPane(scrollPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setPreferredSize( new Dimension(450, 400));
        mainPanel.add(scroll);
    }

    private void addPost(String msg, JPanel scroll) {
        JLabel label = new JLabel(msg);
        label.setAlignmentX(scroll.LEFT_ALIGNMENT);
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        scroll.add(label);
    }

}
