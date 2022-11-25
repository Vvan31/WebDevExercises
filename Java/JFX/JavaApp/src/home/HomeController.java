package home;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class HomeController implements Initializable{
    
    @FXML
    private Label username_label;
    private String userName_string;
    @FXML
    private Label horoscope_label;
    @FXML
    private TextField updateName;
    @FXML 
    private TextField updateSign;
    @FXML
    private Button clearBtn;

    //instantiate a model
    HomeModel homeModel = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.homeModel = new HomeModel();
        userName_string = this.username_label.getText();
        try {
            this.loadUserData();
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }

    //load data
    @FXML
    public void loadUserData() throws IOException, InterruptedException{
        username_label.setWrapText(true);
        username_label.setFont(new Font("Arial", 14));

        this.username_label.setText("Hi! " +userName_string+ ": " + homeModel.getSign(userName_string));
        // System.out.println(" "+userName_string + "  Sign: "+ homeModel.getSign(userName_string));
        
        //Api
        horoscope_label.setWrapText(true);
        horoscope_label.setTextAlignment(TextAlignment.JUSTIFY);
        horoscope_label.setFont(new Font("Bond", 14));
        System.out.println(homeModel.getHoroscope(homeModel.getSign(userName_string)));
        horoscope_label.setText(homeModel.getHoroscope(homeModel.getSign(userName_string)));
    }

    //update User's name
    @FXML
    private void updateUserName(ActionEvent event) throws IOException, InterruptedException{
        homeModel.updateUserName(this.userName_string,  homeModel.getSign(userName_string), this.updateName.getText());
        userName_string = updateName.getText();
        this.loadUserData();
        this.clearFields(null);
    }

    //update User's sign
    @FXML
    private void updateUserSign(ActionEvent event) throws IOException, InterruptedException{
        homeModel.updateUserSign(this.userName_string,homeModel.getSign(userName_string), this.updateSign.getText());
        this.loadUserData();
        this.clearFields(null);
    }
    /*
    //delete User
    @FXML
    private void deleteUser(ActionEvent event){
        homeModel.deleteUser(this.name.getText(), this.sign.getText());
        this.loadUserData();
        this.clearFields(null);
    }
 */
    //clear fields
    @FXML
    private void clearFields(ActionEvent event){
        this.updateName.setText("");
        this.updateSign.setText("");
    }

}