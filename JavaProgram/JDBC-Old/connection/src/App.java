import java.sql.*;
public class App {
    // static final String DB_URL = "jdbc.mysql://localhost:3306/employee";
    static final String DB_URL = "jdbc:mysql://localhost:3306/employee";

    static final String USER = "root";
    static final String PASS = "123456";
    static final String QUERY = "SELECT * FROM employeedetails";
    public static void main(String[] args) throws Exception {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery(QUERY);){
        while (rs.next()) {
            System.out.print("id:"+rs.getInt("id"));
            System.out.print("emName:"+rs.getString("emName"));
            System.out.print("emAddree:"+rs.getString("emAddree"));
            System.out.print("emCity:"+rs.getString("emCity"));
            System.out.print("emPhone:"+rs.getString("emPhone"));
            System.out.print("emSalary"+rs.getString("emSalary"));

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        
    }
}
