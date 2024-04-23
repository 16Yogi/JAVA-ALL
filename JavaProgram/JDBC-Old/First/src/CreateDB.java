import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CreateDB {
    public static void main(String[] args) throws Exception {
        try {
            // JDBC URL for MySQL database
            String url = "jdbc:mysql://localhost:3306/";

            // Database name to be created
            String databaseName = "your_database_name";

            // MySQL database credentials
            String userName = "root";
            String password = "123456";

            // Establishing connection to MySQL
            Connection connection = DriverManager.getConnection(url, userName, password);

            // Creating the database
            Statement statement = connection.createStatement();
            String sql = "CREATE DATABASE " + databaseName;
            statement.executeUpdate(sql);

            // Closing resources
            statement.close();
            connection.close();

            JOptionPane.showMessageDialog(null, "Database created successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
