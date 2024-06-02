package org.example.TableTracker.Models;

public class Admin extends Usuario {

    public Admin(String usuario,String contrasenia, String nombreApellido, String dni) {
        super(usuario,contrasenia, nombreApellido, dni);
    }

    public void gestionarMesas() {
        System.out.println("Gestionando mesas.");
    }

    public void gestionarMenu() {
        System.out.println("Gestionando menú.");
    }

    public void verHistorial() {
        System.out.println("Viendo historial.");
    }

    public void gestionarMeseros() {
        System.out.println("Gestionando meseros.");
    }
}
