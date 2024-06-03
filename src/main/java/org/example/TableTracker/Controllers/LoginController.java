package org.example.TableTracker.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.example.TableTracker.Models.Admin;
import org.example.TableTracker.Models.Mesero;
import org.example.TableTracker.Models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class LoginController {

    @FXML
    private ImageView logoImage;

    @FXML
    private Label lblUsername;

    @FXML
    private TextField enterUsernameField;

    @FXML
    private Label lblPassword;

    @FXML
    private PasswordField enterPasswordField;

    @FXML
    private Button loginBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private Label lblInvalidlogin;

    @FXML
    private Label lblChooseAcc;

    @FXML
    private ChoiceBox<String> ChoiceBox;

    private List<Admin> adminList = new ArrayList<>();
    private List<Mesero> meseroList = new ArrayList<>();

    @FXML
    public void initialize() {
        // Add some sample users
        adminList.add(new Admin("admin1", "adminpass", "Admin Uno", "12345678"));
        meseroList.add(new Mesero("mesero1", "meseropass", "Mesero Uno", "87654321"));

        // Add account types to ChoiceBox
        ChoiceBox.getItems().addAll("Admin", "Mesero");

        // Hide the invalid login label initially
        lblInvalidlogin.setVisible(false);

        loginBtn.setOnAction(event -> handleLogin());
        cancelBtn.setOnAction(event -> handleCancel());
    }

    private void handleLogin() {
        String username = enterUsernameField.getText();
        String password = enterPasswordField.getText();
        String accountType = ChoiceBox.getValue();

        boolean loginSuccessful = false;

        if (accountType.equals("Admin")) {
            for (Admin admin : adminList) {
                if (admin.getUsuario().equals(username) && admin.getContrasenia().equals(password)) {
                    loginSuccessful = true;
                    // Redirect to admin dashboard
                    System.out.println("Inicio de sesión exitoso para el Admin: " + admin.getNombreApellido());
                    break;
                }
            }
        } else if (accountType.equals("Mesero")) {
            for (Mesero mesero : meseroList) {
                if (mesero.getUsuario().equals(username) && mesero.getContrasenia().equals(password)) {
                    loginSuccessful = true;
                    // Redirect to mesero dashboard
                    System.out.println("Inicio de sesión exitoso para el Mesero: " + mesero.getNombreApellido());
                    break;
                }
            }
        }

        if (!loginSuccessful) {
            lblInvalidlogin.setVisible(true);
        } else {
            lblInvalidlogin.setVisible(false);
            // Close the login window
            Stage stage = (Stage) loginBtn.getScene().getWindow();
            stage.close();
        }
    }

    private void handleCancel() {
        // Close the application
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }
}