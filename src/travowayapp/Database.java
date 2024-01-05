    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travowayapp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class Database {
    
    public static Connection connectDb(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
                                //                      DATABASE LINK, USERNAME, PASSWORD ROOT IS THE DEFAULT USERNAME 
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/travoway", "root", ""); 
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}
