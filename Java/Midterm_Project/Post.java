package Midterm_Project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Post {
    String message;
    String date;

    public Post(){}

    public Post(JFrame frame,String message, String date){
        this.message = message;
        this.date = date;
        createPostGUI(frame);
    }
    private void createPostGUI(JFrame frame){
        try {
            String result = (String)JOptionPane.showInputDialog(
                frame,
                "Your message:", 
                "Say something",            
                JOptionPane.PLAIN_MESSAGE,
                null,            
                null, 
                "Hello!"
            );
            JLabel message = new JLabel(result);
        } catch (Exception e) {
            // TODO: handle exception
        }
       
    }
}
