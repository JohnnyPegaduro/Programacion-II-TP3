package tp3;

import java.time.Year;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // usa validación
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anio) {
        int anioActual = Year.now().getValue();
        if (anio >= 1450 && anio <= anioActual) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("⚠ Año invalido (" + anio + "). Se mantiene: " + this.anioPublicacion);
        }
    }

    public void mostrarInfo() {
    System.out.println("Libro: \"" + titulo + "\" de " + autor + " (" + anioPublicacion + ")");
    }

}
