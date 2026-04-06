public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo");
    }
}

class Perro extends Animal {
    public Perro(String nombre, int edad) { super(nombre, edad); }
    @Override public void hacerSonido() { System.out.println("Guau guau"); }
}

class Gato extends Animal {
    public Gato(String nombre, int edad) { super(nombre, edad); }
    @Override public void hacerSonido() { System.out.println("Miau miau"); }
}

class Vaca extends Animal {
    public Vaca(String nombre, int edad) { super(nombre, edad); }
    @Override public void hacerSonido() { System.out.println("Muuu"); }
}
