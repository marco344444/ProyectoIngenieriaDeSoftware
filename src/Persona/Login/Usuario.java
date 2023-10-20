package Persona.Login;

import Persona.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nombreUsuario;
    private String contrasena;
    private Trabajador trabajador;

    public Usuario(String nombreUsuario, String contrasena, Trabajador trabajador) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.trabajador = trabajador;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public boolean verificarContrasena(String contrasena) {
        return this.contrasena.equals(contrasena);
    }
}

