package ec.edu.espol.model;

public class ProductoSuscripcion extends Producto {
    private int duracionMeses;
    private boolean autoRenovable;

    public ProductoSuscripcion(String id, String nombre, double precio, String categoria, int duracionMeses, boolean autoRenovable) {
        super(id, nombre, precio, categoria);
        this.duracionMeses = duracionMeses;
        this.autoRenovable = autoRenovable;
    }

    @Override
    public String mostrarDetalles() {
        return String.format("SUSCRIPCION      -> ID: %s | Nombre: %s | Precio: $%.2f | Categoria: %s | Duracion: %d meses | Renovable: %b",
                id, nombre, precio, categoria, duracionMeses, autoRenovable);
    }
}