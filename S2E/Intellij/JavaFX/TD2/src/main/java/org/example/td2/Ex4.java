package org.example.td2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex4 extends Application {
    public void start(Stage stage){
        HBox hb = new HBox(10);
        StackPane sp = new StackPane();
        StackPane sp2 = new StackPane();
        StackPane sp3 = new StackPane();
        VBox vb = new VBox(10);
        VBox vb2 = new VBox(10);

        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(5));
        vb2.setAlignment(Pos.CENTER);
        vb2.setPadding(new Insets(5));

        sp.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));

        sp2.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));

        sp3.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));

        Rectangle r4 = new Rectangle(246,15, 20,20);
        r4.setFill(Color.BLUE);
        r4.setStroke(Color.BLACK);

        Circle c = new Circle(24,25, 10);
        c.setFill(Color.BLUE);
        c.setStroke(Color.BLACK);

        Text t1 = new Text();
        t1.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
        t1.setFill(Color.WHITE);
        t1.setX(18);
        t1.setY(56);
        t1.setText("F");

        Text t2 = new Text();
        t2.setFont(Font.font("Arial",FontWeight.BOLD, FontPosture.REGULAR, 20));
        t2.setFill(Color.WHITE);
        t2.setX(245);
        t2.setY(56);
        t2.setText("57");

        Text t3 = new Text();
        t3.setFont(Font.font("Arial",FontWeight.BOLD, FontPosture.REGULAR, 38));
        t3.setFill(Color.BLACK);
        t3.setX(40);
        t3.setY(50);
        t3.setText("WW-888-WW");

        vb.getChildren().addAll(c, t1);
        sp.getChildren().addAll(vb);
        sp3.getChildren().addAll(t3);
        vb2.getChildren().addAll(r4, t2);
        sp2.getChildren().addAll(vb2);
        hb.getChildren().addAll(sp, sp3, sp2);
        Scene scene = new Scene(hb);
        stage.setScene(scene);
        stage.setTitle( "plaque d'immatriculation");
        stage.show();
    }
}
