package com.conversor.modelo;

import com.conversor.json.CreateUrl;
import com.conversor.json.ExchangeRateAPI;
import com.conversor.json.ExchangeRateResponse;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CurrencyConverter {
    private static final String[] MONEDA_ORIGEN = {"USD", "ARS", "USD", "BRL", "USD", "COP"};
    private static final String[] MONEDA_DESTINO = {"ARS", "USD", "BRL", "USD", "COP", "USD"};

    public void convertir() {
        Scanner lectura = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            mostrarMenu();

//            System.out.println("Escriba una opcion valida: ");
            int opcion;
            try {
                opcion = Integer.parseInt(lectura.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Por favor ingrese un número válido.");
                continue;
            }

            if (opcion >= 1 && opcion <= 6) {
                CreateUrl createUrl = new CreateUrl();
                String monedaOrigen = MONEDA_ORIGEN[opcion - 1];
                String monedaDestino = MONEDA_DESTINO[opcion - 1];
                String url = createUrl.generarUrl() + monedaOrigen + "/" + monedaDestino;

                try {
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(url))
                            .build();
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    ExchangeRateAPI miExchangeAPI = gson.fromJson(json, ExchangeRateAPI.class);

                    System.out.print("Ingrese la cantidad a convertir (" + monedaOrigen + " a " + monedaDestino + "): ");
                    float cantidad;
                    try {
                        cantidad = Float.parseFloat(lectura.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad inválida. Por favor ingrese un número válido.");
                        continue;
                    }
                    BigDecimal cantidadDecimal = new BigDecimal(cantidad);

                    ExchangeRateResponse exchangeRateResponse = new ExchangeRateResponse(miExchangeAPI);
                    BigDecimal resultado = new BigDecimal(exchangeRateResponse.getConversionRate() * cantidad);
                    System.out.println("El valor: " + cantidadDecimal + " [" + monedaOrigen + "] corresponde al valor final de ---> " + resultado + " [" + monedaDestino + "]");
                } catch (IOException | InterruptedException e) {
                    System.out.println("Ocurrió un error al realizar la conversión: " + e.getMessage());
                }
            } else if (opcion == 7) {
                System.out.println("Gracias por usar nuestros servicios.");
                break;
            } else {
                System.out.println("Ingrese una opción válida.");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("*******************************************");
        System.out.println("Sea bienvenido/a al Conversor de moneda :D");
        System.out.println("*******************************************");
        System.out.println("1) Dólar ==> Peso argentino");
        System.out.println("2) Peso argentino ==> Dólar");
        System.out.println("3) Dólar ==> Real brasileño");
        System.out.println("4) Real brasileño ==> Dólar");
        System.out.println("5) Dólar ==> Peso colombiano");
        System.out.println("6) Peso colombiano ==> Dólar");
        System.out.println("7) Salir");
        System.out.print("Elija una opción válida: ");
    }
}