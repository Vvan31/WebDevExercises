package Midterm_Project;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI {
    private JFrame frame;
    private JPanel panel;
    private ImageIcon icon;

    public GUI(){
        icon = new ImageIcon("rsz_beer.png");
        mainPageSetup();
        createLoginPage();
    }

    private void createLoginPage(){
        
        JLabel icon_label = new JLabel(icon);
        icon_label.setBounds(200, 100, 100, 100);

        JLabel user_label = new JLabel("User: ");
        user_label.setBounds(150,200,80,25);

        JTextField userTextfield = new JTextField(25);
        userTextfield.setBounds(250,200,85,25);

        JLabel password_label = new JLabel("Password: ");
        password_label.setBounds(150,230,80,25);

        JPasswordField passwordTextfield = new JPasswordField(25);
        passwordTextfield.setBounds(250,230,85,25);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(120,450,300,25);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150,300,80,25);
        loginButton.addActionListener(new LoginButtonListener(
            loginButton, 
            userTextfield, 
            passwordTextfield,
            messageLabel,
            panel,
            frame
        ));

        JButton signinButton = new JButton("Sign in");
        signinButton.setBounds(245,300,100,25);
        signinButton.addActionListener(new SigninButtonListener(
            userTextfield, 
            passwordTextfield,
            messageLabel
        ));
        panel.add(icon_label);
        //frame.setVisible(true);

        panel.add(user_label);
        panel.add(password_label);
        panel.add(userTextfield);
        panel.add(passwordTextfield);
        panel.add(messageLabel);

        panel.add(loginButton);
        panel.add(signinButton);
        

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
            frame.add(panel);
            panel.setBackground(Color.lightGray);
            frame.setVisible(true);


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
