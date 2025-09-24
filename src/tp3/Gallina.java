package tp3;

public class Gallina {
    public int idGallina;
    public int edad;          // en años
    public int huevosPuestos; // acumulado

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina #" + idGallina +
                " | edad: " + edad +
                " | huevos: " + huevosPuestos);
    }
}
