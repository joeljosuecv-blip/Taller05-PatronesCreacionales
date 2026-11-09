package ec.edu.espol.factory;

import ec.edu.espol.model.Producto;

public abstract class ProductoFactory {

    public abstract Producto crearProducto();

    public Producto registrarProducto() {
        Producto producto = crearProducto();
        System.out.println("[FACTORY] Objeto " + producto.getClass().getSimpleName() + " creado.");
        return producto;
    }
}
