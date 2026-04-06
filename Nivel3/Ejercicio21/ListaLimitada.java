import java.util.ArrayList;

class CapacidadExcedidaException extends RuntimeException {
    public CapacidadExcedidaException(String msg) {
        super(msg);
    }
}

public class ListaLimitada {
    private ArrayList<Object> lista = new ArrayList<>();
    private int capacidadMax;

    public ListaLimitada(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void agregar(Object elem) {
        if (lista.size() >= capacidadMax) {
            throw new CapacidadExcedidaException("Lista llena, capacidad: " + capacidadMax);
        }
        lista.add(elem);
    }

    public Object remover(int indice) {
        return lista.remove(indice);
    }

    public Object obtener(int indice) {
        return lista.get(indice);
    }

    public int tamaño() {
        return lista.size();
    }

    public void listar() {
        for (Object o : lista) System.out.println(o);
    }
}
