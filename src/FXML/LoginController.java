/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author linux
 */
public class LoginController implements Initializable {

    @FXML
    private TextField TXTnombre;
    @FXML
    private PasswordField TXTpass;
    @FXML
    private Button btn;
    @FXML
    private Label Texto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Entrar(ActionEvent event) {
        
        String nombre = TXTnombre.getText();
        String pass = TXTpass.getText();
       
        if (nombre.equals("") || pass.equals("")) {
            Texto.setText("Campos vacios.");
        }else{
            Texto.setText("Hola, " + nombre);
        }
        
    }
    
}
