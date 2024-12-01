package com.learning.communication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerComm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/learning/communication/scene1.fxml"));
        Scene scene1 = new Scene(root);

        String css = this.getClass().getResource("/com/learning/communication/scene1-style.css").toExternalForm();
        scene1.getStylesheets().add(css);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
