public class Main {
    public static void main(String[] args) {
        Matriz m = new Matriz(2, 2);
        m.setValor(0, 0, 1);
        m.setValor(0, 1, 2);
        m.setValor(1, 0, 3);
        m.setValor(1, 1, 4);

        m.imprimirMatriz();
        System.out.println("Suma: " + m.calcularSuma());
    }
}
