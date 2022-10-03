package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableStudentQ1{
   static final String DB_URL = "jdbc:mysql://localhost/mydb";
   static final String USER = "root";
   static final String PASS = "root";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE STUDENT " +
                   "(student_ID INTEGER not NULL, " +
                   " name VARCHAR(255), " + 
                   " class INTEGER, " + 
                   " marks INTEGER, " + 
                   " PRIMARY KEY ( student_ID ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}