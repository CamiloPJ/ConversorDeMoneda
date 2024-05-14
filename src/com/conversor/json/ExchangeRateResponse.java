package com.conversor.json;


public class ExchangeRateResponse {
    private String result;
    private String monedaOrigen;
    private String monedaDestino;
    private float conversionRate;

    public ExchangeRateResponse(String monedaOrigen, String monedaDestino, float conversionRate) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.conversionRate = conversionRate;
    }

    public ExchangeRateResponse(ExchangeRateAPI miExchangeAPI) {
        this.monedaOrigen = miExchangeAPI.baseCode();
        this.monedaDestino = miExchangeAPI.targetCode();
        this.conversionRate = miExchangeAPI.conversionRate();
    }

    public String getResult() {
        return result;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public float getConversionRate() {
        return conversionRate;
    }

    @Override
    public String toString() {
        return "ExchangeRateResponse{" +
                "conversionRate=" + conversionRate +
                '}';
    }
}

    //    public static ExchangeRateResponse fromJson(String json) {
//        return new Gson().fromJson(json, ExchangeRateResponse.class);
//    }

//    private boolean result;
//    private String documentation;
//    private String terms_of_use;
//    private String time_last_update_unix;
//    private String time_last_update_utc;
//    private String time_next_update_unix;
//    private String time_next_update_utc;
//    private String base_code;
//    private String conversion_rates;
//
//    // Getters and setters
//
//
//    public boolean isResult() {
//        return result;
//    }
//
//    public void setResult(boolean result) {
//        this.result = result;
//    }
//
//    public String getDocumentation() {
//        return documentation;
//    }
//
//    public void setDocumentation(String documentation) {
//        this.documentation = documentation;
//    }
//
//    public String getTerms_of_use() {
//        return terms_of_use;
//    }
//
//    public void setTerms_of_use(String terms_of_use) {
//        this.terms_of_use = terms_of_use;
//    }
//
//    public String getTime_last_update_unix() {
//        return time_last_update_unix;
//    }
//
//    public void setTime_last_update_unix(String time_last_update_unix) {
//        this.time_last_update_unix = time_last_update_unix;
//    }
//
//    public String getTime_last_update_utc() {
//        return time_last_update_utc;
//    }
//
//    public void setTime_last_update_utc(String time_last_update_utc) {
//        this.time_last_update_utc = time_last_update_utc;
//    }
//
//    public String getTime_next_update_unix() {
//        return time_next_update_unix;
//    }
//
//    public void setTime_next_update_unix(String time_next_update_unix) {
//        this.time_next_update_unix = time_next_update_unix;
//    }
//
//    public String getTime_next_update_utc() {
//        return time_next_update_utc;
//    }
//
//    public void setTime_next_update_utc(String time_next_update_utc) {
//        this.time_next_update_utc = time_next_update_utc;
//    }
//
//    public String getBase_code() {
//        return base_code;
//    }
//
//    public void setBase_code(String base_code) {
//        this.base_code = base_code;
//    }
//
//    public Map<String, Double> getConversion_rates() {
//        return conversion_rates;
//    }
//
//    public void setConversion_rates(String conversion_rates) {
//        this.conversion_rates = conversion_rates;
//    }
//
//    public static ExchangeRateResponse fromJson(String json) {
//        return new Gson().fromJson(json, ExchangeRateResponse.class);
//    }

