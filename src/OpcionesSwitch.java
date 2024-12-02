public class OpcionesSwitch {
    static OpcionesRespuesta respuesta = new OpcionesRespuesta();

    public static void manejarOpcion(int opcion){
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
            case 7 ->{
                System.out.println("Saliendo del programa.....");
            }
            default -> {
                System.out.println("Opcion no reconocida");
            }
        }
    }
}
