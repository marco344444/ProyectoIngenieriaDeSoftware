package Persona;

import java.util.Date;

public class Trabajador extends Persona {

    private String tipoTrabajador;
    private Date fechaContratacion;

    public Trabajador(int id, String nombre, String apellido, String direccion, String telefono, String correoElectronico,
                      String tipoTrabajador, Date fechaContratacion) {
        super(id, nombre, apellido, direccion, telefono, correoElectronico);
        this.tipoTrabajador = tipoTrabajador;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "tipoTrabajador='" + tipoTrabajador + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}