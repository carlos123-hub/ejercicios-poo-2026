public class Estudiante {
    private String nombre;
    private String codigo;
    private double nota;

    public Estudiante(String nombre, String codigo, double nota) {
        this.nombre = nombre;
        this.codigo = codigo;
        setNota(nota);
    }

    public double getNota() { return nota; }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) this.nota = nota;
    }

    public String getCalificacion() {
        return nota >= 6.0 ? "Aprobado" : "Reprobado";
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Código: " + codigo +
               ", Nota: " + nota + ", Estado: " + getCalificacion();
    }
}
