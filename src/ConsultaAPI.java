import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {

    public double conversionMoneda(String moneda1, String moneda2, double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/32a275bf7844fd547bebf314/pair/"+moneda1+"/"+moneda2+"/"+cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
        JsonElement valorDeConversion = jsonResponse.get("conversion_rate");

        if (valorDeConversion != null && valorDeConversion.isJsonPrimitive()) {
            double rate = valorDeConversion.getAsDouble();
            System.out.println(rate);
            return cantidad * rate;
        } else {
            throw new IllegalArgumentException("Valor no encontrado");
        }
    }

}
