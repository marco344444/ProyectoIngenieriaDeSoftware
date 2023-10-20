package Persona.Login;

import Persona.Trabajador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthenticationSystem {
    private List<Usuario> usuarios;

    public AuthenticationSystem() {
        usuarios = new ArrayList<>();
        // Agregar usuarios a la lista con sus respectivos trabajadores
        usuarios.add(new Usuario("caja", "caja123", new Trabajador(1, "NombreCaja", "ApellidoCaja", "DirecciónCaja", "123456", "caja@empresa.com", "Caja", new Date())));
        usuarios.add(new Usuario("admin", "admin123", new Trabajador(2, "NombreAdmin", "ApellidoAdmin", "DirecciónAdmin", "789123", "admin@empresa.com", "Administrador", new Date())));
        usuarios.add(new Usuario("bodega", "bodega123", new Trabajador(3, "NombreBodega", "ApellidoBodega", "DirecciónBodega", "456789", "bodega@empresa.com", "Bodega", new Date())));
    }

    public boolean autenticar(String nombreUsuario, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombreUsuario.equals(nombreUsuario) && usuario.verificarContrasena(contrasena)) {
                // Autenticación exitosa
                String tipoTrabajador = usuario.getTrabajador().getTipoTrabajador();
                switch (tipoTrabajador) {
                    case "Caja":
                        // Lógica para usuario de caja
                        break;
                    case "Administrador":
                        // Lógica para usuario administrador
                        break;
                    case "Bodega":
                        // Lógica para usuario de bodega
                        break;
                    default:
                        // Tipo de trabajador no reconocido
                        break;
                }
                return true;
            }
        }
        // Autenticación fallida
        return false;
    }
    public Trabajador getTrabajador(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombreUsuario.equals(nombreUsuario)) {
                return usuario.getTrabajador();
            }
        }
        return null; // Si no se encuentra el usuario
    }

}
