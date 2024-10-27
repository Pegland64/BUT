package org.example.td2;

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

public class Ex5 extends Application {
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
        TextField tf = new TextField();

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

        vb.getChildren().add(g);
        stage.setScene(new Scene(vb));
        stage.show();
    }
}
