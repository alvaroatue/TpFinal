package org.example.TableTracker.Models;

public class Admin extends Usuario {

    public Admin(String username, String password, String nombreCompleto, String dni) {
        super(username, password, nombreCompleto, dni);
    }

    @Override
    public String toString() {
        return "Admin";
    }
}
