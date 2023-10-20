package Inventario;

public class Productos {

    private int id;
    private String nombreProducto;
    private String descripcion;
    private String categoria;
    private float precioUnitario;
    private int stock;

    public Productos() {
        // Constructor sin parámetros
    }

    public Productos(int id, String nombreProducto, String descripcion, String categoria, float precioUnitario, int stock) {
        // Constructor con parámetros
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stock=" + stock +
                '}';
    }
}