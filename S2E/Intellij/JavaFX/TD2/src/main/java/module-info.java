module org.example.td2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.td2 to javafx.fxml;
    exports org.example.td2;
}