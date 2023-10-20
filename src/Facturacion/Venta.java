package Facturacion;

import Persona.Cliente;
import Persona.Trabajador;

import java.util.Date;

public class Venta {

    public int id;
    public Trabajador trabajador;
    public Cliente cliente;
    public Date fechaVenta;
    private double totalVenta;

    public Venta() {
    }

    public Venta(int id, Trabajador trabajador, Cliente cliente, Date fechaVenta, double totalVenta) {
        this.id = id;
        this.trabajador = trabajador;
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", trabajador=" + trabajador +
                ", cliente=" + cliente +
                ", fechaVenta=" + fechaVenta +
                ", totalVenta=" + totalVenta +
                '}';
    }
}