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
}