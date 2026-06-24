package milestone_four.milestone_four;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUD {

	public static void main(String[] args) {
		
		 String url = "jdbc:mysql://localhost:3306/wiprodb";
		String user = "root";
		String password= "Admin@123";
		try {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
        
         Connection conn = DriverManager.getConnection(url, user, password);
         // System.out.println("Connected to database successfully!");

         Statement stmt = conn.createStatement();

        /* 
          stmt.execute("Create table Employees ("
         		+ "id INT PRIMARY KEY, "
         		+ "name VARCHAR(50), "
         		+ "salary INT, "
         		+ "departmanent VARCHAR(50))");
          
          System.out.println("Table has been Created");
          
          stmt.execute("INSERT INTO Employees VALUES"
          		+ "(1, \"damarudh\", \"45000\", \"Development\")");
          stmt.execute("INSERT INTO Employees VALUES"
            		+ "(2, \"varma\", \"70000\", \"QA\")");
          stmt.execute("INSERT INTO Employees VALUES"
            		+ "(3, \"pavan\", \"50000\", \"HR\")");
          stmt.execute("INSERT INTO Employees VALUES"
            		+ "(4, \"ojas\", \"30000\", \"IT\")");
          stmt.execute("INSERT INTO Employees VALUES"
            		+ "(5, \"subhas\", \"60000\", \"Marketing\")");
          
          System.out.println("Inserted values to EMployees table ");

          ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");
        

         // iterating in results
         while (rs.next()) {
             String name = rs.getString("name");
             String dept = rs.getString("departmanent");
             int id = rs.getInt("id");
             int salary = rs.getInt("salary");
             
             System.out.println(id+" " + name +" "+ salary+ " " + " "+ dept );
         }       
*/
        
         stmt.execute("DELETE FROM Employees WHERE id = 2");
         System.out.println("Deleted record with ID 2");
         ResultSet rs =   stmt.executeQuery("Select * FROM Employees");
         while (rs.next()) {
             String name = rs.getString("name");
             String dept = rs.getString("departmanent");
             int id = rs.getInt("id");
             int salary = rs.getInt("salary");
             
             System.out.println(id+" " + name +" "+ salary+ " " + " "+ dept );
         }  

      
        
         // Close connection
        // rs.close();
         stmt.close();
         conn.close();
     } catch (Exception e) {
         e.printStackTrace();
     }
		
	}
	
}
		



