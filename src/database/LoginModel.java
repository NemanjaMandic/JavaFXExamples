
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    public boolean isLogin(String user, String pass) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "select * from employee where username = ? and password = ?";
        try{
            ps = connection.prepareCall(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
    }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
            return false;
    }finally{
            ps.close();
            rs.close();
        }
   }
}
