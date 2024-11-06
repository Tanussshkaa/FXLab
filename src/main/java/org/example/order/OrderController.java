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
    private void toggleAddPaste() {
        countPaste.setText(Integer.toString(Integer.parseInt(countPaste.getText()) + 1));
    }

    @FXML
    private void toggleAddPizza() {
        countPaste.setText(Integer.toString(Integer.parseInt(countPaste.getText()) + 1));
    }

    @FXML
    private void toggleAddSoup() {
        countPaste.setText(Integer.toString(Integer.parseInt(countPaste.getText()) + 1));
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

}