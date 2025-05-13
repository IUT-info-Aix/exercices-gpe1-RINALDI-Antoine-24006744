package fr.amu.iut.exercice4;

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
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {

        panneau = new Pane();
        label = new Label();
        bas = new HBox();
        Button btnRouge = new Button("Rouge");
        Button btnBleu = new Button("Bleu");
        Button btnVert = new Button("Vert");
        bas.getChildren().addAll(btnRouge, btnBleu, btnVert);
        bas.setPadding( new Insets(10.0d));
        bas.setAlignment(Pos.CENTER );

        label.setPadding( new Insets(10.0d));
        BorderPane.setAlignment(label, Pos.CENTER);

        btnRouge.setOnAction(e -> {
            nbRouge++;
            panneau.setStyle("-fx-background-color: red;");
            label.setText("Rouge " + nbRouge);
            bas.setStyle("-fx-text-fill: red;");
        });

        btnBleu.setOnAction(e -> {
            nbBleu++;
            panneau.setStyle("-fx-background-color: blue;");
            label.setText("Bleu " + nbBleu);
            bas.setStyle("-fx-text-fill: blue;");
        });

        btnVert.setOnAction(e -> {
            nbVert++;
            panneau.setStyle("-fx-background-color: green;");
            label.setText("Vert " + nbVert);
            bas.setStyle("-fx-text-fill: green;");

        });

        root = new BorderPane();
        root.setTop(label);
        root.setCenter(panneau);
        root.setBottom(bas);

        Scene scene = new Scene( root );
        primaryStage.setScene( scene );
        primaryStage.setWidth(400);
        primaryStage.setHeight(200);
        primaryStage.show();
    }
}