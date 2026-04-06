public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() { return nombre; }

    public double getPrecioConIVA() {
        return precio * 1.19;
    }

    public void aplicarDescuento(double pct) {
        if (pct >= 0 && pct <= 100) {
            precio = precio * (1 - pct / 100);
        }
    }

    @Override
    public String toString() {
        return nombre + " - " + categoria + " - " + precio;
    }
}
