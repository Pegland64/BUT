package org.example.td2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex3 extends Application{
    public void start(Stage stage){
        GridPane g = new GridPane();
        ToggleGroup tg = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Madame");
        rb1.setToggleGroup(tg);
        RadioButton rb2 = new RadioButton("Monsieur");
        rb2.setToggleGroup(tg);
        rb1.setSelected(true);

        g.setPadding(new Insets(15));

        g.setVgap(10);
        g.setHgap(10);

        g.add(rb1, 0, 0);
        g.add(rb2, 1, 0);

        Label nom=new Label("Nom");
        TextField tf1=new TextField();

        Label prenom=new Label("Prénom");
        TextField tf3=new TextField();

        Label mail=new Label("Email");
        TextField tf2 = new TextField();

        Button bt = new Button("Précédant");
        Button bt2 = new Button("Suivant");

        g.add(nom,0,1);
        g.add(tf1,1,1);

        g.add(prenom,2,1);
        g.add(tf3,3,1);

        g.add(mail,0,2);
        g.add(tf2,1,2, 3, 2);

        g.add(bt,1,4);
        g.add(bt2,2,4);


        stage.setScene(new Scene(g));
        stage.show();
    }
}
