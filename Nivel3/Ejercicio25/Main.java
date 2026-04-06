public class Main {
    public static void main(String[] args) {
        Cola c = new Cola();
        c.encolar("Cliente1");
        c.encolar("Cliente2");
        c.encolar("Cliente3");

        c.imprimirCola();
        System.out.println("Frente: " + c.frente());
        c.desencolar();
        c.imprimirCola();
    }
}
