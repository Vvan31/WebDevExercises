package home;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
        this.loadUserData();        
    }

    //load data
    @FXML
    public void loadUserData(){
        this.username_label.setText(userName_string+ " Sign: "+ homeModel.getSign(userName_string));
        System.out.println(" "+userName_string + "  Sign: "+ homeModel.getSign(userName_string));
        
        //Apiiii aqui :) 

    }

    //update User's name
    @FXML
    private void updateUserName(ActionEvent event){
        homeModel.updateUserName(this.userName_string,  homeModel.getSign(userName_string), this.updateName.getText());
        userName_string = updateName.getText();
        this.loadUserData();
        this.clearFields(null);
    }

    //update User's sign
    @FXML
    private void updateUserSign(ActionEvent event){
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