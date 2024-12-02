package com.learning.checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class CheckboxController {
    @FXML
    private ImageView myImageView;

    @FXML
    private Label onoffLabel;

    @FXML
    private CheckBox myCheckbox;

    private Image image1 = new Image(getClass().getResourceAsStream("/com/learning/checkbox/bulb_on.png"));
    private Image image2 = new Image(getClass().getResourceAsStream("/com/learning/checkbox/bulb_off.png"));

    public void toggleLight(ActionEvent event) {
        if(myCheckbox.isSelected()) {
            myImageView.setImage(image1);
            onoffLabel.setText("ON");
        }
        else {
            myImageView.setImage(image2);
            onoffLabel.setText("OFF");
        }
    }
}
