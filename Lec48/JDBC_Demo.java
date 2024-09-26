package Lec48;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class JDBC_Demo {
    public static void main(String[] args) throws Exception {
        String Name = "Sudhakar";
        int RollNo = 123;
        String Gmail = "s@gmail.com";

        // Driver load karo/Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //  establish the Connection karo
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "root");

        // Data insert karne ke liye code (PreparedStatement)
        // PreparedStatement P = con.prepareStatement("INSERT INTO students VALUES('sudhakar', 1234, 's.@gmail.com')");
        // execute the statement
        // int i = P.executeUpdate();
        // if (i > 0) {
        //     System.out.println("success");
        // } else {
        //     System.out.println("fail");
        // }

        // Data retrieve karne ke liye code
        PreparedStatement p = con.prepareStatement("SELECT * FROM students");
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);
            System.out.println(rs.getString("RollNo"));
        }

        // Connection close karo
        rs.close();
        p.close();
        con.close();

        System.out.println("hii");
    }
}

