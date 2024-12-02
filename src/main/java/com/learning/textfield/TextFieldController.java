package com.learning.textfield;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TextFieldController {
    @FXML
    private TextField myTextField;

    @FXML
    private Label infoLabel;

    @FXML
    private Button myButton;

    public void submit(ActionEvent event) {
        int age;
        try {
            age = Integer.parseInt(myTextField.getText());
        } catch (NumberFormatException e) {
            age = -1;
        }
        if(age < 0) {
            infoLabel.setText("Please enter a valid number");
        }
        else {
            if(age > 18)
                infoLabel.setText("You are eligible!");
            else
                infoLabel.setText("You are not eligible!");
        }
    }
}
