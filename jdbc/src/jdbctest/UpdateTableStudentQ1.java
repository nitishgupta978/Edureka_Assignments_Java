package jdbctest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTableStudentQ1 {
   static final String DB_URL = "jdbc:mysql://localhost/mydb";
     static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT student_id, name, class, marks FROM STUDENT";


   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "UPDATE STUDENT SET marks = 90 WHERE student_id = 100";
         stmt.executeUpdate(sql);
         System.out.println("Updated into table in given database...");   
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Displaying values
            
            System.out.print("ID: " + rs.getInt("student_id"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Class: " + rs.getInt("class"));
            System.out.println(", Marks: " + rs.getInt("marks"));
         }
         rs.close();	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}