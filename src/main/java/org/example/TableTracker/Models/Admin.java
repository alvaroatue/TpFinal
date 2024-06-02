package org.example.TableTracker.Models;

public class Admin extends Usuario {

    public Admin(Login login, String nombreApellido, String dni) {
        super(login, nombreApellido, dni);
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
