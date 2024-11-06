package org.example.checkbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheckBoxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckBox.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("Чекбоксы и виджеты");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}