/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobuttons;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author nemus
 */
public class MainController implements Initializable {

   @FXML private RadioButton rbMale;
   @FXML private RadioButton rbFemale;
   @FXML private Label lbl;
   
   
   public void radioSelect(ActionEvent event){
       String message = "";
       if(rbMale.isSelected()){
           message += rbMale.getText();
       }
        if(rbFemale.isSelected()){
           message += rbFemale.getText();
       }
        lbl.setText(message);
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
