package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
    public static void main(String[] args){
        // Database url 
        String url ="jdbc:mysql://localhost:3306/db1";

        // database credentials
        String username = "root";
        String password = "123456";

        // Establish the connection
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            System.out.println("Connection to the database.");
        }catch(SQLException e){
            System.err.println("Connection failed" + e.getMessage());
        }
    }    
}
