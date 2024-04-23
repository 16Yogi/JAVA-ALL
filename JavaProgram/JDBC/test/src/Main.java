////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//public class Main {
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/db1";
//        String username = "root";
//        String password = "123456";
//
//        try(Connection connection = DriverManager.getConnection(url,username,password)){
//            System.out.println("Connected to the database.");
//        }catch(SQLException e){
//            System.err.println("COnnection failed:"+ e.getMessage());
//        }
//    }
//}

import java.sql.*;
public class Main{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "123456";
        try(Connection connection = DriverManager.getConnection(url,username,password)){
            System.out.println("COnnection successfull");
            System.out.println(connection);
        }catch (Exception e){
            System.out.println("Connection failed");
        }
    }
}