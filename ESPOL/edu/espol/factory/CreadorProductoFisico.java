package ec.edu.espol.factory;

import ec.edu.espol.model.Producto;
import ec.edu.espol.model.ProductoFisico;

public class CreadorProductoFisico extends ProductoFactory {
    private String id;
    private String nombre;
    private double precio;
    private String categoria;
    private double pesoKg;
    private String dimensiones;

    public CreadorProductoFisico(String id, String nombre, double precio, String categoria, double pesoKg, String dimensiones) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.pesoKg = pesoKg;
        this.dimensiones = dimensiones;
    }

    @Override
    public Producto crearProducto() {
        return new ProductoFisico(id, nombre, precio, categoria, pesoKg, dimensiones);
    }
}
