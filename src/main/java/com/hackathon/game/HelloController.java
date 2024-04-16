package com.hackathon.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Stage primaryStage;
    private  CatchMe catchMe;
    private RandomNumberGuess randomNumberGuess;

    public void initialize(){
        catchMe = new CatchMe();
        randomNumberGuess = new RandomNumberGuess();
    }
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
    public void onLevel1Clicked() throws IOException {
        System.out.print("Comes here");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MultiClicks.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        Parent root = fxmlLoader.load();
        MultiClicksController controller = fxmlLoader.getController();;
        controller.setPrimaryStage(primaryStage);
        primaryStage.setScene(scene);
    }
    @FXML
    protected void onStartClick(){
        // Create the instruction card
        VBox instructionCard = new VBox();
        instructionCard.setStyle("-fx-background-color: #F0F0F0; -fx-padding: 20px; -fx-spacing: 10px;");

        // Add title label
        Label titleLabel = new Label("Game Instructions");
        titleLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");
        instructionCard.getChildren().add(titleLabel);

        // Add instruction labels
        Label step1Label = new Label("Step 1: Click on the circles to start playing.");
        Label step2Label = new Label("Step 2: Follow the instructions on each circle.");
        Label step3Label = new Label("Step 3: Complete all steps to win the game.");
        step1Label.setStyle("-fx-font-size: 14px;");
        step2Label.setStyle("-fx-font-size: 14px;");
        step3Label.setStyle("-fx-font-size: 14px;");
        instructionCard.getChildren().addAll(step1Label, step2Label, step3Label);

        // Create an alert to display the instruction card
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Game Instructions");
        alert.getDialogPane().setContent(instructionCard);

        // Show the alert
        alert.showAndWait();
    }

    @FXML
    protected void onLevel2Clicked() throws IOException {
//        System.out.print("Comes here");
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("catchme.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
////        Parent root = fxmlLoader.load();
//        CatchMeController controller = fxmlLoader.getController();;
//        controller.setPrimaryStage(primaryStage);
//        primaryStage.setScene(scene);
        catchMe.start(primaryStage);
    }
    @FXML
    protected void onLevel3Clicked() throws IOException {
//        System.out.print("Comes here");
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("catchme.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
////        Parent root = fxmlLoader.load();
//        CatchMeController controller = fxmlLoader.getController();;
//        controller.setPrimaryStage(primaryStage);
//        primaryStage.setScene(scene);
        randomNumberGuess.start(primaryStage);
    }
}