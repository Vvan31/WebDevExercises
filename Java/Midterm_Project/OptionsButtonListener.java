package Midterm_Project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionsButtonListener implements ActionListener{
    String user;
    String pass; 
    JFrame frame;

    public OptionsButtonListener(String user, String pass, JFrame frame){
        this.user = user; 
        this.pass = pass;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String option =  (String)JOptionPane.showInputDialog(null, "Please select an option: ", "Example 1",
        JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Log out",
            "Change password", "Exit" }, "Do something");
        System.out.println(option);

        switch (option) {
            case "Log out":
                frame.removeAll();
                new GUI();
                break;
            case "Exit":
                System.exit(0);
            case "Change password": 
                System.out.println("aaaa");
        
            default:
                break;
        }
    } 

}
