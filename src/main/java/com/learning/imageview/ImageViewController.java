package com.learning.imageview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageViewController {
    @FXML
    ImageView myImageView;

    @FXML
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("/com/learning/imageview/HorizonZeroDawn-2.png"));
    Image myImage2 = new Image(getClass().getResourceAsStream("/com/learning/imageview/HorizonZeroDawn-1.png"));

    Boolean flag = true;

    public void displayImage() {
        myImageView.setImage((flag) ? myImage : myImage2);
        flag = !flag;
    }
}
