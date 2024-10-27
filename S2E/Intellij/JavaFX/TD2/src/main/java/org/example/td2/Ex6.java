package org.example.td2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Stack;

public class Ex6 extends Application {
    public void start(Stage stage){
        int k = 0;
        GridPane g = new GridPane();
        for(int i = 0; i < 10; i++){
            k++;
            for(int j = 0; j < 10; j++){
                k++;
                if (k % 2 == 0){
                    Rectangle r = new Rectangle(50,50);
                    r.setFill(Color.WHITE);
                    g.add(r, i, j);
                }else{
                    StackPane sp = new StackPane();
                    Rectangle r2 = new Rectangle(50, 50);
                    r2.setFill(Color.SADDLEBROWN);
                    sp.getChildren().addAll(r2);
                    if (j<=2){
                        Circle c = new Circle(20);
                        c.setFill(Color.BLACK);
                        sp.getChildren().addAll(c);
                    }else if(j>=7){
                        Circle c = new Circle(20);
                        c.setFill(Color.WHITE);
                        sp.getChildren().addAll(c);
                    }
                    g.add(sp, i, j);
                }
            }
        }


        stage.setScene(new Scene(g));
        stage.show();


    }
}
