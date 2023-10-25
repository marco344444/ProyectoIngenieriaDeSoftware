package base_de_datos_union;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class tipodetrabajador {
    private static Connection connection = null;

    public static Connection conectar() {
        try {
            if (connection == null || connection.isClosed()) {
                // Establecer la conexión a la base de datos SQLite ubicada en el paquete ferreteria_proyecto
                Class.forName("org.sqlite.JDBC");
                String dbPath = "jdbc:sqlite:src/ferreteria_proyecto/tipo_de_trabajador.ibd";
                connection = DriverManager.getConnection(dbPath);
                System.out.println("Conexión a la base de datos de tipo de trabajador exitosa.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Error al conectar a la base de datos de tipo de trabajador.");
        }
        return connection;
    }

    public static void desconectar() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexión a la base de datos de tipo de trabajador cerrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al cerrar la conexión a la base de datos de tipo de trabajador.");
        }
    }
}

