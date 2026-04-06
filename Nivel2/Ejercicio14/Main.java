public class Main {
    public static void main(String[] args) {
        Ranking r = new Ranking();
        r.agregar(new Jugador("Juan", 50));
        r.agregar(new Jugador("Ana", 90));
        r.agregar(new Jugador("Luis", 70));

        r.clasificar();
        r.mostrarTop(2);
        System.out.println("Puntos totales: " + r.puntosTotales());
    }
}
