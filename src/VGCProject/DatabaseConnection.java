/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VGCProject;

import static java.lang.Class.forName;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahsan Kaleem 15237
 */
public class DatabaseConnection {
    
    
     private static String DB_URL = "jdbc:mysql://localhost:3306/vgcportal?useSSL=false";
     private static String Searchquery;
     private static String USER = "root";
     private static String PASS = "ahsankaleem";
    
    private static Connection conn; 
    
    public static Connection getConnection(){
     Connection conn =null;     
       
        try {
     
     Class.forName("com.mysql.jdbc.Driver");
     try{
         
         conn= DriverManager.getConnection(DB_URL, USER,PASS);
        } catch (SQLException ex) {
         System.out.println("Failed to Connect..");
     }
         
     
            
     
}catch(Exception ex){
    System.out.println(ex.getMessage());
    
}  return conn;
    }  
   
    
    
    
    
}
