package org.example.TableTracker.Models;

public abstract class Usuario {
    protected Login login;
    protected String nombreApellido;
    protected String dni;

    public Usuario(Login login, String nombreApellido, String dni) {
        this.login = login;
        this.nombreApellido = nombreApellido;
        this.dni = dni;
    }

    public void login(String username, String password) {
        if (login.validarUsuario(username, password)) {
            System.out.println("Login exitoso.");
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }

    public void logout() {
        System.out.println("Logout exitoso.");
    }
}
