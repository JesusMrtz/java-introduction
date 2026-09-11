package bucles;

public class Bucles {
    public static void main(String[] args) {
        final byte MAX_ITERATIONS = 10;

        // Buque for:

        System.out.println("--------------------------------");
        System.out.println("Buque for:");
        System.out.println("--------------------------------");
        for (int i = 0; i < MAX_ITERATIONS; i++) {
            System.out.println(i + ".- " + "Hola No. " + (i + 1));
        }

        // Buque while:
        System.out.println("--------------------------------");
        System.out.println("Buque while:");
        System.out.println("--------------------------------");
        int i = 0;
        while (i < MAX_ITERATIONS) {
            System.out.println(i + ".- " + "Hola No. " + (i + 1));
            i++;
        }


        // Buque do while:
        System.out.println("--------------------------------");
        System.out.println("Buque do while:");
        System.out.println("--------------------------------");
        int j = 0;
        do {
            System.out.println(j + ".- " + "Hola No. " + (j + 1));
            j++;
        } while (j < MAX_ITERATIONS);
    }
}
