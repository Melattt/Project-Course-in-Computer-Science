package hotelproject;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
public class launcher extends Application {


   private Stage primaryStage;
    private BorderPane rootLayout;
    public static Stage stage = new Stage();

    public static void main(String[] args) {
        Controller control = new Controller();
        Application.launch(launcher.class, args);
    }

    @Override
    public void start(Stage s) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/signin.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
         stage.setTitle("Hydrogen Hotel Login");
         stage.setScene(scene);
         stage.show();
     }
  
}