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
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
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
   
   @FXML
   private ProgressBar progressBar;
   
   @FXML
   private ProgressIndicator progressIndicator;
   
   @FXML
   private Button incrementButton;
   
     
   @FXML
   private Button decrementButton;
   
   final MyNumber myNum = new MyNumber();
   
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
      
     /*  myNum.numberProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
           labelStatus.setText(Double.toString(myNum.getNumber()));
       });
             */
       myNum.numberProperty().addListener(new ChangeListener<Object>(){

           @Override
           public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
             progressBar.progressProperty().bind(myNum.numberProperty()); // bind progress bar to number property
             progressIndicator.progressProperty().bind(myNum.numberProperty());// bind progress indicator to number property
           }
           
       });
    }
    
    public void incrementClick(ActionEvent ev){
        myNum.setNumber(myNum.getNumber() + 0.1);
    }
    
    public void decrementClick(ActionEvent ev){
        myNum.setNumber(myNum.getNumber() - 0.1);
    }
}
