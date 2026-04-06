import java.util.ArrayList;

public class Cola {
    private ArrayList<Object> lista = new ArrayList<>();

    public void encolar(Object elem) {
        lista.add(elem);
    }

    public Object desencolar() {
        if (estaVacia()) throw new IllegalStateException("Cola vacía");
        return lista.remove(0);
    }

    public Object frente() {
        if (estaVacia()) throw new IllegalStateException("Cola vacía");
        return lista.get(0);
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public int tamaño() {
        return lista.size();
    }

    public void imprimirCola() {
        System.out.println(lista);
    }
}
