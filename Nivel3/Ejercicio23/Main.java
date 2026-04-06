public class Main {
    public static void main(String[] args) {
        CentralReservas c = new CentralReservas();
        c.agregar(new Reserva(1, "Ana", "2026-04-06", "101"));
        c.confirmar(1);
        System.out.println(c.reservasDelDia("2026-04-06"));
    }
}
