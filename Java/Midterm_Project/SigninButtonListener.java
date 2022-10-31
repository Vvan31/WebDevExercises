package Midterm_Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.io.FileWriter;
import java.io.IOException;


public class SigninButtonListener implements ActionListener{

    JTextField user; 
    JPasswordField pass;
    JLabel message; 

    public SigninButtonListener(JTextField user, JPasswordField pass, JLabel message ){
        this.user = user;
        this.pass= pass;
        this.message = message;
    }   
    

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            createUser();
        } catch (Exception error) {
            System.out.println(error);
        }        
    }

    private void createUser() {
        FileWriter myWriter;
        try {
            myWriter = new FileWriter("WebDevExercises/Java/Midterm_Project/users.txt", true);
            myWriter.write(user.getText() + ","+ pass.getText()+"\n");
            myWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }

}
