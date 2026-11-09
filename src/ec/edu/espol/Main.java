package ec.edu.espol;

import ec.edu.espol.db.DatabaseConnection;
import ec.edu.espol.factory.CreadorProductoDigital;
import ec.edu.espol.factory.CreadorProductoFisico;
import ec.edu.espol.factory.CreadorProductoSuscripcion;
import ec.edu.espol.factory.ProductoFactory;
import ec.edu.espol.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== COMPROBACION SINGLETON ===");
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();

        System.out.println("HashCode DB1: " + conn1.hashCode());
        System.out.println("HashCode DB2: " + conn2.hashCode());
        System.out.println("Es la misma instancia: " + (conn1 == conn2));

        conn1.ejecutarConsulta("SELECT * FROM inventario");

        System.out.println("");
        System.out.println("=== COMPROBACION FACTORY METHOD ===");
        List<ProductoFactory> creadores = new ArrayList<>();

        creadores.add(new CreadorProductoFisico("PF-01", "Laptop Dell XPS 15", 1450.00, "Computacion", 2.1, "35x24x1.8 cm"));
        creadores.add(new CreadorProductoDigital("PD-01", "Licencia Antivirus 2026", 49.99, "Software", 350.5, "EXE"));
        creadores.add(new CreadorProductoSuscripcion("PS-01", "Suscripcion Premium 1 Anio", 99.00, "Servicios", 12, true));

        List<Producto> inventario = new ArrayList<>();
        for (ProductoFactory factory : creadores) {
            Producto p = factory.registrarProducto();
            inventario.add(p);
            conn1.ejecutarActualizacion("INSERT INTO productos VALUES ('" + p.getId() + "', '" + p.getNombre() + "')");
        }

        System.out.println("");
        System.out.println("=== PRODUCTOS EN INVENTARIO ===");
        for (Producto p : inventario) {
            System.out.println(p.mostrarDetalles());
        }
    }
}
