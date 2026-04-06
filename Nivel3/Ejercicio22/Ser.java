public class Ser {
    public void respirar() {
        System.out.println("Respirando...");
    }
}

class Animal extends Ser {
    public void moverse() {
        System.out.println("Moviéndose...");
    }
}

class Mamifero extends Animal {
    public void amamantar() {
        System.out.println("Amamantando...");
    }
}

class Perro extends Mamifero {
    public void ladrar() {
        System.out.println("Guau!");
    }
}
