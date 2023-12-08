package com.example.semesterprojekt2023;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToCreateCustomer(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Opretkunde.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCreatePackage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Opretpakke.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCreateCompany(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Opretfirma.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDeleteCustomer(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sletkunde.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDeletePackage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sletpakke.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDeleteCompany(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sletfirma.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSearchCustomer(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Søgkunde.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSearchPackage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Søgpakke.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSearchCompany(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Søgfirma.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
