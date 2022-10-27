package Midterm_Project;


import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI {
    private JFrame frame;
    private JPanel panel;

    public GUI(){
        mainPageSetup();
        createLoginPage();
    }

    private void createLoginPage(){
        JLabel user_label = new JLabel("User: ");
        user_label.setBounds(10,20,80,25);

        JTextField userTextfield = new JTextField(25);
        userTextfield.setBounds(100,20,85,25);

        JLabel password_label = new JLabel("Password: ");
        password_label.setBounds(10,50,80,25);

        JPasswordField passwordTextfield = new JPasswordField(25);
        passwordTextfield.setBounds(100,50,85,25);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(30,150,300,25);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(80,100,80,25);
        loginButton.addActionListener(new LoginButtonListener(
            loginButton, 
            userTextfield, 
            passwordTextfield,
            messageLabel,
            panel,
            frame
        ));
        panel.add(user_label);
        panel.add(password_label);
        panel.add(userTextfield);
        panel.add(passwordTextfield);
        panel.add(messageLabel);

        panel.add(loginButton);

        frame.setVisible(true);
    }

    private void mainPageSetup() {
        try {

            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));

            JFrame frame = new JFrame();
            frame.setSize(500,700);
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.setTitle("Trauma dumping");
            frame.setVisible(true);
            frame.add(panel);
            panel.setBackground(Color.lightGray);

            this.frame = frame;
            this.panel = panel;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new GUI();
    }
    
}
