/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


public class MainController implements Initializable {

    @FXML private WebView webView;
    @FXML WebEngine engine;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine = webView.getEngine();
    }    
    
    public void loadGoogle(ActionEvent ev){
        engine.load("http://www.google.com");
    }
    public void redirectScript(ActionEvent ev){
        engine.executeScript("window.location='https://www.youtube.com/'");
    }
    public void loadHtml(ActionEvent ev){
        engine.loadContent("<html><body><h1>Hello there</h1></body></html>");
    }
    public void reloadPage(ActionEvent ev){
        engine.reload();
    }
}
