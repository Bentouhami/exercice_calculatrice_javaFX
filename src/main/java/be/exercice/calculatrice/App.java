package be.exercice.calculatrice;

import javafx.application.Application;
import javafx.scene.Scene;
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