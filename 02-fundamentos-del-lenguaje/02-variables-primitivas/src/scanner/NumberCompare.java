import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        // Permitir que el usuario ingrese un valor
        int value1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int value2 = scanner.nextInt();

        System.out.println("--------------------------------");
        System.out.println("Resultados: ");
        System.out.println("--------------------------------");

        if (value1 > value2) {
            System.out.println("El primer número es mayor que el segundo");
        }
        else if (value1 < value2) {
            System.out.println("El primer número es menor que el segundo");
        }
        else {
            System.out.println("Los dos números son iguales");
        }

        System.out.println("La suma de los dos números es: " + (value1 + value2));
        System.out.println("La resta de los dos números es: " + (value1 - value2));
        System.out.println("La multiplicación de los dos números es: " + (value1 * value2));
        System.out.println("La división de los dos números es: " + (value1 / value2));
        System.out.println("El módulo de los dos números es: " + (value1 % value2));
        System.out.println("El mayor de los dos números es: " + Math.max(value1, value2));
        System.out.println("El menor de los dos números es: " + Math.min(value1, value2));
        System.out.println("El promedio de los dos números es: " + (value1 + value2) / 2);
        System.out.println("--------------------------------");
        System.out.println("Fin del programa");
        System.out.println("--------------------------------");

        scanner.close();
    }
}
