package org.example.TableTracker.Models;

public abstract class Usuario {
    private String username;
    private String password;
    private final String dni;
    private String nombreCompleto;

    public Usuario(String username, String password, String nombreCompleto, String dni) {
        this.username = username;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }
}
