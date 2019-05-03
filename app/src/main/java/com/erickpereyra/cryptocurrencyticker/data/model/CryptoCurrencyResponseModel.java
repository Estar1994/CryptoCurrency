package com.erickpereyra.cryptocurrencyticker.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CryptoCurrencyResponseModel {


    @SerializedName("bitcoin")
    public List<BTC> btc;

    @SerializedName("usDollars")
    public List<USD> usd;

    @SerializedName("quotes")
    public List<Quote> quotes;


}
