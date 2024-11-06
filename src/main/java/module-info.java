module org.example.wordswapper {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.example.wordswitcher to javafx.fxml;
    opens org.example.checkbox to javafx.fxml;
    opens org.example.order to javafx.fxml;
    exports org.example.checkbox;
    exports org.example.wordswitcher;
    exports org.example.order;
}

