import java.sql.*;
public class Test {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/db1";
        String user = "root";
        String password = "123456";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driverload successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getException());
        }


        try{
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Connection successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
