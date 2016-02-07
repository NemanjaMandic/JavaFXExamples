/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linechart;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author nemus
 */
public class MainController implements Initializable {

    @FXML LineChart<String, Number> lineChart;
    
    public void loadChart(ActionEvent event){
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("Jan",200));
        series.getData().add(new XYChart.Data<>("Feb",500));
        series.getData().add(new XYChart.Data<>("Mar",300));
        series.getData().add(new XYChart.Data<>("Apr",600));
       
        lineChart.getData().add(series);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
