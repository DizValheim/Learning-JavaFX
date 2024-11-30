package com.learning.cssstyles;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class CssStyling extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = getClass().getResource("/com/learning/cssstyles/CssStyling-view.fxml");

        if(resource == null) {
            System.err.println("FXML file not found");
            return;
        }

        Parent root = FXMLLoader.load(resource);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

//        scene.getStylesheets().add(getClass().getResource("/com/learning/CssStyling-style.css").toExternalForm());
        String css = this.getClass().getResource("/com/learning/cssstyles/CssStyling-style.css").toExternalForm();

        scene.getStylesheets().add(css);

        primaryStage.show();
    }
}
