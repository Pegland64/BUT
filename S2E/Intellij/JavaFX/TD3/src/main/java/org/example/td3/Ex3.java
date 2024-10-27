package org.example.td3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class Ex3 extends Application {
    private TextField tfNumber;
    private TextField tfSize;
    private Canvas canvas;
    private Random random;

    public void start(Stage stage){
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(10);

        tfNumber = new TextField();
        tfNumber.setPromptText("Number of rectangles");

        tfSize = new TextField();
        tfSize.setPromptText("Max size of a rectangle");

        Button btnDraw = new Button("Draw");
        btnDraw.setOnAction(event -> drawRectangles());

        canvas = new Canvas(300, 300);

        vbox.getChildren().addAll(tfNumber, tfSize, btnDraw, canvas);

        random = new Random();

        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }

    private void drawRectangles() {
        int number = Integer.parseInt(tfNumber.getText());
        int maxSize = Integer.parseInt(tfSize.getText());

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (int i = 0; i < number; i++) {
            double size = random.nextInt(maxSize);
            double x = random.nextInt((int) (canvas.getWidth() - size));
            double y = random.nextInt((int) (canvas.getHeight() - size));
            Color color = new Color(random.nextDouble(), random.nextDouble(), random.nextDouble(), random.nextDouble());

            gc.setFill(color);
            gc.fillRect(x, y, size, size);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}