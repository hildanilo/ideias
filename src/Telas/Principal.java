package Telas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author DANILO
 */
public class Principal extends Application  {

    @Override
    public void start(Stage primaryStage)  {
       
        
        StackPane root = new StackPane();
        root.getChildren().addAll();
        
        Scene scene = new Scene(root, 1200, 600);
        
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Principal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
