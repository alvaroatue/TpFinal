package org.example.TableTracker.Models;

import java.util.Objects;

public abstract class Usuario {
    protected String usuario;
    protected String contrasenia;
    protected String nombreApellido;
    protected String dni;

    public Usuario(String nombreUsuario, String contraseña, String nombreApellido, String dni) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario1 = (Usuario) o;
        return Objects.equals(usuario, usuario1.usuario) && Objects.equals(contrasenia, usuario1.contrasenia) && Objects.equals(nombreApellido, usuario1.nombreApellido) && Objects.equals(dni, usuario1.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, contrasenia, nombreApellido, dni);
    }

}
