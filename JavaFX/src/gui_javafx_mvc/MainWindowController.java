package gui_javafx_mvc;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class MainWindowController {
    // Reference to the JavaFX components defined in MainWindow.fxml
    @FXML
    private RadioButton totalRadioButton;
    @FXML
    private RadioButton averageRadioButton;
    @FXML
    private RadioButton maxRadioButton;
    @FXML
    private RadioButton minRadioButton;
    @FXML
    private TextField inputField;
    @FXML
    private TextField resultField;

    private Excel excel;

    // Event handler for the "Calculate" button
    @FXML
    private void calculateButtonClicked(ActionEvent event) {
        // Get the input from the input field
        String input = inputField.getText();
        // Create an Excel object with the input
        excel = new Excel(input);

        // Check which radio button is selected and perform the corresponding calculation
        if (totalRadioButton.isSelected()) {
            double total = excel.findTotal();
            resultField.setText(Double.toString(total));
        } else if (averageRadioButton.isSelected()) {
            double average = excel.findAvg();
            resultField.setText(Double.toString(average));
        } else if (maxRadioButton.isSelected()) {
            double maximum = excel.findMax();
            resultField.setText(Double.toString(maximum));
        } else if (minRadioButton.isSelected()) {
            double minimum = excel.findMin();
            resultField.setText(Double.toString(minimum));
        }
    }
}
