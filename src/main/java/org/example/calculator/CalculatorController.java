package org.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField display;

    private double firstOperand = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    @FXML
    private void initialize() {
        display.setEditable(false);
    }

    @FXML
    private void onNumberClick(ActionEvent event) {
        String label = ((Button) event.getSource()).getText();
        if (startNewNumber) {
            display.setText("");
            startNewNumber = false;
        }
        display.appendText(label);
    }

    @FXML
    private void onOperatorClick(ActionEvent event) {
        String label = ((Button) event.getSource()).getText();
        operator = label;
        firstOperand = Double.parseDouble(display.getText());
        startNewNumber = true;
    }

    @FXML
    private void onEqualsClick() {
        try {
            double secondOperand = Double.parseDouble(display.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    if (secondOperand == 0) {
                        showError("Ошибка. Деление на 0");
                        return;
                    }
                    result = firstOperand / secondOperand;
                    break;
            }

            display.setText(String.valueOf(result));
            startNewNumber = true;
        } catch (NumberFormatException e) {
            showError("Ошибка. Неккоректный ввод");
        }
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Calculation Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
        display.setText("");
        startNewNumber = true;
    }

    @FXML
    private void onClearClick() {
        display.clear();
        firstOperand = 0;
        operator = "";
        startNewNumber = true;
    }
}