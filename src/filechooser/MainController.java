/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filechooser;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;


public class MainController implements Initializable {

   @FXML
   private Label labelStatus;
    
   @FXML
   private Button selectOneBtn;
   @FXML
   private Button selectMultiBtn;
   
   @FXML
   private ListView listView;
   
   MyNumber myNum = new MyNumber();
   
   public void selectOneAction(ActionEvent event){
       FileChooser fc = new FileChooser();
       File selectedFile = fc.showOpenDialog(null);
       
       if(selectedFile != null){
           listView.getItems().add(selectedFile.getPath());
       }else{
           System.out.println("File is not valid");
       }
       
   }
     
    public void selectMultiAction(ActionEvent event){
       FileChooser fc = new FileChooser();
       List<File> selectedFiles = fc.showOpenMultipleDialog(null);
       
       if(selectedFiles != null){
           for(int i=0; i < selectedFiles.size(); i++){
              listView.getItems().add(selectedFiles.get(i).getAbsolutePath());
           }
       }else{
           System.out.println("File is not valid");
       }
       
   }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       myNum.setNumber(0);
       myNum.numberProperty().addListener(new ChangeListener<Number>() {

           @Override
           public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
            labelStatus.setText(new Double(myNum.getNumber()).toString());
           }
       });
    }
    
    public void btnClick(ActionEvent ev){
        myNum.setNumber(myNum.getNumber() + 1);
    }
}
