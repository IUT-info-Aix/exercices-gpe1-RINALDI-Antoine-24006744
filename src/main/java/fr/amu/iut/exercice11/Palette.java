package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

@SuppressWarnings("Duplicates")
public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Label texteDuHaut;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Pane panneau;
    private HBox boutons;

    private Label texteDuBas;


    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        texteDuHaut = new Label();
        texteDuHaut.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        BorderPane.setAlignment(texteDuHaut, Pos.CENTER);
        texteDuBas = new Label();

        panneau = new Pane();
        panneau.setPrefSize(400, 200);

        VBox bas = new VBox();
        boutons = new HBox(10);
        boutons.setAlignment(Pos.CENTER);
        boutons.setPadding(new Insets(10, 5, 10, 5));
        texteDuBas = new Label();
        bas.setAlignment(Pos.CENTER_RIGHT);
        bas.getChildren().addAll(boutons, texteDuBas);

        vert = new Button("Vert");
        rouge = new Button("Rouge");
        bleu = new Button("Bleu");

        /* VOTRE CODE ICI */

        vert.setOnAction(e -> {
            nbVert++;
            panneau.setStyle("-fx-background-color: green;");
            texteDuHaut.setText("Vert choisi " + nbVert + " fois");
            texteDuBas.setText("Le vert est une jolie couleur !");
            texteDuBas.setStyle("-fx-text-fill: green;");
        });

        rouge.setOnAction(e -> {
            nbRouge++;
            panneau.setStyle("-fx-background-color: red;");
            texteDuHaut.setText("Rouge choisi " + nbRouge + " fois");
            texteDuBas.setText("Le rouge est une jolie couleur !");
            texteDuBas.setStyle("-fx-text-fill: red;");
        });

        bleu.setOnAction(e -> {
            nbBleu++;
            panneau.setStyle("-fx-background-color: blue;");
            texteDuHaut.setText("Bleu choisi " + nbBleu + " fois");
            texteDuBas.setText("Le bleu est une jolie couleur !");
            texteDuBas.setStyle("-fx-text-fill: blue;");
        });

        boutons.getChildren().addAll(vert, rouge, bleu);

        root.setCenter(panneau);
        root.setTop(texteDuHaut);
        root.setBottom(bas);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

