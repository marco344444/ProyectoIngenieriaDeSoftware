package Inventario;

public class Inventario {
    public int id;
    public int stock; // Variable para el stock

    public Inventario(int id, int stock) {
        this.id = id;
        this.stock = stock; // Inicializa el stock al crear una instancia de Inventario
    }
//
    public Inventario() {
        this.id = 0; //
        this.stock = 0; // Inicializa el stock en 0 al crear una instancia de Inventario
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}


