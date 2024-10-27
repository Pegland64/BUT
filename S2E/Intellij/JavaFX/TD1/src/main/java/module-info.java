module org.example.td1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.td1 to javafx.fxml;
    exports org.example.td1;
}