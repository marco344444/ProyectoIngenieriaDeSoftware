package Facturacion;

import Inventario.Proveedor;
import Persona.Trabajador;

import java.util.Date;

public class Compra {

    public int id;
    public Trabajador trabajador;
    public Proveedor proveedor;
    public Date fechaCompra;
    public double totalCompra;

    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", trabajador=" + trabajador +
                ", proveedor=" + proveedor +
                ", fechaCompra=" + fechaCompra +
                ", totalCompra=" + totalCompra +
                '}';
    }

    public Compra() {
    }

    public Compra(int id, Trabajador trabajador, Proveedor proveedor, Date fechaCompra, double totalCompra) {
        this.id = id;
        this.trabajador = trabajador;
        this.proveedor = proveedor;
        this.fechaCompra = fechaCompra;
        this.totalCompra = totalCompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

}