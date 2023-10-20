package Facturacion;

import Inventario.Productos;

import java.util.Date;

public class Factura {

    public int id;
    public Venta venta;
    public Date fechaEmision;
    public String detalles;
    public double totalFactura;

    public Factura() {
    }

    //
    public Factura(int id, Venta venta,  Date fechaEmision, String detallesn, double totalFactura) {
        this.id = id;
        this.venta = venta;
        this.fechaEmision = fechaEmision;
        this.detalles = detalles;
        this.totalFactura = 0; // Inicialmente la factura está vacía
    }
    public void agregarVenta(Productos producto, int cantidad) {
        // Aquí puedes calcular el costo del producto y agregarlo a la factura
        double costo = producto.getPrecioUnitario() * cantidad;
        totalFactura += costo;
    }

    public void agregarCompra(Productos producto, int cantidad) {
        // Aquí puedes calcular el costo del producto y agregarlo a la factura
        double costo = producto.getPrecioUnitario() * cantidad;
        totalFactura += costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", venta=" + venta +
                ", fechaEmision=" + fechaEmision +
                ", detalles='" + detalles + '\'' +
                ", totalFactura=" + totalFactura +
                '}';
    }
}