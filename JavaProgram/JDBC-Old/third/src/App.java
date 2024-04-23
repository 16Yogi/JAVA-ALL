import java.sql.*;
public class App {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "123456");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employeedetails");
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
            }
            con.close();

        }
        catch(Exception e){
            System.out.println("FUck you..!"+e);
        }
    }
}
