package com.example.test;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Administrator
 * @version 1.0
 * @class Javafx11-Frame-LCH
 * @description:
 * @date 2022/10/6 10:28
 */
@FXMLController
public class MainUIController implements Initializable {
    @FXML
    public WebView webView;
    @FXML
    public Label   java;
    @FXML
    public Label   javafx;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        webView.getEngine().load("https://demo.bpmn.io/");

        String javaVersion   = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        java.setText(javaVersion);
        javafx.setText(javafxVersion);
    }
}
