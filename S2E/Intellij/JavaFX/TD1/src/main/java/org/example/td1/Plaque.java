package org.example.td1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Plaque extends Application {
    public void start(Stage stage){
        Pane racine = new Pane();
        Rectangle r1 = new Rectangle(10,10, 260,55);
        r1.setFill(Color.WHITE);
        r1.setStroke(Color.BLACK);

        Rectangle r2 = new Rectangle(11,11, 28,53);
        r2.setFill(Color.BLUE);
        r2.setStroke(Color.BLUE);

        Rectangle r3 = new Rectangle(241,11, 28,53);
        r3.setFill(Color.BLUE);
        r3.setStroke(Color.BLUE);

        Rectangle r4 = new Rectangle(246,15, 20,20);
        r4.setFill(Color.BLUE);
        r4.setStroke(Color.BLACK);

        Circle c = new Circle(24,25, 10);
        c.setFill(Color.BLUE);
        c.setStroke(Color.BLACK);

        Text t1 = new Text();
        t1.setFont(Font.font("Arial",FontWeight.BOLD, FontPosture.REGULAR, 20));
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

        racine.getChildren().addAll(r1, r2, r3, r4,t1,t2,t3,c);
        Scene scene = new Scene(racine, 280, 75);
        stage.setScene(scene);
        stage.setTitle( "plaque d'immatriculation");
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
