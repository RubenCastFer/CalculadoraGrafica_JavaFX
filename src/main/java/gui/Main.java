/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gui;

/*import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("viewsandcontrollers/main/Main.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}*/
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
 
public class Main extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("viewsandcontrollers/main/CalculadoraVista.fxml"));
            // Cargo la ventana
            Pane ventana = (Pane) loader.load();
 
            // Cargo el scene
            Scene scene = new Scene(ventana);
 
            // Seteo la scene y la muestro
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}

