interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo");
    }
}

class Pato extends Animal implements Volador, Nadador {
    public Pato(String nombre) { super(nombre); }

    public void volar() { System.out.println(nombre + " vuela"); }
    public void nadar() { System.out.println(nombre + " nada"); }
}

class Aguila extends Animal implements Volador {
    public Aguila(String nombre) { super(nombre); }

    public void volar() { System.out.println(nombre + " vuela alto"); }
}
