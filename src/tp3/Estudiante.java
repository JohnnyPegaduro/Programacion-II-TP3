package tp3;

public class Estudiante {
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion; // 0..10

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (puntos < 0) return;
        calificacion += puntos;
        if (calificacion > 10) calificacion = 10;
    }

    public void bajarCalificacion(double puntos) {
        if (puntos < 0) return;
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0;
    }
}
