package Inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Productos> productos;
    private List<Proveedor> proveedores;

    public Inventario() {
        productos = new ArrayList<>();
        proveedores = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Productos producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto del inventario por ID
    public void eliminarProducto(int id) {
        for (Productos producto : productos) {
            if (producto.getId() == id) {
                productos.remove(producto);
                break;
            }
        }
    }

    // Método para actualizar la información de un producto
    public void actualizarProducto(int id, Productos productoActualizado) {
        for (int i = 0; i < productos.size(); i++) {
            Productos producto = productos.get(i);
            if (producto.getId() == id) {
                productos.set(i, productoActualizado);
                break;
            }
        }
    }

    // Método para buscar un producto por ID
    public Productos buscarProductoPorId(int id) {
        for (Productos producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null; // Si no se encuentra el producto
    }

    // Método para obtener una lista de productos con cantidad baja
    public List<Productos> obtenerProductosConCantidadBaja(int cantidadMinima) {
        List<Productos> productosConCantidadBaja = new ArrayList<>();
        for (Productos producto : productos) {
            if (producto.getStock() < cantidadMinima) {
                productosConCantidadBaja.add(producto);
            }
        }
        return productosConCantidadBaja;
    }

    // Métodos para gestionar proveedores
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void eliminarProveedor(int nit) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNit() == nit) {
                proveedores.remove(proveedor);
                break;
            }
        }
    }

    public void actualizarProveedor(int nit, Proveedor proveedorActualizado) {
        for (int i = 0; i < proveedores.size(); i++) {
            Proveedor proveedor = proveedores.get(i);
            if (proveedor.getNit() == nit) {
                proveedores.set(i, proveedorActualizado);
                break;
            }
        }
    }

    public Proveedor buscarProveedorPorNit(int nit) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNit() == nit) {
                return proveedor;
            }
        }
        return null;
    }
    public List<Productos> getProductos() {
        return productos;
    }



    public int id;

    public Inventario(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
