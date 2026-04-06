abstract class Empleado {
    protected String nombre, id;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularPago();
}

class EmpleadoFijo extends Empleado {
    private double salarioMensual;

    public EmpleadoFijo(String nombre, String id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}

class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoTemporal(String nombre, String id, int horasTrabajadas, double tarifaHora) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaHora;
    }
}
