package com.learning.scenebldr;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SceneBuilderExample extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = getClass().getResource("/com/learning/scenebldr/scenebldr-view.fxml");

        if (resource == null) {
            System.err.println("FXML file not found!");
            return;
        }

        Parent root = FXMLLoader.load(resource);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
