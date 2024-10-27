package org.example.td3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class Ex2 extends Application {
    private Circle circle;
    private Random random;

    public void start(Stage stage){
        Pane pane = new Pane();
        circle = new Circle(50, Color.BLUE);
        circle.setCenterX(500);
        circle.setCenterY(250);
        pane.getChildren().add(circle);

        random = new Random();

        Scene scene = new Scene(pane, 1000, 500);
        scene.setOnMouseMoved(event -> {
            double dx = circle.getCenterX() - event.getX();
            double dy = circle.getCenterY() - event.getY();
            double distance = Math.sqrt(dx * dx + dy * dy);

            if (distance < circle.getRadius()) {
                circle.setCenterX(random.nextInt(950) + 50);
                circle.setCenterY(random.nextInt(450) + 50);
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}