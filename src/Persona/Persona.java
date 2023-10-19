package Persona;

public class Persona {
    public  int id;
    public String nombre;
    public String apellido;
    public String direccion;
    public String telefono;
    public String correoElectronico;

    public Persona(int id, String nombre, String apellido, String direccion, String telefono, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return String.format("Persona(id=%d, nombre=%s, apellido=%s, direccion=%s, telefono=%s, correoElectronico=%s)",
                id, nombre, apellido, direccion, telefono, correoElectronico);
    }
}