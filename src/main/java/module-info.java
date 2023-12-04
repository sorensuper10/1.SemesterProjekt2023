module com.example.semesterprojekt2023 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.semesterprojekt2023 to javafx.fxml;
    exports com.example.semesterprojekt2023;
}