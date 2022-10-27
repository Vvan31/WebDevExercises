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
            createJsonUser();
        } catch (Exception error) {
            // TODO: handle exception
            System.out.println(error);
        }        
    }


    private void createJsonUser() {
        FileWriter myWriter;
        try {
            myWriter = new FileWriter("users.txt", true);
            myWriter.write(user.getText() + ","+ pass.getText()+"\n");
            myWriter.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }

}
