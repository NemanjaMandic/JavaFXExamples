/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author nemus
 */
public class MainController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
  @FXML
  private CheckBox cbDog;
  @FXML
  private CheckBox cbCat;
  @FXML
  private CheckBox cbBird;
  @FXML
  private CheckBox cbCow;
  @FXML
  private Label lblList;
  @FXML
  private Label lblCount;
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void checkEvent(ActionEvent event){
        int count = 0;
        String message = "";
        if(cbDog.isSelected()){
            count++;
            message += cbDog.getText() + "\n";
        }
        if(cbCat.isSelected()){
            count++;
            message += cbCat.getText() + "\n";
        }
        if(cbBird.isSelected()){
            count++;
            message += cbBird.getText() + "\n";
        }
        if(cbCow.isSelected()){
            count++;
            message += cbCow.getText() + "\n";
        }
        lblCount.setText("Items Selected: " + count);
        lblList.setText(message);
    }
      public void closeApp(ActionEvent event){
          Platform.exit();
          System.exit(0);
    }
}
