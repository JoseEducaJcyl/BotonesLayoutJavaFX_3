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
        // Se crea el primer botón con texto "Boton 1"
        Button boton1 = new Button("Boton 1");
        // Se crea el segundo botón con texto "Boton 2"
        Button boton2 = new Button("Boton 2");
        // Se crea el tercer botón con texto "Boton 3"
        Button boton3 = new Button("Boton 3");
        // Se crea el cuarto botón con texto "Boton 4"
        Button boton4 = new Button("Boton 4");

        // Se crea un panel de tipo GridPane (distribución en forma de cuadrícula o tabla)
        GridPane gridPane = new GridPane();
        // Se establece el espacio horizontal (gap) entre columnas: 10 píxeles
        gridPane.setHgap(10);
        // Se establece el espacio vertical (gap) entre filas: 10 píxeles
        gridPane.setVgap(10);
        // Se añade boton1 en la columna 0, fila 0 (primera celda, esquina superior izquierda)
        gridPane.add(boton1, 0,0);
        // Se añade boton2 en la columna 0, fila 1 (primera columna, segunda fila)
        gridPane.add(boton2, 0,1);
        // Se añade boton3 en la columna 1, fila 0 (segunda columna, primera fila)
        gridPane.add(boton3, 1,0);
        // Se añade boton4 en la columna 1, fila 1 (segunda columna, segunda fila)
        gridPane.add(boton4, 1,1);

        // Se crea la escena con el GridPane como raíz, de 300x300 píxeles
        Scene scene = new Scene(gridPane, 300, 300);
        // Se asigna el título "Cuadricula Botones" a la ventana principal
        primaryStage.setTitle("Cuadricula Botones");
        // Se asigna la escena a la ventana
        primaryStage.setScene(scene);
        // Se hace visible la ventana
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}