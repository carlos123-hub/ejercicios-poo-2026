public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Laptop", 2000, "Tecnología");
        System.out.println("Antes: " + p);
        System.out.println("Con IVA: " + p.getPrecioConIVA());
        p.aplicarDescuento(10);
        System.out.println("Después: " + p);
    }
}
