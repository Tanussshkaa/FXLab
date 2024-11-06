package org.example.wordswitcher;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class WordSwitcherController {

    @FXML
    private TextField inputField;

    @FXML
    private TextField outputField;

    @FXML
    private Button switchButton;

    private boolean isInputToOutput = true;

    @FXML
    public void onSwitchButtonClick() {
        if (isInputToOutput) {
            String inputText = inputField.getText();
            outputField.setText(inputText);
            inputField.clear();
            switchButton.setText("←");
        } else {
            String outputText = outputField.getText();
            inputField.setText(outputText);
            outputField.clear();
            switchButton.setText("→");
        }
        isInputToOutput = !isInputToOutput;
    }
}