package Telas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author DANILO
 */
public class Principal extends Application  {

    @Override
    public void start(Stage primaryStage)  {
       
        MenuBar menuBar = new MenuBar();
        menuBar.setTranslateX(0);
        menuBar.setTranslateY(-485);
        
        // --- Menu Arquivos
        Menu menuFile = new Menu("Arquivo");
        MenuItem add = new MenuItem("Visivel");
        menuFile.getItems().addAll(add);
        
        // --- Menu Configurações
        Menu menuEdit = new Menu("Configuração");
        
        //Encapsula menu
        menuBar.getMenus().addAll(menuFile, menuEdit);
        
        
        //--- Criar Botão Cadastro 
        Button btnCadastro = new Button("Cadastro");
        
        //--- Criar Botão Cadastro 
        Button btnConsulta = new Button("Consulta");
        
        //--- Criar Vbox e encapsula botão nele
        VBox Vbx = new VBox();
        Vbx.getChildren().addAll(btnCadastro,btnConsulta);
        
        
        //--- Criar Title pane inseri vbox
        TitledPane t1 = new TitledPane("Clientes",Vbx);
        TitledPane t2 = new TitledPane("Pedidos", new Button("Criar"));
        //--- Criar Acordion e 
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(t1, t2);
        //--- Criar Vbox
        VBox VbPanel = new VBox();
        //--- Tamanho do Vbox
        VbPanel.setMaxWidth(200);
        //--- Posição do Vbox
        VbPanel.setTranslateX(-850);
        VbPanel.setTranslateY(50);
        //--- Inserindo o Acordion dentro do Vbox
        VbPanel.getChildren().addAll(accordion);
        
        Image imgFechar = new Image(getClass().getResourceAsStream("/IMG/Fechar.png"));
        Image imgMaximizar = new Image(getClass().getResourceAsStream("/IMG/Maximizar.png"));
        Image imgMinimizar = new Image(getClass().getResourceAsStream("/IMG/minimizar.png"));
         
        Button fechar = new Button("",new ImageView(imgFechar));
        fechar.setTranslateX(940);
        fechar.setTranslateY(-510);
        fechar.setStyle("-fx-focus-color: transparent;\n" + "-fx-faint-focus-color: transparent;");
        
        fechar.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Stage stage = (Stage) fechar.getScene().getWindow();
                stage.close();
            }
        });
        
        Button maximizar = new Button("",new ImageView(imgMaximizar));
        maximizar.setTranslateX(910);
        maximizar.setTranslateY(-510);
        maximizar.setStyle("-fx-focus-color: transparent;\n" + "-fx-faint-focus-color: transparent;");
        
        Button minimizar = new Button("",new ImageView(imgMinimizar));
        minimizar.setTranslateX(880);
        minimizar.setTranslateY(-510);
        minimizar.setStyle("-fx-focus-color: transparent;\n" + "-fx-faint-focus-color: transparent;");
                
        StackPane root = new StackPane();
        root.getChildren().addAll(menuBar, VbPanel,fechar,maximizar,minimizar);
        
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
