package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingQ2 {
   static final String DB_URL = "jdbc:mysql://localhost/mydb";
    static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT student_id, name, class, marks FROM STUDENT";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {

			conn.setAutoCommit(false);

			String SQL1 = "INSERT INTO Student (student_id, name, class, marks) " +
						 "VALUES(104,'Nishant', 11, 90)";
			stmt.addBatch(SQL1);

			String SQL2 = "INSERT INTO Student (student_id, name, class, marks) " +
						 "VALUES(103,'Raj', 10, 67)";
			stmt.addBatch(SQL2);

			String SQL3 = "UPDATE Student SET marks = 35 WHERE student_id = 100";
			stmt.addBatch(SQL3);

			int[] count = stmt.executeBatch();
			System.out.println(count);
			conn.commit();
			
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Displaying values
            System.out.print("ID: " + rs.getInt("student_id"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Class: " + rs.getInt("class"));
            System.out.println(", Marks: " + rs.getInt("marks"));
         }   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}