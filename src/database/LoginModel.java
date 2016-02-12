
package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginModel {
    
    Connection connection;
    
    public LoginModel(){
        connection = DatabaseConnection.connector();
        if(connection == null) System.exit(1);
    }
    
    public boolean isDBConnected(){
        try {
            return !connection.isClosed();
        } catch (SQLException ex) {
           return false;
        }
    }
}
