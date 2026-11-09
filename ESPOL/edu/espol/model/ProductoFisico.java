package ec.edu.espol.model;

public class ProductoFisico extends Producto {
    private double pesoKg;
    private String dimensiones;

    public ProductoFisico(String id, String nombre, double precio, String categoria, double pesoKg, String dimensiones) {
        super(id, nombre, precio, categoria);
        this.pesoKg = pesoKg;
        this.dimensiones = dimensiones;
    }

    @Override
    public String mostrarDetalles() {
        return String.format("ARTICULO FISICO  -> ID: %s | Nombre: %s | Precio: $%.2f | Categoria: %s | Peso: %.2f kg | Dimensiones: %s",
                id, nombre, precio, categoria, pesoKg, dimensiones);
    }

    public double getPesoKg() { return pesoKg; }
    public String getDimensiones() { return dimensiones; }
}
