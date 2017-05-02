
package Telas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author DANILO
 */
public class Clientes extends Application{

    @Override
    public void start(Stage primaryStage)  {
        
        
        StackPane root = new StackPane();
        root.getChildren().addAll();
        
        Scene scene = new Scene(root, 1000, 600);
        
        primaryStage.setTitle("Clientes");
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
