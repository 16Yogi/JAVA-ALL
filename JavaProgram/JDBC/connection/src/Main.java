import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "123456";
        String query = "SELECT * FROM login;";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("conncetion Successfully");
            Statement stmt = con.createStatement();  //take no argument
            ResultSet rs =  stmt.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt("id");
                String user = rs.getString("username");
                String pass = rs.getString("password");

                System.out.println("=========================================");
                System.out.println("ID:"+" "+id);
                System.out.println("username:"+" "+user);
                System.out.println("password:"+" "+pass);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}