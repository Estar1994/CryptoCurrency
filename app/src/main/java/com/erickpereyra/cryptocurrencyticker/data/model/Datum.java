package com.erickpereyra.cryptocurrencyticker.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("id")
    public int id ;

    @SerializedName("name")
    public String name ;

    @SerializedName("symbol")
    public String symbol ;

    @SerializedName("slug")
    public String slug ;

    @SerializedName("cmc_rank")
    public int cmc_rank ;

    @SerializedName("num_market_pairs")
    public int num_market_pairs ;

    @SerializedName("circulating_supply")
    public int circulating_supply ;

    @SerializedName("total_supply")
    public int total_supply ;

    @SerializedName("max_supply")
    public int max_supply ;

    @SerializedName("last_updated")
    public String last_updated;

    @SerializedName("date_added")
    public String date_added ;

    @SerializedName("tags")
    public List<String> tags;

    @SerializedName("platform")
    public Object platform ;

    @SerializedName("quote")
    public Quote quote ;


    public Datum(int id, String name, String symbol, String slug, int cmc_rank, int num_market_pairs,
                 int circulating_supply, int total_supply, int max_supply, String last_updated,
                 String date_added, List<String> tags, Object platform, Quote quote){

        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.slug = slug;
        this.cmc_rank = cmc_rank;
        this.num_market_pairs = num_market_pairs;
        this.circulating_supply = circulating_supply;
        this.total_supply = total_supply;
        this.max_supply = max_supply;
        this.last_updated = last_updated;
        this.date_added = date_added;
        this.tags = tags;
        this.platform = platform;
        this.quote = quote;

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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





    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }





    public int getCirculatingSupply() {
        return circulating_supply;
    }

    public void setCirculatingSupply(int circulatingSupply) {
        this.circulating_supply = circulatingSupply;
    }





    public int getTotalSupply() {
        return total_supply;
    }

    public void setTotalSupply(int totalSupply) {
        this.total_supply = totalSupply;
    }





    public int getMaxSupply() {
        return max_supply;
    }

    public void setMaxSupply(int maxSupply) {
        this.max_supply = maxSupply;
    }





    public String getDateAdded() {
        return date_added;
    }

    public void setDateAdded(String dateAdded) {
        this.date_added = dateAdded;
    }

    public int getNumMarketPairs() {
        return num_market_pairs;
    }

    public void setNumMarketPairs(int numMarketPairs) {
        this.num_market_pairs = numMarketPairs;
    }

    public int getCmcRank() {
        return cmc_rank;
    }

    public void setCmcRank(Integer cmcRank) {
        this.cmc_rank = cmcRank;
    }

    public String getLastUpdated() {
        return last_updated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.last_updated = lastUpdated;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
