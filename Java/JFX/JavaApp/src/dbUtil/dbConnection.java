package dbUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    Connection conn = null;

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(Config.URL, Config.USERNAME, Config.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}