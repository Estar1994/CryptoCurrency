package com.erickpereyra.cryptocurrencyticker.data.model;

import java.util.List;

public class Datum {

    //@SerializedName("id")
    private int id ;

   // @SerializedName("name")
   private String name ;

    //@SerializedName("symbol")
    private String symbol ;

    //@SerializedName("slug")
    private String slug ;

    //@SerializedName("cmc_rank")
    private int cmc_rank ;

    //@SerializedName("num_market_pairs")
    private int num_market_pairs ;

    //@SerializedName("circulating_supply")
    private int circulating_supply ;

    //@SerializedName("total_supply")
    private int total_supply ;

    //@SerializedName("max_supply")
    private int max_supply ;

    //@SerializedName("last_updated")
    private String last_updated;

   // @SerializedName("date_added")
   private String date_added ;

    //@SerializedName("tags")
    private List<String> tags;

   // @SerializedName("platform")
   private Object platform ;

   // @SerializedName("quote")
   private Quote quote ;


   /* public Datum(int id, String name, String symbol, String slug, int cmc_rank, int num_market_pairs,
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

    }*/
    public Integer getId() {
        return id;
    }

   /* public void setId(Integer id) {
        this.id = id;
    }

*/


    public String getName() {
        return name;
    }

 /*   public void setName(String name) {
        this.name = name;
    }
*/




    public String getSymbol() {
        return symbol;
    }

    /*public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


*/


    public String getSlug() {
        return slug;
    }

    /*public void setSlug(String slug) {
        this.slug = slug;
    }
*/


    public int getCmcRank() {
        return cmc_rank;
    }



    public int getNumMarketPairs() {
        return num_market_pairs;
    }

    public int getCirculatingSupply() {
        return circulating_supply;
    }

    /*public void setCirculatingSupply(int circulatingSupply) {
        this.circulating_supply = circulatingSupply;
    }

*/



    public int getTotalSupply() {
        return total_supply;
    }

    /*public void setTotalSupply(int totalSupply) {
        this.total_supply = totalSupply;
    }

*/



    public int getMaxSupply() {
        return max_supply;
    }

    /*public void setMaxSupply(int maxSupply) {
        this.max_supply = maxSupply;
    }


*/

    public String getLastUpdated() {
        return last_updated;
    }


    public String getDateAdded() {
        return date_added;
    }


    public List<String> getTags(){
        return tags;
    }

    public Object getPlatform(){
        return platform;
    }


    /*public void setDateAdded(String dateAdded) {
        this.date_added = dateAdded;
    }
*/
    /*public void setNumMarketPairs(int numMarketPairs) {
        this.num_market_pairs = numMarketPairs;
    }
*/

    /*public void setCmcRank(Integer cmcRank) {
        this.cmc_rank = cmcRank;
    }
*/

    /*public void setLastUpdated(String lastUpdated) {
        this.last_updated = lastUpdated;
    }
*/
    public Quote getQuote() {
        return quote;
    }

    /*public void setQuote(Quote quote) {
        this.quote = quote;
    }*/
}
