/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author nemus
 */
public class UserController implements Initializable {

    @FXML private Label userLabel;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    public void getUser(String user) {
       userLabel.setText(user);
    } 
    public void signOut(ActionEvent event){
        
    }
    
}
