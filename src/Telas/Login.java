package Telas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author DANILO
 */
public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Configuração do Label Login
        Label lblLogin = new Label("Login");
        lblLogin.setTranslateX(-70);
        lblLogin.setTranslateY(-40);
        
        Label lblSenha = new Label("Senha");
        lblSenha.setTranslateX(-70);
        lblSenha.setTranslateY(20);
        
        //Configuração do Form TxtLogin
        TextField txtLogin = new TextField();
        // Define o tamanho do Form
        txtLogin.setMaxSize(100, 0);
         //Posição
        txtLogin.setTranslateX(0);
        txtLogin.setTranslateY(-40);
        
        PasswordField txtSenha = new PasswordField();
         // Define o tamanho do Form
        txtSenha.setMaxSize(100, 0);
        //Posição
        txtSenha.setTranslateX(0);
        txtSenha.setTranslateY(20);
        
        Button btnAcessar = new Button("Acessar");
        btnAcessar.setTranslateX(-60);
        btnAcessar.setTranslateY(60);
        
        Button btnCancelar = new Button("Cancelar");
        btnCancelar.setTranslateX(70);
        btnCancelar.setTranslateY(60);
       
        btnAcessar.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Principal Prin = new Principal();
                Prin.start(primaryStage);
            }
        });
        
        btnCancelar.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().addAll(lblLogin,lblSenha,txtLogin,txtSenha,btnAcessar,btnCancelar);
        
        Scene scene = new Scene(root, 300, 200);
        //Some com a estrutura da janela
        primaryStage.initStyle(StageStyle.UNDECORATED);
        
        // Some com maximizar e minimizar
       // primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setTitle("Login");
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
