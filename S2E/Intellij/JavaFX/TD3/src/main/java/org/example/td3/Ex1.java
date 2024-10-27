package org.example.td3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Ex1 extends Application{
    public void start(Stage stage){
        GridPane gp = new GridPane();
        Label Nom = new Label("Nom");
        Label Prenom = new Label("Prenom");
        Label Choix = new Label("Choix");
        Label Sexe = new Label ("Sexe");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();

        RadioButton rb1 = new RadioButton();
        rb1.setText("Homme");
        RadioButton rb2 = new RadioButton();
        rb2.setText("Femme");
        RadioButton rb3 = new RadioButton();
        rb3.setText("Autre");

        VBox v1  = new VBox();
        HBox h1 = new HBox();
        h1.getChildren().addAll(Sexe, rb1, rb2, rb3);
        v1.getChildren().addAll(Nom, tf1, Prenom, tf2, Choix, tf3, h1);
        gp.add(v1, 0, 0);

        VBox v2 = new VBox();
        String[] str = new String[]{"Tennis", "Squash", "Natation", "Athlétisme", "Randonnée", "Foot", "Basket", "Volley", "Pétanque"};
        for (int i = 0; i<str.length; i++){
            CheckBox w = new CheckBox(str[i]);
            v2.getChildren().addAll(w);
        }
        gp.add(v2, 1, 0);
        Button OK = new Button();
        OK.setText("OK");
        Button a = new Button();
        a.setText("Annuler");
        gp.add(OK, 0, 1);
        gp.add(a, 1, 1);
        Scene scene = new Scene(gp, 500, 500);
        stage.setScene(scene);
        stage.show();

    }
}
