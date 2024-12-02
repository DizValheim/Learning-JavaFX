package com.learning.radio;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class RadioController {
    @FXML
    private Label myLabel;

    @FXML
    private RadioButton rButton1, rButton2, rButton3;

    public void getFood(ActionEvent event) {
        if(rButton1.isSelected()) {
            myLabel.setText(rButton1.getText());
        } else if(rButton2.isSelected()) {
            myLabel.setText(rButton2.getText());
        } else {
            myLabel.setText(rButton3.getText());
        }
    }

}
