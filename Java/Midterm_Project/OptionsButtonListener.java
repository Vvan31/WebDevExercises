package Midterm_Project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;

import java.util.Random;

public class OptionsButtonListener implements ActionListener{
    String user;
    String pass; 
    JFrame frame;
    JPanel panel;

    public OptionsButtonListener(String user, String pass, JFrame frame, JPanel panel){
        this.user = user; 
        this.pass = pass;
        this.frame = frame;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String option =  (String)JOptionPane.showInputDialog(null, "Please select an option: ", "Example 1",
        JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Do something","Log out",
            "Change password", "Exit" }, "Do something");
        System.out.println(option);

        switch (option) {
            case "Log out":
                frame.dispose();;
                new GUI();
                break;
            case "Exit":
                System.exit(0);
                break;
            case "Change password": 
                String newPass = (String)JOptionPane.showInputDialog(
                    frame,
                    "New Password:", 
                    "Change Password",            
                    JOptionPane.PLAIN_MESSAGE,
                    null,            
                    null, 
                    ""
                );
                changeUserPass(newPass);
                break;
            case "Do something":
                doSomething();
            break;
            default:
                break;
        }
    } 
    private void changeUserPass(String newPass) {
        FileWriter myWriter;
        Map <String, String> usercredentials = getUserDictionary();
        usercredentials.put(user, newPass);

        try {
            myWriter = new FileWriter("users.txt", false);

            for (String key : usercredentials.keySet()) {
                myWriter.write(key+ ","+ usercredentials.get(key)+"\n");
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  Map<String, String> getUserDictionary() {
        Map<String, String> userCredentials = new HashMap<String, String>();
        try {
            File file = new File("users.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              userCredentials.put(data.toString().split(",")[0],data.toString().split(",")[1]);
            }
            myReader.close();
            if(userCredentials.get(user) != null){
                return userCredentials;
            }
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        return userCredentials;
    }
    private void doSomething(){
        int[] red = {226, 125, 96};
        int[] blue = {133,220,186};
        int[] orange = {232, 168, 124};
        int[] pink = {195, 141, 158};
        int[] green = {65, 179, 154};
        int[][] colorList = {red, blue, orange,pink,green};

        Random rand = new Random();
        int r = rand.nextInt(0,colorList.length-1);
        Color randomColor = new Color(colorList[r][0],colorList[r][1],colorList[r][2]);
        panel.setBackground(randomColor);
    }
}
