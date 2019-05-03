package com.erickpereyra.cryptocurrencyticker.data.model;

public class USD {

    public double price;
    public long volume_24h;
    public double percent_change_1h;
    public double percent_change_24h ;
    public double percent_change_7d ;
    public long market_cap;
    public String last_updated;


    public Double getPrice(){
        return  price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Long getVolume24h(){
        return volume_24h;
    }

    public void setVolume_24h(Long volume_24h){
        this.percent_change_24h = volume_24h;
    }

    public Double getPercentChange1h(){
        return percent_change_1h;
    }

    public void setPercent_change_1h(Double percent_change_1h){
        this.percent_change_1h = percent_change_1h;
    }

    public Double getPercentChange24h(){
        return percent_change_24h;
    }

    public void setPercentChange24h(Double percentChange24h) {
        this.percent_change_24h = percentChange24h;
    }

    public Double getPercentChange7d() {
        return percent_change_7d;
    }

    public void setPercentChange7d(Double percentChange7d) {
        this.percent_change_7d = percentChange7d;
    }

    public Long getMarketCap() {
        return market_cap;
    }

    public void setMarketCap(Long marketCap) {
        this.market_cap = marketCap;
    }

    public String getLastUpdated() {
        return last_updated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.last_updated = lastUpdated;
    }


}
