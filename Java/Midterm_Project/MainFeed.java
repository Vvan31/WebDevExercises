package Midterm_Project;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MainFeed {
    static JFrame frame;
    static JPanel mainPanel;
    static JPanel scrollPanel;
    String user;
    String pass;
    ImageIcon icon;
    ImageIcon menu;

    public MainFeed(JFrame frame, String user, String pass) {
        icon = new ImageIcon("WebDevExercises/Java/Midterm_Project/img/right.png");
        menu = new ImageIcon("WebDevExercises/Java/Midterm_Project/img/menu.png");
        MainFeed.frame = frame;
        this.user = user;
        this.pass = pass;
        createPanel();
    }

    private void createPanel() {
        // Main panel as a container. 
        mainPanel =  new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        mainPanel.setBounds(10, 10,350,700);
        mainPanel.setBackground(Color.getHSBColor(44, 35, 90)); 

        // Container for scrolling part of GUI. 
        scrollPanel = new JPanel();
        scrollPanel.setLayout(new BoxLayout(scrollPanel, BoxLayout.PAGE_AXIS));
        scrollPanel.setPreferredSize( new Dimension(500, 450));
        scrollPanel.setBackground(new Color(232, 168, 124)); 
        scrollPanel.setBounds(10, 100,300,600);
    }
    // Accessed via Login Button ActionListener. 
    void createMainFeed() {
        // GUI components: Labels, TextFields, Buttons. 
        JLabel user_label = new JLabel("Welcome " + user);
        user_label.setBounds(10,20,80,25);
        user_label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JButton options = new JButton(menu);
        options.setLocation(500,20);
        //options.setAlignmentX(100);
        //options.setBounds(450,20,60,25);
        options.addActionListener(new OptionsButtonListener(user, pass, frame, scrollPanel));

        JTextField userTextfield = new JTextField(25);
        userTextfield.setBounds(10,500,150,100);

        JButton postBtn = new JButton(icon);
        postBtn.setBounds(450,500,60,25);
        postBtn.addActionListener(new PostButtonListener(user,frame,scrollPanel, userTextfield));

        // Components need to be added in top-down order. 
        mainPanel.add(user_label);
        mainPanel.add(options);

        createContentPanel();

        mainPanel.add(userTextfield);
        mainPanel.add(postBtn);
        //Add panel to frame and refresh frame. 
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    // Reads a txt with all the stored posts and stores them in a LinkedHashMap. 
    private static LinkedHashMap<String, String> readPosts(){
        // Using LinkedHashMap for FI/FO implementation. 
        LinkedHashMap<String, String> posts = new LinkedHashMap<String, String>();
        try {
            File file = new File("WebDevExercises/Java/Midterm_Project/posts.txt");
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              posts.put(data.toString().split(",")[0],data.toString().split(",")[1]);
            }
            myReader.close();

          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        return posts;
    }
    // Adds every Entry in LinkedHashMap "posts" to scroll panel. 
    public static void AddPanelContent(){
        Map<String, String> posts = readPosts();

        posts.entrySet().forEach(entry -> {
            addPost(entry.getKey() +" -- " +entry.getValue() +"\n", scrollPanel);
        });
    }

    private static void addPost(String msg, JPanel scroll) {
        JLabel label = new JLabel(msg);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        label.setFont(new Font("Dialog", Font.BOLD, 13));
        scroll.add(label);
    }
    // Creates scrollPane inside scroll panel and adds it to the main panel. 
    public static void createContentPanel() {
        AddPanelContent();
        JScrollPane scroll = new JScrollPane(scrollPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setPreferredSize( new Dimension(450, 420));
        mainPanel.add(scroll);
        frame.setVisible(true);
    }
}
