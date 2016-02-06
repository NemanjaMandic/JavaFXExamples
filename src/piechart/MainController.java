/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piechart;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

/**
 * FXML Controller class
 *
 * @author nemus
 */
public class MainController implements Initializable {

   @FXML private PieChart pieChart;
   
   public void getData(ActionEvent event){
       ObservableList<Data> list = FXCollections.observableArrayList(
       new PieChart.Data("Java", 50),
       new PieChart.Data("C++", 20),
       new PieChart.Data("Python", 30),
       new PieChart.Data("PHP", 10),
       new PieChart.Data("C", 15)
       );
       pieChart.setData(list);
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
