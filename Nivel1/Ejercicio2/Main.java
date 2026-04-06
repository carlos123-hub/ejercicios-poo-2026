public class Main {
    public static void main(String[] args) {
        Automovil a = new Automovil("Toyota", "Fortuner", 2026);
        a.acelerar(80);
        a.frenar(30);
        a.getEstado();
    }
}
