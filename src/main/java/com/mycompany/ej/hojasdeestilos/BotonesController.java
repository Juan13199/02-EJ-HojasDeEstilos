/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.ej.hojasdeestilos;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author casqu
 */
public class BotonesController implements Initializable {

    @FXML AnchorPane panel;
    
    @FXML Button boton1;
    @FXML Button boton2;
    @FXML Button boton3;
    @FXML Button boton4;
    @FXML Button fin;
    
    @FXML
    private void estiloUno(ActionEvent event) throws IOException {
        // Limpiar los estilos que tuviera anteriormente
        panel.getStylesheets().clear();
        // Aplicar la hoja de estilos
        panel.getStylesheets().add(getClass().getClassLoader().getResource("css/estilo1.css").toExternalForm());

    }

    @FXML
    private void estiloDos(ActionEvent event){
         // Limpiar los estilos que tuviera anteriormente
        panel.getStylesheets().clear();
        // Aplicar la hoja de estilos
        panel.getStylesheets().add(getClass().getClassLoader().getResource("css/estilo2.css").toExternalForm());

    }
    
    
    @FXML
    private void sinEstilo(){
         // Limpiar los estilos que tuviera anteriormente
        panel.getStylesheets().clear();
        

    }
    
     @FXML
    private void estiloTres(ActionEvent event) throws IOException {
        // Limpiar los estilos que tuviera anteriormente
        panel.getStylesheets().clear();
        // Aplicar la hoja de estilos
        panel.getStylesheets().add(getClass().getClassLoader().getResource("css/estilo3.css").toExternalForm());

    }
    @FXML
    private void finish(ActionEvent event){
         Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
