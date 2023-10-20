package Facturacion;

import java.util.Date;

public class Factura {

    private int id;
    private Venta venta;
    private Date fechaEmision;
    private String detalles;
    private double totalFactura;

    public Factura() {
    }

    public Factura(int id, Venta venta, Date fechaEmision, String detalles, double totalFactura) {
        this.id = id;
        this.venta = venta;
        this.fechaEmision = fechaEmision;
        this.detalles = detalles;
        this.totalFactura = totalFactura;
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

}