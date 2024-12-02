package com.learning.datepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class DatePickerController {
    @FXML
    private DatePicker myDatePicker;

    @FXML
    private Label myLabel;

    public void displayDate(ActionEvent event) {
        LocalDate date = myDatePicker.getValue();

        myLabel.setText(date.toString());
    }
}
