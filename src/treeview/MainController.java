/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;


public class MainController implements Initializable {
    
  @FXML
  public TreeView<String> treeview;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
     
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TreeItem<String> root = new TreeItem<>("Root");
      
       
        TreeItem<String> nodeA = new TreeItem<>("Node A");
        TreeItem<String> nodeB = new TreeItem<>("Node B");
        TreeItem<String> nodeC = new TreeItem<>("Node C");
        
       /*
        root.getChildren().add(nodeA);
        root.getChildren().add(nodeB);
        root.getChildren().add(nodeC);
        */
        
        root.getChildren().addAll(nodeA, nodeB, nodeC);
        
         TreeItem<String> nodeA1 = new TreeItem<>("Node A1");
         TreeItem<String> nodeB1 = new TreeItem<>("Node B1");
         TreeItem<String> nodeC1 = new TreeItem<>("Node C1");
         
        nodeA.getChildren().addAll(nodeA1, nodeB1, nodeC1);
        
        treeview.setRoot(root);
    }    
    
}
