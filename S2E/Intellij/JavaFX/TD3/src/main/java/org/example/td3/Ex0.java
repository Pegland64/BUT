package org.example.td3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;

public class Ex0 extends Application {

        public void start(Stage stage) {

            BorderPane root = new BorderPane();
            HBox btnPanel = new HBox(10);
            Label lblTitle = new Label("Evènements");
            TextArea txaMsg = new TextArea();
            Button btnInsert = new Button("Insérer");
            Button btnDelete = new Button("Supprimer");
            Button btnQuit = new Button("Quitter");

            stage.setTitle("Evènements");
            root.setPadding(new Insets(10));

            //--- Titre
            lblTitle.setFont(Font.font(20));
            lblTitle.setTextFill(Color.DARKGREEN);
            BorderPane.setAlignment(lblTitle, Pos.CENTER);
            root.setTop(lblTitle);

            //--- Text-Area
            txaMsg.setWrapText(true);
            txaMsg.setPrefColumnCount(15);
            txaMsg.setPrefRowCount(10);
            root.setCenter(txaMsg);

            //--- Boutons

            class btnInsertHandler implements EventHandler<ActionEvent> {
                private TextArea txaMsg;
                public btnInsertHandler (TextArea txaMsg) {
                    this.txaMsg = txaMsg;
                }

                @Override
                public void handle(ActionEvent event) {
                    txaMsg.appendText("Fuck Israel \n");
                }
            }

            class btnQuitHandler implements EventHandler<ActionEvent>{
                private TextArea txaMsg;
                public btnQuitHandler (TextArea txaMsg) {
                    this.txaMsg = txaMsg;
                }

                @Override
                public void handle(ActionEvent event){
                    txaMsg.appendText("RESTE LA O-O\n");
                }
            }



            btnInsertHandler a = new btnInsertHandler(txaMsg);
            btnInsert.addEventHandler(ActionEvent.ACTION, a);
            btnDelete.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
                @Override
                public void handle (ActionEvent event){
                    txaMsg.deletePreviousChar();
                }
                    }
                    );

            btnQuitHandler b = new btnQuitHandler(txaMsg);
            btnQuit.addEventHandler(ActionEvent.ACTION, b);


            btnPanel.getChildren().add(btnInsert);
            btnPanel.getChildren().add(btnDelete);
            btnPanel.getChildren().add(btnQuit);

            btnPanel.setAlignment(Pos.CENTER_RIGHT);
            btnPanel.setPadding(new Insets(10, 0, 0, 0));
            root.setBottom(btnPanel);
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();

        }

        public static void main(String[] args) {
            launch(args);
        }
    }
