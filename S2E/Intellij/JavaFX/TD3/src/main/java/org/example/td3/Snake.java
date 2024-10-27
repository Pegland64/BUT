package org.example.td3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

import java.util.ArrayList;


public class Snake extends Application {
    ArrayList<Rectangle> snake = new ArrayList<Rectangle>();
    Rectangle head = new Rectangle(20, 20, Color.RED);
    Rectangle fruit = new Rectangle(20, 20, Color.GREEN);




    public void manger() {
        if (head.getX() == fruit.getX() && head.getY() == fruit.getY()) {
            fruit.setX(Math.random() * 500);
            fruit.setY(Math.random() * 500);
            snake.add(fruit);
        }
    }
    public void init() {
        snake.add(head);
    }

    public void start(Stage stage){
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(5));
        grid.setHgap(5); // Horizontal gap
        grid.setVgap(5); // Vertical gap
        grid.setStyle("-fx-background-color: black;"); // Background color

        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 20; j++) {
                Rectangle rectangle = new Rectangle(20, 20, Color.BLUE);
                grid.add(rectangle, i, j);
            }
        }

        grid.add(head, 0, 0);
        grid.add(fruit, (int)(Math.random()*25), (int)(Math.random()*20));
        stage.addEventHandler(KeyEvent.KEY_PRESSED,event ->{
            switch (event.getCode()) {
                case Z:
                    head.setY(head.getY() - 20);
                    break;
                case S:
                    head.setY(head.getY() + 20);
                    break;
                case Q:
                    head.setX(head.getX() - 20);
                    break;
                case D:
                    head.setX(head.getX() + 20);
                    break;
            }
        });
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);

    }
}