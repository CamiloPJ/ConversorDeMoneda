package com.conversor.moneda;

import com.conversor.modelo.CurrencyConverter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        CurrencyConverter converter = new CurrencyConverter();
        converter.convertir();
    }
}
