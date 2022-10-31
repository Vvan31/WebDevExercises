package Midterm_Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PostButtonListener implements ActionListener {
    String user;
    JFrame frame;
    JPanel scroll;
    JTextField message;
    
    public PostButtonListener(String user,JFrame frame,JPanel scrollPanel,JTextField userTextfield){
        this.user = user;
        this.frame = frame; 
        this.scroll = scrollPanel;
        this.message = userTextfield;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        writePostIntoTxtFile();
        message.setText("");
        scroll.removeAll();
        MainFeed.AddPanelContent();
    }
    private void writePostIntoTxtFile() {
        FileWriter myWriter;
        try {
            myWriter = new FileWriter("WebDevExercises/Java/Midterm_Project/posts.txt", true);
            myWriter.write(message.getText()+","+user+"\n");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }

}
