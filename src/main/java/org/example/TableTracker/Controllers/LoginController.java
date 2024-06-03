package org.example.TableTracker.Controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import org.example.TableTracker.Models.Usuario;

import java.util.HashSet;

public class LoginController {

    private HashSet <Usuario> users = new HashSet<>();
    @FXML
    private ChoiceBox<String> ChoiceBox;

    @FXML
    private TextField enterUsernameField;

    @FXML
    private PasswordField enterPasswordField;

    @FXML
    private Button loginBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private Label lblInvalidLogin;
    @FXML
    public void initialize() {
        // Inicializar el ComboBox con los tipos de cuenta
        ChoiceBox.getItems().addAll("Admin", "Mesero");
    }
    public LoginController() {
        // Agregar usuarios al conjunto
        users.add(new Usuario("admin","123", "AlvaroAtue", "44576753") {
        });
        users.add(new Usuario("mesero", "456", "LucreciaMartin","111111") {
        });
    }
    @FXML
    private void handleLoginAction(ActionEvent event) {
        String selectedAccountType = ChoiceBox.getValue();
        String username = enterUsernameField.getText();
        String password = enterPasswordField.getText();

        if (users.contains()) {
            showAlert(AlertType.INFORMATION, "Login Successful", "Welcome, " + username + "!");
        } else {
            lblInvalidLogin.setText("Invalid login. Please try again.");
        }
    }


}
