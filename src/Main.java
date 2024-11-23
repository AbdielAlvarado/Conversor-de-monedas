public class Main {
    public static void main(String[] args) {
        ConsultaAPI consultaAPI = new ConsultaAPI();
        String moneda1 = "USD";
        String moneda2 = "EUR";
        double amount = 100;

        double conversionResultado = consultaAPI.conversionMoneda(moneda1, moneda2, amount);

        System.out.println(conversionResultado);
    }
}