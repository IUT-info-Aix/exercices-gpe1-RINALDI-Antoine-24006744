package fr.amu.iut.exercice7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CounterMain extends Application  {
    public static void main(String[] args) {
        launch(args) ;
    }

    @Override
    public void start(Stage stage) {
        try {
            BorderPane root = FXMLLoader.load(getClass().getClassLoader().getResource("exercice7/CounterView.fxml"));
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}