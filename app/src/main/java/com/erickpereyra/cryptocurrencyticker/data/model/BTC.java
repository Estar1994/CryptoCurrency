package com.erickpereyra.cryptocurrencyticker.data.model;

public class BTC {

    //@SerializedName("price")
    private int price ;

    //@SerializedName("volume_24h")
    private int volume_24h ;

    //@SerializedName("percent_change_1h")
    private int percent_change_1h ;

    //@SerializedName("percent_change_24h")
    private int percent_change_24h ;

    //@SerializedName("percent_change_7d")
    private int percent_change_7d ;

   // @SerializedName("market_cap")
    private int market_cap ;

    //@SerializedName("last_updated")
    private String last_updated;

    /*public BTC(int price, int volume_24h, int percent_change_1h, int percent_change_24h, int percent_change_7d,
               int market_cap, String last_updated){

        this.price = price;
        this.volume_24h = volume_24h;
        this.percent_change_1h = percent_change_1h;
        this.percent_change_24h = percent_change_24h;
        this.percent_change_7d = percent_change_7d;
        this.market_cap = market_cap;
        this.last_updated = last_updated;

    }*/

    public int getPrice(){
        return price;
    }

    /*public void setPrice(int price){
        this.price = price;
    }
*/



    public int getVolume_24h(){
        return volume_24h;
    }

    /*public void setVolume_24h(int volume_24h){
        this.volume_24h = volume_24h;
    }
*/



    public int getPercent_change_1h(){
        return percent_change_1h;
    }

    /*public void setPercent_change_1h(int percent_change_1h){
        this.percent_change_1h =percent_change_1h;
    }
*/



    public int getPercent_change_24h(){
        return percent_change_24h;
    }

    /*public void setPercent_change_24h(int percent_change_24h){
        this.percent_change_24h = percent_change_24h;
    }
*/




    public int getPercent_change_7d(){
        return percent_change_7d;
    }

   /* public void setPercent_change_7d(){
        this.percent_change_7d = percent_change_7d;
    }

*/



    public int getMarket_cap(){
        return market_cap;
    }
/*

    public void setMarket_cap(int market_cap){
        this.market_cap = market_cap;
    }
*/




    public String getLast_updated(){
        return last_updated;
    }

    /*public void setLast_updated(String last_updated){
        this.last_updated = last_updated;
    }*/
}
