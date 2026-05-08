package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button boton1 = new Button("Boton 1");
        Button boton2 = new Button("Boton 2");
        Button boton3 = new Button("Boton 3");
        Button boton4 = new Button("Boton 4");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(boton1, 0,0);
        gridPane.add(boton2, 0,1);
        gridPane.add(boton3, 1,0);
        gridPane.add(boton4, 1,1);

        Scene scene = new Scene(gridPane, 300, 300);
        primaryStage.setTitle("Cuadricula Botones");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
