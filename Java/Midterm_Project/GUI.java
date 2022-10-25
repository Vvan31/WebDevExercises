package Midterm_Project;

import java.awt.LayoutManager;
import java.util.jar.JarInputStream;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GUI {
    public GUI(){
        mainPageSetup();
    }

    private void mainPageSetup() {
        try {
            GridLayout Layout = new GridLayout(6, 4);
            JPanel jPanel = new JPanel(new GridBagLayout());
            jPanel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
            
            jPanel.setPreferredSize(new Dimension(540, 600));

            GridBagConstraints gbc = new GridBagConstraints();
            JFrame jFrame = new JFrame();
            jFrame.add(jPanel, BorderLayout.CENTER);
            jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);   
            jFrame.setLocationRelativeTo(null); 
            jFrame.setTitle("Main Page");
            jFrame.pack();
            jFrame.setVisible(true);
            jFrame.setLocationRelativeTo(null);
            //jFrame.setResizable(false);
            // Content 
            JButton submiButton = new JButton("Add Post");
            submiButton.setSize(100, 80);
            // submiButton.setLocation(500, 500);
            // submiButton.setSize(100, 50);
            
            // String result = (String)JOptionPane.showInputDialog(
            //     jFrame,
            //     "Your message:", 
            //     "Say something",            
            //     JOptionPane.PLAIN_MESSAGE,
            //     null,            
            //     null, 
            //     "Hello!"
            // );
            //JLabel message = new JLabel(result);
            JLabel message = new JLabel("This is a message example or result of a post. - 10:00 am");
            jPanel.add(message);
            jPanel.add(submiButton, BorderLayout.SOUTH);

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new GUI();
    }
    
}
