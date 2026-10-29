module demo {
    requires javafx.controls;
    requires javafx.fxml;

    // Ligne obligatoire pour que JavaFX puisse charger le contrôleur et les FXML
    opens com.example to javafx.fxml;

    exports com.example;
}