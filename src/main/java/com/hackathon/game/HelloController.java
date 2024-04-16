package com.hackathon.game;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class HelloController {
    private Stage primaryStage;

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }
    @FXML
    private Label welcomeText;
    @FXML
    private Text start;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onLevel1Clicked() {
        MultiClicks multiClicksGame = new MultiClicks();
        multiClicksGame.start(primaryStage);
    }
}