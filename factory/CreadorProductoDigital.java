package ec.edu.espol.factory;

import ec.edu.espol.model.Producto;
import ec.edu.espol.model.ProductoDigital;

public class CreadorProductoDigital extends ProductoFactory {
    private String id;
    private String nombre;
    private double precio;
    private String categoria;
    private double tamanoMB;
    private String formato;

    public CreadorProductoDigital(String id, String nombre, double precio, String categoria, double tamanoMB, String formato) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.tamanoMB = tamanoMB;
        this.formato = formato;
    }

    @Override
    public Producto crearProducto() {
        return new ProductoDigital(id, nombre, precio, categoria, tamanoMB, formato);
    }
}