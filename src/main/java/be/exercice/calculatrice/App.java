package be.exercice.calculatrice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    private Scene scene;
    private Model model;
    private PrimaryController control;

    @Override
    public void start(Stage stage) throws IOException {
        model = new Model();
        control = new PrimaryController();
        // control.initialzer();
        
        
        scene = new Scene(model.getRoot(), 300, 300);
        
        stage.setScene(scene);
        stage.setTitle("My FX Claculator");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}