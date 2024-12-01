package com.learning.communication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {
    @FXML
    TextField nameTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException {
        String username = nameTextField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/learning/communication/scene2.fxml"));
        root = loader.load();

        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.displayName(username);

//        root = FXMLLoader.load(getClass().getResource("/com/learning/communication/scene2.fxml"));

        scene = new Scene(root);

        String css = getClass().getResource("/com/learning/communication/scene2-style.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
