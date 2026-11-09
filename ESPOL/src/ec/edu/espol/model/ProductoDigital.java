package ec.edu.espol.model;

public class ProductoDigital extends Producto {
    private double tamanoMB;
    private String formato;

    public ProductoDigital(String id, String nombre, double precio, String categoria, double tamanoMB, String formato) {
        super(id, nombre, precio, categoria);
        this.tamanoMB = tamanoMB;
        this.formato = formato;
    }

    @Override
    public String mostrarDetalles() {
        return String.format("PRODUCTO DIGITAL -> ID: %s | Nombre: %s | Precio: $%.2f | Categoria: %s | Tamano: %.1f MB | Formato: %s",
                id, nombre, precio, categoria, tamanoMB, formato);
    }

    public double getTamanoMB() { return tamanoMB; }
    public String getFormato() { return formato; }
}
