package tp3;

public class NaveEspacial {
    private final String nombre;
    private final int capacidadMaxima; // combustible máximo
    private int combustible;
    private boolean enVuelo;

    public NaveEspacial(String nombre, int combustibleInicial, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.combustible = Math.min(combustibleInicial, capacidadMaxima);
        this.enVuelo = false;
    }

    public void despegar() {
        if (enVuelo) {
            System.out.println(nombre + ": ya está en vuelo.");
            return;
        }
        int costoDespegue = 10;
        if (combustible >= costoDespegue) {
            combustible -= costoDespegue;
            enVuelo = true;
            System.out.println(nombre + ": ¡Despegó! (-" + costoDespegue + " de combustible)");
        } else {
            System.out.println(nombre + ": combustible insuficiente para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int costo = Math.max(0, distancia) * 2;
        if (!enVuelo) {
            System.out.println(nombre + ": no puede avanzar porque no está en vuelo.");
            return;
        }
        if (combustible >= costo) {
            combustible -= costo;
            System.out.println(nombre + ": avanzó " + distancia + " km (-" + costo + ").");
        } else {
            System.out.println(nombre + ": combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println(nombre + ": cantidad inválida para recargar.");
            return;
        }
        int antes = combustible;
        combustible = Math.min(capacidadMaxima, combustible + cantidad);
        int cargado = combustible - antes;
        System.out.println(nombre + ": recargó " + cargado + " (capacidad máx = " + capacidadMaxima + ").");
    }

    public void mostrarEstado() {
    System.out.println("Nave \"" + nombre + "\" | combustible: " + combustible + "/" + capacidadMaxima
            + " | estado: " + (enVuelo ? "en vuelo" : "en tierra"));
    }

}
