import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSeleccione una categoría para la conversión:");
            System.out.println("1. Metros a kilómetros, centímetros y milímetros");
            System.out.println("2. Litros a miligramos, decilitros y centilitros");
            System.out.println("3. Gramos a kilogramos y miligramos");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");

            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;
            }

            System.out.print("Ingrese la cantidad: ");
            double value = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println(value + " metros son " + (value / 1000) + " kilómetros, "
                            + (value * 100) + " centímetros, y " + (value * 1000) + " milímetros.");
                    break;
                case 2:
                    System.out.println(value + " litros son " + (value * 1000) + " mililitros, "
                            + (value * 10) + " decilitros, " + (value * 100) + " centilitros.");
                    break;
                case 3:
                    System.out.println(value + " gramos son " + (value / 1000) + " kilogramos, "
                            + (value * 1000) + " miligramos.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

