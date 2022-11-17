package home;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HomeController implements Initializable{
    
    @FXML
    private TextField name;
    @FXML
    private TextField department;
    @FXML
    private TextField updateName;
    
    @FXML
    private TableView<EmployeeData> employeeDataTableView;
    @FXML
    private TableColumn<EmployeeData, String> idColumn;
    @FXML
    private TableColumn<EmployeeData, String> nameColumn;
    @FXML
    private TableColumn<EmployeeData, String> departmentColumn;

    @FXML
    private Button addEntryBtn;
    @FXML
    private Button clearBtn;

    //instantiate a model
    HomeModel homeModel = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.homeModel = new HomeModel();
        this.loadEmployeeData();        
    }

    //load data
    @FXML
    public void loadEmployeeData(){

        this.idColumn.setCellValueFactory( new PropertyValueFactory<EmployeeData, String>("id"));
        this.nameColumn.setCellValueFactory( new PropertyValueFactory<EmployeeData, String>("name"));
        this.departmentColumn.setCellValueFactory( new PropertyValueFactory<EmployeeData, String>("department"));

        this.employeeDataTableView.setItems(homeModel.getEmployees());
    }

    //add employee
    @FXML
    private void addEmployee(ActionEvent event){
        homeModel.addEmployee(this.name.getText(), this.department.getText());
        this.loadEmployeeData();
        this.clearFields(null);
    }

    //update employee
    @FXML
    private void updateEmployee(ActionEvent event){
        homeModel.updateEmployee(this.name.getText(), this.department.getText(), this.updateName.getText());
        this.loadEmployeeData();
        this.clearFields(null);
    }
    
    //delete employee
    @FXML
    private void deleteEmployee(ActionEvent event){
        homeModel.deleteEmployee(this.name.getText(), this.department.getText());
        this.loadEmployeeData();
        this.clearFields(null);
    }

    //clear fields
    @FXML
    private void clearFields(ActionEvent event){
        this.name.setText("");
        this.department.setText("");
    }

}