public class Matriz {
    private double[][] datos;

    public Matriz(int filas, int cols) {
        this.datos = new double[filas][cols];
    }

    public void setValor(int f, int c, double val) {
        datos[f][c] = val;
    }

    public double getValor(int f, int c) {
        return datos[f][c];
    }

    public double calcularSuma() {
        double suma = 0;
        for (double[] fila : datos)
            for (double v : fila) suma += v;
        return suma;
    }

    public void imprimirMatriz() {
        for (double[] fila : datos) {
            for (double v : fila) System.out.printf("%8.2f", v);
            System.out.println();
        }
    }
}
