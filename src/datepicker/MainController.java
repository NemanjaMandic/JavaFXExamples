/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datepicker;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author nemus
 */
public class MainController implements Initializable {

   @FXML private DatePicker dp;
   @FXML private Label showDate;
   
   public void showDateValue(ActionEvent event){
       LocalDate ld = dp.getValue();
       showDate.setText(ld.toString());
   }
    @Override 
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
