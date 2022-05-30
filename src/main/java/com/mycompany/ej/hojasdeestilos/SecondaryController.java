package com.mycompany.ej.hojasdeestilos;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
     private void vistaTres() throws IOException {
        App.setRoot("botones");
    }
}