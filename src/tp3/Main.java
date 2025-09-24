package tp3;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=== TP3 – Introduccion a la POO ===");
            System.out.println("1) Registro de Estudiantes");
            System.out.println("2) Registro de Mascotas");
            System.out.println("3) Encapsulamiento con Libro");
            System.out.println("4) Gestión de Gallinas");
            System.out.println("5) Simulacion de Nave Espacial");
            System.out.println("0) Salir");
            System.out.print("Elija una opción: ");
            opcion = leerEntero();

            switch (opcion) {
                case 1 -> demoEstudiante();
                case 2 -> demoMascota();
                case 3 -> demoLibro();
                case 4 -> demoGallinas();
                case 5 -> demoNave();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción invalida.");
            }
        } while (opcion != 0);
    }

    private static void demoEstudiante() {
        System.out.println("\n--- Ejercicio 1: Estudiante ---");
        Estudiante e = new Estudiante();
        e.nombre = "Ana";
        e.apellido = "Garcia";
        e.curso = "Programación II";
        e.calificacion = 6.5;

        e.mostrarInfo();
        System.out.println("\nSubimos la calificacion +2.0");
        e.subirCalificacion(2.0);
        e.mostrarInfo();
        System.out.println("\nBajamos la calificacion -1.5");
        e.bajarCalificacion(1.5);
        e.mostrarInfo();
    }

    private static void demoMascota() {
        System.out.println("\n--- Ejercicio 2: Mascota ---");
        Mascota m = new Mascota();
        m.nombre = "Firulais";
        m.especie = "Perro";
        m.edad = 3;

        m.mostrarInfo();
        System.out.println("Cumple años...");
        m.cumplirAnios();
        m.mostrarInfo();
    }

    private static void demoLibro() {
        System.out.println("\n--- Ejercicio 3: Libro (encapsulamiento) ---");
        Libro libro = new Libro("Patrones de Diseño", "GoF", 1994);
        libro.mostrarInfo();

        System.out.println("Intento de setear año inválido (3000)...");
        libro.setAnioPublicacion(3000);
        libro.mostrarInfo();

        System.out.println("Seteamos año valido (2004)...");
        libro.setAnioPublicacion(2004);
        libro.mostrarInfo();
    }

    private static void demoGallinas() {
        System.out.println("\n--- Ejercicio 4: Gallinas ---");
        Gallina g1 = new Gallina();
        g1.idGallina = 1; g1.edad = 1; g1.huevosPuestos = 0;

        Gallina g2 = new Gallina();
        g2.idGallina = 2; g2.edad = 2; g2.huevosPuestos = 3;

        g1.envejecer(); g1.ponerHuevo(); g1.ponerHuevo();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }

    private static void demoNave() {
        System.out.println("\n--- Ejercicio 5: Nave Espacial ---");
        NaveEspacial nave = new NaveEspacial("Andromeda", 50, 100);
        nave.mostrarEstado();

        System.out.println("Intentamos avanzar sin despegar:");
        nave.avanzar(10);

        System.out.println("Despegue:");
        nave.despegar();
        nave.mostrarEstado();

        System.out.println("Intento de avanzar 30 km:");
        nave.avanzar(30);
        nave.mostrarEstado();

        System.out.println("Recargar 40 unidades:");
        nave.recargarCombustible(40);
        nave.mostrarEstado();

        System.out.println("Avanzar 10 km:");
        nave.avanzar(10);
        nave.mostrarEstado();
    }

    private static int leerEntero() {
        while (!sc.hasNextInt()) {
            System.out.print("Ingrese un numero: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
