package com.conversor.json;

import com.google.gson.annotations.SerializedName;

public record ExchangeRateAPI(
        @SerializedName("base_code") String baseCode,
        @SerializedName("target_code") String targetCode,
        @SerializedName("conversion_rate") float conversionRate
) {}
