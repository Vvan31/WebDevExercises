package home;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbUtil.dbConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import netscape.javascript.JSObject;

public class HomeModel {
    
    Connection conn = null;
    private ObservableList<UserData> UserData;

    public HomeModel(){
        this.conn = dbConnection.getConnection();

        if(this.conn == null){
            System.exit(0);
        }
    }

    public ObservableList<UserData> getUsers(){
        String query = "SELECT * FROM Users_tbl";

        try {
            this.UserData = FXCollections.observableArrayList();

            ResultSet resultSet = conn.createStatement().executeQuery(query);

            // id | createAt | name | sign

            while(resultSet.next()){
                this.UserData.add( new UserData(
                    resultSet.getString(1),
                    resultSet.getString(3),
                    resultSet.getString(4)
                ));
            }

            return UserData;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
        
    }

    public void addUser(String name, String sign){
        String query = "INSERT INTO Users_tbl (name, sign) VALUES (?, ?)";
        PreparedStatement statement = null;

        try {
            statement = conn.prepareStatement(query);

            statement.setString(1, name);
            statement.setString(2, sign);

            statement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void deleteUser(String name, String sign){
        String query = "DELETE FROM Users_tbl WHERE \"name\" = ? AND \"sign\" = ?;";
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(query);
            System.out.println("statement::::  "+statement);
            statement.setString(1, name);
            statement.setString(2, sign);

            statement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateUserName(String name, String sign, String updateName) {
        String query = "update astral_users set \"username\" = ? WHERE \"username\" = ? and \"sign\" = ?;";
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(query);
            statement.setString(1, updateName);
            statement.setString(2, name);
            statement.setString(3, sign);
            System.out.println("statement::::  "+statement);

            statement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateUserSign(String name, String sign, String updateSign) {
        String query = "update astral_users set \"sign\" = ? WHERE \"username\" = ? and \"sign\" = ?;";
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(query);
            statement.setString(1, updateSign);
            statement.setString(2, name);
            statement.setString(3, sign);
            System.out.println("statement::::  "+statement);

            statement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public String getSign(String username_label) {
        String query = "SELECT \"sign\" FROM astral_users where \"username\" = ?";
        PreparedStatement statement = null;
        ResultSet userSign;
        try {
            statement = conn.prepareStatement(query);
            statement.setString(1, username_label);
            userSign = statement.executeQuery();
            if (userSign.next()){
                System.out.println(" \n User Sign:  "+ userSign.getString(1).toString());
                return userSign.getString(1).toString();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public String getHoroscope(String sign) throws IOException, InterruptedException {
        
        HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://sameer-kumar-aztro-v1.p.rapidapi.com/?sign=aquarius&day=today"))
		.header("X-RapidAPI-Key", "473af0ce5dmsh05af91a66aee28cp1f5a61jsnfdb2b69f95c7")
		.header("X-RapidAPI-Host", "sameer-kumar-aztro-v1.p.rapidapi.com")
		.method("POST", HttpRequest.BodyPublishers.noBody())
		.build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body().toString().replace("{", "").replace("}", ""));
        
        String[] response_arr = response.body().toString().replace("{", "").replace("}", "").split(", \"");
        System.out.println(response_arr[2]);
        return response_arr[2].toString();
        /* 
        HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://astro-daily-live-horoscope.p.rapidapi.com/horoscope-career-monthly/aquarius"))
		.header("X-RapidAPI-Key", "473af0ce5dmsh05af91a66aee28cp1f5a61jsnfdb2b69f95c7")
		.header("X-RapidAPI-Host", "astro-daily-live-horoscope.p.rapidapi.com")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
        */
    }
}