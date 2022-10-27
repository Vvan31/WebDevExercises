package Midterm_Project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;;

public class LoginButtonListener implements ActionListener{
    JButton button;
    JTextField user;
    JPasswordField password;
    JLabel message;
    JPanel panel;
    JFrame frame;
    public LoginButtonListener(JButton button, JTextField user, JPasswordField cs, JLabel message, JPanel panel, JFrame frame){
        this.button = button; 
        this.user = user;
        this.password = cs;
        this.message = message;
        this.panel = panel;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (user.getText().equals("vv") && password.getText().equals("123")) {
            message.setText("Welcome!");
            frame.setVisible(true);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            panel.setVisible(false);
            MainFeed mf = new MainFeed(frame, user.getText(),  password.getText());
            mf.createMainFeed();
        } else {
            message.setText("Try again!");
            frame.setVisible(true);
        }
    }
}
