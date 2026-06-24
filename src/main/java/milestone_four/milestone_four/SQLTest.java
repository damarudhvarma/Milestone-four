package milestone_four.milestone_four;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLTest {

	public static void main(String[] args) {
        // JDBC URL format: jdbc:mysql://hostname:port/dbname
        String url = "jdbc:mysql://localhost:3306/wiprodb";
        String user = "root";   // replace with your MySQL username
        String password = "Admin@123"; // replace with your MySQL password
 
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
 
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully!");
 
            // Create a statement
            Statement stmt = conn.createStatement();
 
            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM persons");
 
            // Process results
            while (rs.next()) {
                int id = rs.getInt("PersonID");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
              int age = rs.getInt("Age");
                System.out.println(id + " | " + firstName + " | " + lastName );
            }
 
            // Close connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}