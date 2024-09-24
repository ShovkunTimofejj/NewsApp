module com.example.instanews {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.instanews to javafx.fxml;
    exports com.example.instanews;
}