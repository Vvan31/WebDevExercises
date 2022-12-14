package Midterm_Project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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
        boolean validUser = validateUser();
       
        if (validUser) {
            message.setText("Welcome!");
            frame.setVisible(true);
                // Await 1 second for aesthetic purposes. :)
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e1) {
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
    // Checks if the user and password are valid. Returns boolean.
    private boolean validateUser() {
        // Stores every user, password in HashMap.
        Map<String, String> userCredentials = new HashMap<String, String>();
        try {
            File file = new File("WebDevExercises/Java/Midterm_Project/users.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              // In txt example: Hello,Bob (Message),(User). 
              // Adding Message as the key and user as the value for unique relations. 
              userCredentials.put(data.toString().split(",")[0],data.toString().split(",")[1]);
            }
            myReader.close();
            if(userCredentials.get(user.getText()) != null){
                if (userCredentials.get(user.getText()).equals(password.getText())) {
                    return true;
                } else {
                    return false;
                }
            }

          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        return false;
    }
}
