/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linechart;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author nemus
 */
public class MainController implements Initializable {

    @FXML LineChart<String, Number> lineChart;
    @FXML Label lbl;
    public void loadChart(ActionEvent event){
         lineChart.getData().clear();
        
         // Line 1 on chart
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("Jan",200));
        series.getData().add(new XYChart.Data<>("Feb",500));
        series.getData().add(new XYChart.Data<>("Mar",300));
        series.getData().add(new XYChart.Data<>("Apr",600));
        series.setName("Month Pay 1");
        
        // Line 2 on chart
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.getData().add(new XYChart.Data<>("Jan",400));
        series1.getData().add(new XYChart.Data<>("Feb",100));
        series1.getData().add(new XYChart.Data<>("Mar",800));
        series1.getData().add(new XYChart.Data<>("Apr",500));
        series1.setName("Month Pay 2");
        
         // Line 3 on chart
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Jan",490));
        series2.getData().add(new XYChart.Data<>("Feb",145));
        series2.getData().add(new XYChart.Data<>("Mar",870));
        series2.getData().add(new XYChart.Data<>("Apr",566));
        series2.setName("Month Pay 3");
        
        //Adding all lines on chart
        lineChart.getData().addAll(series, series1, series2);
        
        
        // loop through series
        for(final XYChart.Data<String, Number> data : series.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {
                   lbl.setText("X: " + data.getXValue()+"\n" + "Y: " + String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(), new Tooltip("X: " + data.getXValue()+"\n" + "Y: " + String.valueOf(data.getYValue())));
                }
            }); //added mouse clicked event
    }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
