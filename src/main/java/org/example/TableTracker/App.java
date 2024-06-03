package org.example.TableTracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane load = FXMLLoader.load(getClass().getResource("resources/Fxmls/Login.fxml"));
        Scene login = new Scene(load);
        stage.setScene(login);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}