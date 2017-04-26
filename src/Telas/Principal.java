package Telas;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
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
        
        
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        
        
        //Abrir uma janela semi maximizada de acordo com tamanho do monitor
        
        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());
        
        //Abrir por padrão a tela totalmente maximizada
        //primaryStage.setMaximized(true);
        
        
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
