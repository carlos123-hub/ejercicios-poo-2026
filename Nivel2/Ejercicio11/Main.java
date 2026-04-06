public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        b.agregar(new Libro("Java", "Pedro", "111", 50));
        b.agregar(new Libro("POO", "Ana", "222", 80));

        b.listarTodos();
        System.out.println("Más caro: " + b.libroMasCaro());
        System.out.println("Por autor Ana: " + b.buscarPorAutor("Ana"));
    }
}
