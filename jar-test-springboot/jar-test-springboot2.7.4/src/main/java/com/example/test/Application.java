package com.example.test;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//  --module-path "C:\Program Files\JetBrains\javafx-sdk-19\lib" --add-modules=javafx.base,javafx.controls,javafx.fxml,javafx.graphics,javafx.media,javafx.swing,javafx.web
@SpringBootApplication
public class Application extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        launch(Application.class, MainUI.class, args);
    }

}
