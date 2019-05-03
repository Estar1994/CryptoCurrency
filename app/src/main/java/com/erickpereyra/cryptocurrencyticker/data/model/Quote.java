package com.erickpereyra.cryptocurrencyticker.data.model;

import com.google.gson.annotations.SerializedName;

public class Quote {

    @SerializedName("usd")
    private USD usd;

    @SerializedName("btc")
    private BTC btc;


    public Quote(USD usd, BTC btc){
        this.usd = usd;
        this.btc = btc;

    }


    public USD getUSD() {
        return usd;
    }

    public void setUsd(USD usd){
        this.usd = usd;
    }




    public BTC getBtc(){
        return btc;
    }

    public void setBtc(BTC btc){
        this.btc = btc;
    }
}
