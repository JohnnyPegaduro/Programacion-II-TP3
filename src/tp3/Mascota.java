package tp3;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " (" + especie + "), edad: " + edad);
    }

    public void cumplirAnios() {
        edad++;
    }
}
