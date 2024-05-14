package com.conversor.json;

public class CreateUrl  {
    private static final String API_KEY = "e30e77ec7cc7814923dcec8a";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

    public String generarUrl() {
        return API_URL + API_KEY + "/pair/";
    }

}