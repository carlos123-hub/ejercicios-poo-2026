mport java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> lista = new ArrayList<>();
        lista.add(new EmpleadoFijo("Luis", "E1", 2500));
        lista.add(new EmpleadoTemporal("Ana", "E2", 100, 15));

        double nomina = 0;
        for (Empleado e : lista) nomina += e.calcularPago();

        System.out.println("Nómina total: " + nomina);
    }
}
