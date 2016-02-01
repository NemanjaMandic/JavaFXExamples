/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidirectionalbinding;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author nemus
 */
public class MainController implements Initializable {

    @FXML
    private Slider slider;
    @FXML
    private TextField textField;
    
    private static final double INITIAL_VALUE = 50;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      slider.setValue(INITIAL_VALUE);
      textField.setText(Double.toString(INITIAL_VALUE));
      textField.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());
    }    
    
}
