package org.example.order;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OrderController {

    @FXML
    private Label countPaste;

    @FXML
    private Label countPizza;

    @FXML
    private Label countSoup;

    @FXML
    private Label pricePaste;

    @FXML
    private Label pricePizza;

    @FXML
    private Label priceSoup;

    @FXML
    private void toggleAddPaste() {
        countPaste.setText(Integer.toString(Integer.parseInt(countPaste.getText()) + 1));
    }

    @FXML
    private void toggleAddPizza() {
        countPizza.setText(Integer.toString(Integer.parseInt(countPizza.getText()) + 1));
    }

    @FXML
    private void toggleAddSoup() {
        countSoup.setText(Integer.toString(Integer.parseInt(countSoup.getText()) + 1));
    }

    @FXML
    private void toggleSubPaste() {
        if (Integer.parseInt(countPaste.getText()) > 0) {
            countPaste.setText(Integer.toString(Integer.parseInt(countPaste.getText()) - 1));
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Нельзя убавить");
            alert.showAndWait();
        }
    }

    @FXML
    private void toggleSubPizza() {
        if (Integer.parseInt(countPizza.getText()) > 0) {
            countPizza.setText(Integer.toString(Integer.parseInt(countPizza.getText()) - 1));
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Нельзя убавить");
            alert.showAndWait();
        }
    }

    @FXML
    private void toggleSubSoup() {
        if (Integer.parseInt(countSoup.getText()) > 0) {
            countSoup.setText(Integer.toString(Integer.parseInt(countSoup.getText()) - 1));
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Нельзя убавить");
            alert.showAndWait();
        }
    }

    @FXML
    private void toggleCalculate() {
        int pricePas = Integer.parseInt(pricePaste.getText()) * Integer.parseInt(countPaste.getText());
        int pricePiz = Integer.parseInt(pricePizza.getText()) * Integer.parseInt(countPizza.getText());
        int priceSp = Integer.parseInt(priceSoup.getText()) * Integer.parseInt(countSoup.getText());
        int sum = pricePas + pricePiz + priceSp;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Счет");
        alert.setHeaderText(null);
        alert.setContentText("Итоговая стоимость: " + sum);
        alert.showAndWait();
    }

}