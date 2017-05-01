/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveningbrew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class EveningBrew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/new_schema";
    private static final String user = "root";
    private static final String password = "";
    
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
   

  public static void main(String args[]) {
        String pop="mazda6";
        String query = "select Name_Beer from beer_main";
              
 
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
 
            // getting Statement object to execute query
            stmt = con.createStatement();
 
            // executing SELECT query
            stmt.executeQuery(query);
 
            while (rs.next()) {
                String name = rs.getString(2);
                System.out.println("Total number of books in the table : " + name);
            }
 
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            //try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
        
    

    }
    }
    
}
