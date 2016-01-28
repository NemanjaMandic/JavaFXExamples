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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class MainController implements Initializable {
    
  @FXML
  public TreeView<String> treeview;
    
  Image icon = new Image(getClass().getResourceAsStream("/img/folder.png"));
   
    @FXML
    private void mouseClick(MouseEvent event) {
        if(event.getClickCount() == 2){
          TreeItem<String> item = treeview.getSelectionModel().getSelectedItem();
          System.out.println(item.getValue());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
        root.setExpanded(true);
       
        TreeItem<String> nodeA = new TreeItem<>("Node A", new ImageView(icon));
        TreeItem<String> nodeB = new TreeItem<>("Node B", new ImageView(icon));
        TreeItem<String> nodeC = new TreeItem<>("Node C", new ImageView(icon));
        nodeA.setExpanded(true);
        
       /*
        root.getChildren().add(nodeA);
        root.getChildren().add(nodeB);
        root.getChildren().add(nodeC);
        */
        
        root.getChildren().addAll(nodeA, nodeB, nodeC);
        
         TreeItem<String> nodeA1 = new TreeItem<>("Node A1", new ImageView(icon));
         TreeItem<String> nodeB1 = new TreeItem<>("Node B1", new ImageView(icon));
         TreeItem<String> nodeC1 = new TreeItem<>("Node C1", new ImageView(icon));
         
        nodeA.getChildren().addAll(nodeA1, nodeB1, nodeC1);
        
        treeview.setRoot(root);
    }    
    
}
