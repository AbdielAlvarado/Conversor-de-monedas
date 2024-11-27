import java.util.InputMismatchException;
import java.util.Scanner;

public class OpcionesRespuesta {

    public String respuestaSwitch(String moneda1, String moneda2){
        ConsultaAPI consultaAPI = new ConsultaAPI();
        ;

        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Elija la cantidad a convertir");
            int cantidad = scanner.nextInt();

            double conversionResultado = consultaAPI.conversionMoneda(moneda1, moneda2, cantidad);
            return String.format("%d %s es igual a: %.2f %s", cantidad, moneda1, conversionResultado, moneda2);
        } catch (InputMismatchException e) {
            return "Error: Debe ingresar un número entero como cantidad.";
        }
    }

}
