package com.erickpereyra.cryptocurrencyticker.data.model;

import java.util.List;

public class Datum {

    public int id ;
    public String name ;
    public String symbol ;
    public String slug ;
    public int cmc_rank ;
    public int num_market_pairs ;
    public int circulating_supply ;
    public int total_supply ;
    public int max_supply ;
    public String last_updated;
    public String date_added ;
    public List<String> tags;
    public Object platform ;
    public Quote quote ;


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
