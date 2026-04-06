public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5, 3);
        Rectangulo r2 = new Rectangulo(4, 4);

        System.out.println("Área r1: " + r1.calcularArea());
        System.out.println("Perímetro r1: " + r1.calcularPerimetro());
        System.out.println("¿r1 es cuadrado?: " + r1.esCuadrado());
        System.out.println("¿r2 es cuadrado?: " + r2.esCuadrado());
    }
}
