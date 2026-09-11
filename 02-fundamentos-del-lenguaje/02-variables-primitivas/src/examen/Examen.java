package examen;

import java.util.Scanner;


public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al examen de Java");
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("\nAhora ingresa tus calificaciones de tus materia:");
        final byte NUM_MATERIAS = 3;
        float average = 0.0f;

        for (byte i = 0; i < NUM_MATERIAS; i++) {
            System.out.print("Ingrese la calificacion de la materia " + (i + 1) + ": ");
            float calificacion = scanner.nextFloat();
            average += calificacion;
        }

        average /= NUM_MATERIAS;

        System.out.println("Tu promedio es: " + Math.round(average));

        if (average >= 6) {
            System.out.println("Felicidades " + nombre + "! Aprobaste el examen.");
        } else {
            System.out.println("Lo siento " + nombre + "! No aprobaste el examen.");
        }

        System.out.println("Fin del programa");

        scanner.close();
    }
}
