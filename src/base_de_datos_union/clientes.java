package base_de_datos_union;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class clientes {
    private static Connection connection = null;

    public static Connection conectar() {
        try {
            if (connection == null || connection.isClosed()) {
                // Establecer la conexión a la base de datos SQLite ubicada en el paquete ferreteria_proyecto
                Class.forName("org.sqlite.JDBC");
                String dbPath = "jdbc:sqlite:src/ferreteria_proyecto/clientes.ibd";
                connection = DriverManager.getConnection(dbPath);
                System.out.println("Conexión a la base de datos exitosa.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Error al conectar a la base de datos.");
        }
        return connection;
    }

    public static void desconectar() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexión a la base de datos cerrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al cerrar la conexión a la base de datos.");
        }
    }
}

