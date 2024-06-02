package org.example.TableTracker.Models;

import java.util.List;
import java.util.ArrayList;

public class Mesero extends Usuario {
    private List<Mesa> listaMesasAsignadas;

    public Mesero(String usuario, String contrasenia, String nombreApellido, String dni) {
        super(usuario,contrasenia, nombreApellido, dni);
        this.listaMesasAsignadas = new ArrayList<>();
    }

    public void asignarMesa(Mesa mesa) {
        listaMesasAsignadas.add(mesa);
        System.out.println("Mesa asignada.");
    }

    public void tomarPedido() {
        System.out.println("Tomando pedido.");
    }

    public List<Mesa> getListaMesasAsignadas() {
        return listaMesasAsignadas;
    }
}