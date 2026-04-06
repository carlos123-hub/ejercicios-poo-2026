import java.util.ArrayList;
import java.util.Comparator;

class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public int getPuntos() { return puntos; }

    @Override
    public String toString() {
        return nombre + " - " + puntos;
    }
}

public class Ranking {
    private ArrayList<Jugador> lista = new ArrayList<>();

    public void agregar(Jugador j) {
        lista.add(j);
    }

    public void clasificar() {
        lista.sort(Comparator.comparingInt(Jugador::getPuntos).reversed());
    }

    public void mostrarTop(int n) {
        for (int i = 0; i < Math.min(n, lista.size()); i++) {
            System.out.println(lista.get(i));
        }
    }

    public int puntosTotales() {
        int total = 0;
        for (Jugador j : lista) total += j.getPuntos();
        return total;
    }
}
