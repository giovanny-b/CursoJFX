/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author linux
 */
public class Formulario extends Application{
    
    public void start(Stage stage){
        stage.setTitle("Formulario JavaFX");
        stage.show();
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Scene scene = new Scene(grid, 350, 275);
        stage.setScene(scene);
        
        Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
                
        Text Scenetitle = new Text("Welcome");
        Scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(Scenetitle, 0, 0, 2, 1);
        
        Label userName = new Label("Nombre: ");
        grid.add(userName, 0, 1);
        
        TextField userText = new TextField();
        grid.add(userText, 1, 1);
        
        Label password = new Label("Contraseña: ");
        grid.add(password, 0, 2);
        
        PasswordField PasswordText = new PasswordField();
        grid.add(PasswordText, 1, 2);
        
        Button btn = new Button("Entrar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>(){
        
            public void handle(ActionEvent e){
                
                String nombre = userText.getText();
                String pass = PasswordText.getText();
                
                if (nombre.equals("") || pass.equals("")) {
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("¡Hay campos vacios!.");
                }else{
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Pase usted señor " + nombre);
                }
            }
        });
                
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
