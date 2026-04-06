import java.util.ArrayList;

class Libro {
    private String titulo, autor, isbn;
    private double precio;

    public Libro(String titulo, String autor, String isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }

    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return titulo + " - " + autor + " - " + precio;
    }
}

public class Biblioteca {
    private ArrayList<Libro> lista = new ArrayList<>();

    public void agregar(Libro l) {
        lista.add(l);
    }

    public void eliminar(String isbn) {
        lista.removeIf(l -> l.getIsbn().equals(isbn));
    }

    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> r = new ArrayList<>();
        for (Libro l : lista) {
            if (l.getAutor().equalsIgnoreCase(autor)) r.add(l);
        }
        return r;
    }

    public Libro libroMasCaro() {
        Libro max = null;
        for (Libro l : lista) {
            if (max == null || l.getPrecio() > max.getPrecio()) max = l;
        }
        return max;
    }

    public void listarTodos() {
        for (Libro l : lista) System.out.println(l);
    }
}
