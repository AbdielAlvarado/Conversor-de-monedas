import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

            Menu.mostrarMenu();

            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();

                try {
                    opcion = Integer.parseInt(input);
                    OpcionesSwitch.manejarOpcion(opcion);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Por favor, ingresa un número.");
                }
            } else {
                System.out.println("Error leyendo entrada.");
            }


        scanner.close();
    }
}