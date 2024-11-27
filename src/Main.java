import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OpcionesRespuesta respuesta = new OpcionesRespuesta();

        System.out.println("***********************************************");
        System.out.println("Sea bienvenido/a al Conversor de Modeda");
        System.out.println("Elija una opción");
        System.out.println(" ");
        System.out.println("1) Dólar =>> Peso Mexicano");
        System.out.println("2) Peso Mexicano =>> Dólar");
        System.out.println("3) Dólar =>> Euro");
        System.out.println("4) Euro =>> Dólar");
        System.out.println("5) Dólar =>> Yen Japones");
        System.out.println("6) Yen Japones =>> Dólar");
        System.out.println("7) Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                String moneda1 = "USD";
                String moneda2 = "MXN";
                String resultado = respuesta.respuestaSwitch(moneda1, moneda2);
                System.out.println(resultado);
            }
            case 2 -> {
                String moneda1 = "MXN";
                String moneda2 = "USD";
                String resultado = respuesta.respuestaSwitch(moneda1, moneda2);
                System.out.println(resultado);
            }
            case 3 -> {
                String moneda1 = "USD";
                String moneda2 = "EUR";
                String resultado = respuesta.respuestaSwitch(moneda1, moneda2);
                System.out.println(resultado);

            }
            case 4 -> {
                String moneda1 = "EUR";
                String moneda2 = "USD";
                String resultado = respuesta.respuestaSwitch(moneda1, moneda2);
                System.out.println(resultado);
            }
            case 5 -> {
                String moneda1 = "USD";
                String moneda2 = "JPY";
                String resultado = respuesta.respuestaSwitch(moneda1, moneda2);
                System.out.println(resultado);
            }
            case 6 -> {
                String moneda1 = "JPY";
                String moneda2 = "USD";
                String resultado = respuesta.respuestaSwitch(moneda1, moneda2);
                System.out.println(resultado);
            }
            case 7 -> {
            }
            default -> {
                System.out.println("Opcion no reconocida");
            }
        }



    }
}