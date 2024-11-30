package com.learning.scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Scenes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);

        //Text
        Text text = new Text();
        text.setText("Hello!!");
        text.setX(225);
        text.setY(100);
        text.setFont(Font.font("Roboto", 50));
        text.setFill(Color.DARKSLATEBLUE);

        //Line
        Line line = new Line();
        line.setStartX(0);
        line.setStartY(195);
        line.setEndX(600);
        line.setEndY(195);
        line.setStroke(Color.CORNFLOWERBLUE);
        line.setStrokeWidth(5);
//        line.setRotate(45);

        //Rectangle
        Rectangle rectangle = new Rectangle(200,200, Color.MEDIUMPURPLE);
        rectangle.setY(200);
        rectangle.setStroke(Color.PURPLE);
        rectangle.setStrokeWidth(5);

        //Triangle
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(305.0,200.0, 205.0,400.0, 405.0,400.0);
        triangle.setFill(Color.LIGHTGREEN);
        triangle.setStroke(Color.GREEN);
        triangle.setStrokeWidth(5);

        //Circle
        Circle circle = new Circle();
        circle.setCenterX(500);
        circle.setCenterY(300);
        circle.setRadius(100);
        circle.setFill(Color.ORANGE);
        circle.setStroke(Color.ORANGERED);
        circle.setStrokeWidth(5);

        //Image
//        Image image = new Image();
//        ImageView imageView = new ImageView(image);
//        imageView.setY(400);


        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
//        root.getChildren().add(imageView);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
