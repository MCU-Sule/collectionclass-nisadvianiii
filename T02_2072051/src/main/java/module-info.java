module com.example.t02_2072051 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t02_2072051 to javafx.fxml;
    exports com.example.t02_2072051;
    exports com.example.t02_2072051.model;
    opens com.example.t02_2072051.model to javafx.fxml;
}