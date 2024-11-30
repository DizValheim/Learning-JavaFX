package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.SKYBLUE);

//        Image icon = new Image("icon.png");
//        stage.getIcons().add(icon);

        stage.setTitle("My First Stage");
//        stage.setWidth(720);
//        stage.setHeight(480);
//        stage.setResizable(false);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("YOU CANT ESCAPE unless you press q");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}