package org.example.td3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex4 extends Application {
    private double value = 0;
    private String operator = "";
    private TextField tf = new TextField();

    private void processOperator(String value) {
        if (!"=".equals(value)) {
            if (!operator.isEmpty())
                return;


            operator = value;
            this.value = Double.parseDouble(tf.getText());
            tf.setText("");
        } else {
            if (operator.isEmpty())
                return;

            tf.setText(String.valueOf(calculate(this.value, Double.parseDouble(tf.getText()), operator)));
            operator = "";
        }
    }

    private double calculate(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0)
                    return 0;

                return a / b;
        }

        return 0;
    }

    public void start(Stage stage){
        GridPane g = new GridPane();
        VBox vb = new VBox(10);
        Button b0 = new Button("0");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button bPlus = new Button("+");
        Button bMoins = new Button("-");
        Button bDiv = new Button("/");
        Button bMul = new Button("*");
        Button bEgal = new Button("=");
        Button bC = new Button("C");

        g.setAlignment(Pos.CENTER);
        g.setPadding(new Insets(15));
        g.setVgap(10);
        g.setHgap(10);

        vb.getChildren().add(tf);
        g.add(b7, 0, 1);
        g.add(b8, 1, 1);
        g.add(b9, 2, 1);
        g.add(bPlus, 3, 1);
        g.add(b4, 0, 2);
        g.add(b5, 1, 2);
        g.add(b6, 2, 2);
        g.add(bMoins, 3, 2);
        g.add(b1, 0, 3);
        g.add(b2, 1, 3);
        g.add(b3, 2, 3);
        g.add(bMul, 3, 3);
        g.add(bC, 0, 4);
        g.add(b0, 1, 4);
        g.add(bEgal, 2, 4);
        g.add(bDiv, 3, 4);

        b0.setOnAction(e -> tf.setText(tf.getText() + "0"));
        b1.setOnAction(e -> tf.setText(tf.getText() + "1"));
        b2.setOnAction(e -> tf.setText(tf.getText() + "2"));
        b3.setOnAction(e -> tf.setText(tf.getText() + "3"));
        b4.setOnAction(e -> tf.setText(tf.getText() + "4"));
        b5.setOnAction(e -> tf.setText(tf.getText() + "5"));
        b6.setOnAction(e -> tf.setText(tf.getText() + "6"));
        b7.setOnAction(e -> tf.setText(tf.getText() + "7"));
        b8.setOnAction(e -> tf.setText(tf.getText() + "8"));
        b9.setOnAction(e -> tf.setText(tf.getText() + "9"));
        bPlus.setOnAction(e -> processOperator("+"));
        bMoins.setOnAction(e -> processOperator("-"));
        bMul.setOnAction(e -> processOperator("*"));
        bDiv.setOnAction(e -> processOperator("/"));
        bEgal.setOnAction(e -> processOperator("="));
        bC.setOnAction(e -> tf.setText(""));

        vb.getChildren().add(g);
        stage.setScene(new Scene(vb));
        stage.show();
    }
}
