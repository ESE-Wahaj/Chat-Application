package chatappapplication;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chatapp";
    private static final String USER = "root";
    private static final String PASS = "0335347070";

    public static Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}

