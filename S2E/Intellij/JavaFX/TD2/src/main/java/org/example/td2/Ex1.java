package org.example.td2;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Ex1 extends Application {
    public void start(Stage stage){
        HBox root = new HBox(10);
        Button btnOk = new Button("OK");
        Button btnLogin = new Button("Login");
        Button btnMulti = new Button("Texte \n sur plusieurs \n lignes.");
        Button btnSave = new Button("Save");

        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.getChildren().add(btnOk);
        btnLogin.setTextFill(Color.BLUE);

        ImageView imgv = new ImageView("file:Satan.jpg");
        imgv.setFitWidth(50);
        imgv.setPreserveRatio(true);
        imgv.setSmooth(true);

        btnLogin.setGraphic(imgv);
        btnLogin.setContentDisplay(ContentDisplay.TOP);
        root.getChildren().add(btnLogin);
        btnSave.setDefaultButton(true);
        root.getChildren().add(btnSave);

        btnMulti.setTextAlignment(TextAlignment.RIGHT);
        root.getChildren().add(btnMulti);

        stage.setScene(new Scene(root));
        stage.show();
    }
}
