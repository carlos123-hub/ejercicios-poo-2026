import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Volador> lista = new ArrayList<>();
        lista.add(new Pato("Donald"));
        lista.add(new Aguila("Real"));

        for (Volador v : lista) v.volar();
    }
}
