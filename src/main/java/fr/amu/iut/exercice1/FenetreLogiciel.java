package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {;

        // Ajout d'une barre de menu
        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("Help");

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(menu1, menu2, menu3);

        // Ajout du conteneur à la scene
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
        //primaryStage.setStyle("-fx-font-weight: bold");

        GridPane gridpane = new GridPane();

        // Set one constraint at a time...
        // Places the button at the first row and second column
        Button button = new Button();
        GridPane.setRowIndex(button, 0);
        GridPane.setColumnIndex(button, 1);

        // or convenience methods set more than one constraint at once...
        Label label = new Label();
        GridPane.setConstraints(label, 2, 0); // column=2 row=0

        // don't forget to add children to gridpane
        gridpane.getChildren().addAll(button, label);

        // Affichage de la fenêtre
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}

