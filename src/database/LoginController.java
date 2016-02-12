/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class LoginController implements Initializable {

   public LoginModel loginModel = new LoginModel();
   
   @FXML private Label isConnected;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(loginModel.isDBConnected()){
            isConnected.setText("Connected");
        }else{
            isConnected.setText("Connection failed");
        }
    }    
    
}
