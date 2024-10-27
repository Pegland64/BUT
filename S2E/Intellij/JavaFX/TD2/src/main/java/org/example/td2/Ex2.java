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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Ex2 extends Application {
    public void start(Stage stage){
        VBox root = new VBox(10);
        Button Supeman = new Button("Supeman");
        Button btn1 = new Button("Un");
        Button btn2 = new Button("Deux");
        Button btn3 = new Button("Trois");
        Button btn4 = new Button("Quatre");
        Button btn5 = new Button("Cinq");
        Button btn6 = new Button("Six");

        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.getChildren().add(Supeman);

        StackPane hb = new StackPane();
        Circle c = new Circle(50);
        c.setFill(Color.BLUE);
        c.setStroke(Color.BLACK);
        hb.getChildren().add(c);

        Circle c2 = new Circle(40);
        c2.setFill(Color.YELLOW);
        c2.setStroke(Color.BLACK);
        hb.getChildren().add(c2);

        Text t = new Text("S");
        t.setFont(Font.font("Times New Roman", FontWeight.BOLD, 80));
        t.setFill(Color.RED);
        t.setStroke(Color.BLACK);
        hb.getChildren().add(t);

        root.getChildren().add(hb);

        HBox hb2 = new HBox(10);
        hb2.setAlignment(Pos.CENTER);
        hb2.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);
        root.getChildren().add(hb2);

        stage.setScene(new Scene(root));
        stage.show();
    }
}
