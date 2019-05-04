package com.erickpereyra.cryptocurrencyticker.data.model;

public class USD {

    //@SerializedName("price")
    private double price;

    //@SerializedName("volume_24h")
    private long volume_24h;

    //@SerializedName("percent_change_1h")
    private double percent_change_1h;

    //@SerializedName("percent_change_24h")
    private double percent_change_24h ;

    //@SerializedName("percent_change_7d")
    private double percent_change_7d ;

    //@SerializedName("market_cap")
    private long market_cap;

    //@SerializedName("last_updated")
    private String last_updated;

/*
    public USD(double price, long volume_24h, double percent_change_1h, double percent_change_24h,
               double percent_change_7d, long market_cap, String last_updated){

        this.price = price;
        this.volume_24h = volume_24h;

    }*/

    public Double getPrice(){
        return  price;
    }

    /*public void setPrice(Double price){
        this.price = price;
    }*/

    public Long getVolume24h(){
        return volume_24h;
    }

    /*public void setVolume_24h(Long volume_24h){
        this.percent_change_24h = volume_24h;
    }*/

    public Double getPercentChange1h(){
        return percent_change_1h;
    }

    /*public void setPercent_change_1h(Double percent_change_1h){
        this.percent_change_1h = percent_change_1h;
    }*/

    public Double getPercentChange24h(){
        return percent_change_24h;
    }

    /*public void setPercentChange24h(Double percentChange24h) {
        this.percent_change_24h = percentChange24h;
    }
*/
    public Double getPercentChange7d() {
        return percent_change_7d;
    }

   /* public void setPercentChange7d(Double percentChange7d) {
        this.percent_change_7d = percentChange7d;
    }*/

    public Long getMarketCap() {
        return market_cap;
    }

   /* public void setMarketCap(Long marketCap) {
        this.market_cap = marketCap;
    }
*/
    public String getLastUpdated() {
        return last_updated;
    }

    /*public void setLastUpdated(String lastUpdated) {
        this.last_updated = lastUpdated;
    }
*/

}
