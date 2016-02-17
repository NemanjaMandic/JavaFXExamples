/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class LoginController implements Initializable {

   public LoginModel loginModel = new LoginModel();
   
   @FXML private Label isConnected;
   @FXML private TextField txtUsername;
   @FXML private PasswordField txtPassword;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(loginModel.isDBConnected()){
            isConnected.setText("Connected");
        }else{
            isConnected.setText("Connection failed");
        }
    }    
    
    public void login(ActionEvent event){
       try {
           if(loginModel.isLogin(txtUsername.getText(), txtPassword.getText())){
               isConnected.setText("Username and password are correct");
               ((Node)event.getSource()).getScene().getWindow().hide();
               FXMLLoader loader = new FXMLLoader();
               Pane root = loader.load(getClass().getResource("User.fxml").openStream());
               UserController userController = (UserController) loader.getController();
               userController.getUser(txtUsername.getText());
               Stage stage = new Stage();
               Scene scene = new Scene(root);

               stage.setScene(scene);
               stage.show();
           }else{
                isConnected.setText("Username and password are incorrect");
           }
       } catch (SQLException ex) {
           Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
