/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author linux
 */
public class Eventos extends Application implements EventHandler <ActionEvent>{
    
    Button btnadd;
    Button btnsub;
    Button reset;
    Label lbl;
    int iCounter = 0;
    
    @Override
    public void start(Stage stage){
        
        btnadd = new Button();
        btnadd.setText("Add");
        btnadd.setOnAction(this);
        
        btnsub = new Button();
        btnsub.setText("Sustraer");
        btnsub.setOnAction(this);
        
        reset = new Button();
        reset.setText("Reiniciar");
        reset.setOnAction(this);
        
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));
        
        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl, btnadd, btnsub, reset);
        
        Scene scene = new Scene(pane, 300, 150);
         
        stage.setScene(scene);
        stage.setTitle("add/sub");
        stage.show();
        stage.setResizable(false);
        
    }
    
    @Override
    public void handle(ActionEvent e){
        if (e.getSource() == btnadd) {
            iCounter++;
        }if(e.getSource() == btnsub){
            
            iCounter--;
            
        }if(e.getSource() == reset){
            iCounter = 0;
            lbl.setText("0");
            System.out.println("Precionado XD");
            
        }
        lbl.setText(Integer.toString(iCounter));
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
