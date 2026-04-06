import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> lista = new ArrayList<>();
        lista.add(new Perro("Firulais", 3));
        lista.add(new Gato("Michi", 2));
        lista.add(new Vaca("Lola", 5));

        for (Animal a : lista) {
            a.hacerSonido();
            a.comer();
        }
    }
}
