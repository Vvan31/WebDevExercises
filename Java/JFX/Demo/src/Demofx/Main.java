package Demofx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Demofx.fxml"));
        primaryStage.setTitle("demo World");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();

        PreparedStatement statement = null;
        ResultSet resultSet = null;

        String URL = "jdbc:postgresql://db.vktcqfqiwqxmefuxqxfe.supabase.co:5432/postgres";
        String USERNAME = "postgres";
        String PASSWORD = "adminweblog:)";
        
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        String query = "SELECT * FROM login_tb";

        statement = conn.prepareStatement(query);
        resultSet = statement.executeQuery();

        if(conn != null){
            System.out.println("Connected to Database");
        }

        while(resultSet.next()){
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getString(4));
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}