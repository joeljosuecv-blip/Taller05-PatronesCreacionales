package ec.edu.espol.model;

public abstract class Producto {
    protected String id;
    protected String nombre;
    protected double precio;
    protected String categoria;

    public Producto(String id, String nombre, double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public abstract String mostrarDetalles();

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public String getCategoria() { return categoria; }
}