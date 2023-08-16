package gui_javafx_mvc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;


public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML layout from the MainWindow.fxml file
        URL resource = getClass().getResource("MainWindow.fxml");
//        URL resource = getClass().getResource("");
        Parent root = FXMLLoader.load(resource);

        // Create a scene and set the layout as its root
        Scene scene = new Scene(root, 400, 300);

        // Set the title for the application window
        stage.setTitle("JavaFX MVC Assignment");

        // Set the scene on the stage and display it
        stage.setScene(scene);
        stage.show();
    }

    // Main method to launch the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }
}
