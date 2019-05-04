package com.erickpereyra.cryptocurrencyticker.data.model;

public class CryptoCurrencyResponseModel {

    private USD usd;
    private BTC btc;
    private Datum datum;
    private Status status;
    private Quote quote;

    public USD getUsd() {
        return usd;
    }

    public BTC getBtc() {
        return btc;
    }

    public Datum getDatum() {
        return datum;
    }

    public Status getStatus() {
        return status;
    }

    public Quote getQuote() {
        return quote;
    }
}
