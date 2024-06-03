package org.example.TableTracker.Controllers.Mesero;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.awt.event.ActionEvent;

class MesaController {

    @FXML
    private Button btnMesa1;
    @FXML
    private Button btnMesa2;
    @FXML
    private Button btnMesa3;
    @FXML
    private Button btnMesa4;
    @FXML
    private Button btnMesa5;
    @FXML
    private Button btnMesa6;
    @FXML
    private Button btnMesa7;
    @FXML
    private Button btnMesa8;
    @FXML
    private Button btnMesa9;

    public void initialize() {
        // Puedes inicializar algo si es necesario
    }

    @FXML
    private void handleMesaAction(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String mesaId = clickedButton.getId();

        // Realiza las acciones necesarias según el botón clicado (mesa seleccionada)
        iniciarPedido(mesaId);
    }

    private void iniciarPedido(String mesaId) {
        // Lógica para iniciar un pedido en la mesa seleccionada
        // Puedes personalizar esto según tus necesidades
        System.out.println("Iniciando pedido en la " + mesaId);
        mostrarMensaje("Pedido", "Pedido iniciado en la " + mesaId);
    }

    private void agregarPlato(String mesaId, String plato) {
        // Lógica para agregar un plato a la mesa seleccionada
        System.out.println("Agregando " + plato + " a la " + mesaId);
        mostrarMensaje("Agregar Plato", "Agregado " + plato + " a la " + mesaId);
    }

    private void facturar(String mesaId) {
        // Lógica para facturar la mesa seleccionada
        System.out.println("Facturando la " + mesaId);
        mostrarMensaje("Facturar", "Mesa " + mesaId + " facturada.");
    }

    private void mostrarMensaje(String titulo, String contenido) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
