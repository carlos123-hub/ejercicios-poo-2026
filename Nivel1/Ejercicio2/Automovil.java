public class Automovil {
    private String marca;
    private String modelo;
    private int anio;
    private int velocidadActual;

    public Automovil(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadActual = 0;
    }

    public void acelerar(int km) {
        velocidadActual += km;
    }

    public void frenar(int km) {
        if (velocidadActual - km < 0) velocidadActual = 0;
        else velocidadActual -= km;
    }

    public void getEstado() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo +
                ", Año: " + ano + ", Velocidad: " + velocidadActual);
    }
}
