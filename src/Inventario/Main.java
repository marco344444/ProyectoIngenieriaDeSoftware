package Inventario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        // Agregar proveedores de ejemplo
        Proveedor proveedor1 = new Proveedor(1, "Proveedor1", "Dirección1", 123456789, "proveedor1@example.com");
        Proveedor proveedor2 = new Proveedor(2, "Proveedor2", "Dirección2", 987654321, "proveedor2@example.com");
        inventario.agregarProveedor(proveedor1);
        inventario.agregarProveedor(proveedor2);

        while (true) {
            System.out.println("\nMenú de Inventario:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Buscar producto por ID");
            System.out.println("5. Listar productos con stock bajo");
            System.out.println("6. mostrar todos los productos");
            System.out.println("7. Salir");

            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese la descripción del producto: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese la categoría del producto: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Ingrese el precio unitario del producto: ");
                    float precioUnitario = scanner.nextFloat();
                    System.out.print("Ingrese el stock inicial del producto: ");
                    int stock = scanner.nextInt();

                    Productos nuevoProducto = new Productos(1, nombreProducto, descripcion, categoria, precioUnitario, stock);
                    inventario.agregarProducto(nuevoProducto);
                    break;

                case 2:
                    System.out.print("Ingrese el ID del producto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    inventario.eliminarProducto(idEliminar);
                    break;

                case 3:
                    System.out.print("Ingrese el ID del producto a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    Productos productoActualizado = inventario.buscarProductoPorId(idActualizar);
                    if (productoActualizado != null) {
                        System.out.println("Producto actual: " + productoActualizado);
                        System.out.print("Ingrese el nuevo stock del producto: ");
                        int nuevoStock = scanner.nextInt();
                        System.out.print("Ingrese el nuevo precio unitario del producto: ");
                        float nuevoPrecioUnitario = scanner.nextFloat();
                        productoActualizado.setStock(nuevoStock);
                        productoActualizado.setPrecioUnitario(nuevoPrecioUnitario);
                        inventario.actualizarProducto(idActualizar, productoActualizado);
                    } else {
                        System.out.println("El producto no se encontró.");
                    }
                    break;


                case 4:
                    System.out.print("Ingrese el ID del producto a buscar: ");
                    int idBuscar = scanner.nextInt();
                    Productos productoBuscado = inventario.buscarProductoPorId(idBuscar);
                    if (productoBuscado != null) {
                        System.out.println("Producto encontrado: " + productoBuscado);
                    } else {
                        System.out.println("El producto no se encontró.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese la cantidad mínima para notificar: ");
                    int cantidadMinima = scanner.nextInt();
                    System.out.println("Productos con stock bajo:");
                    for (Productos producto : inventario.obtenerProductosConCantidadBaja(cantidadMinima)) {
                        System.out.println(producto);
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                case 6:
                    System.out.println("Lista de todos los productos registrados:");
                    for (Productos producto : inventario.getProductos()) {
                        System.out.println(producto);
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);


            }
        }
    }
}
