package com.erickpereyra.cryptocurrencyticker.data.model;

public class CryptoCoinModel{

    public String id;
    public String name;
    public String symbol;
    public String price;
    public String percent_change_1h;
    public String percent_change_24h;
    public String percent_change_7d;

    public CryptoCoinModel(String id, String name, String symbol, String price_usd, String percent_change_1h, String percent_change_24h, String percent_change_7d) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.percent_change_1h = percent_change_1h;
        this.percent_change_24h = percent_change_24h;
        this.percent_change_7d = percent_change_7d;
    }

    public CryptoCoinModel() {

    }

    public String getId(CryptoCoinModel name) {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price_usd) {
        this.price = price_usd;
    }

    public String getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(String percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public String getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(String percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public String getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(String percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }
}
