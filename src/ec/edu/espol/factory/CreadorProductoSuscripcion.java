package ec.edu.espol.factory;

import ec.edu.espol.model.Producto;
import ec.edu.espol.model.ProductoSuscripcion;

public class CreadorProductoSuscripcion extends ProductoFactory {
    private String id;
    private String nombre;
    private double precio;
    private String categoria;
    private int duracionMeses;
    private boolean autoRenovable;

    public CreadorProductoSuscripcion(String id, String nombre, double precio, String categoria, int duracionMeses, boolean autoRenovable) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.duracionMeses = duracionMeses;
        this.autoRenovable = autoRenovable;
    }

    @Override
    public Producto crearProducto() {
        return new ProductoSuscripcion(id, nombre, precio, categoria, duracionMeses, autoRenovable);
    }
}
