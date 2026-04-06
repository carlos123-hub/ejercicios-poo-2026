import java.util.ArrayList;

enum EstadoReserva { PENDIENTE, CONFIRMADA, CANCELADA }

class Reserva {
    int id;
    String cliente, fecha, habitacion;
    EstadoReserva estado;

    public Reserva(int id, String cliente, String fecha, String habitacion) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.habitacion = habitacion;
        this.estado = EstadoReserva.PENDIENTE;
    }

    @Override
    public String toString() {
        return id + " - " + cliente + " - " + fecha + " - " + habitacion + " - " + estado;
    }
}

public class CentralReservas {
    private ArrayList<Reserva> lista = new ArrayList<>();

    public void agregar(Reserva r) {
        lista.add(r);
    }

    public void confirmar(int id) {
        for (Reserva r : lista) if (r.id == id) r.estado = EstadoReserva.CONFIRMADA;
    }

    public void cancelar(int id) {
        for (Reserva r : lista) if (r.id == id) r.estado = EstadoReserva.CANCELADA;
    }

    public ArrayList<Reserva> buscarPorCliente(String cliente) {
        ArrayList<Reserva> r = new ArrayList<>();
        for (Reserva x : lista) if (x.cliente.equalsIgnoreCase(cliente)) r.add(x);
        return r;
    }

    public ArrayList<Reserva> reservasDelDia(String fecha) {
        ArrayList<Reserva> r = new ArrayList<>();
        for (Reserva x : lista) if (x.fecha.equals(fecha)) r.add(x);
        return r;
    }
}
