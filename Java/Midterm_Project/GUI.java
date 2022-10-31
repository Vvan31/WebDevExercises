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
import javax.swing.WindowConstants;

public class GUI {
    private JFrame frame;
    private JPanel panel;
    private ImageIcon icon;

    public GUI(){
        // Declaration of image here because of rendering times. 
        icon = new ImageIcon("WebDevExercises/Java/Midterm_Project/img/rsz_beer.png");
        mainPageSetup();
        createLoginPage();
    }

    private void createLoginPage(){
        // GUI components: Label, Buttons, Textfields. 
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

        JButton signInButton = new JButton("Sign in");
        signInButton.setBounds(245,300,100,25);
        signInButton.addActionListener(new SigninButtonListener(
            userTextfield, 
            passwordTextfield,
            messageLabel
        ));
        // Add the components to the main panel. 
        panel.add(icon_label);
        panel.add(user_label);
        panel.add(password_label);
        panel.add(userTextfield);
        panel.add(passwordTextfield);
        panel.add(messageLabel);
        panel.add(loginButton);
        panel.add(signInButton);
        // Acts like a refresh for all the components to show up. 
        frame.setVisible(true);
    }

    private void mainPageSetup() {
        try {
            panel = new JPanel();
            panel.setLayout(null);
            panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
            panel.setBackground(Color.lightGray);

            frame = new JFrame();
            frame.setSize(500,600);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setTitle("Trauma dumping");
            frame.add(panel);
            frame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new GUI();
    }
}
