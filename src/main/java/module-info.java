module com.example.horizon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.horizon to javafx.fxml;
    exports com.example.horizon;
}