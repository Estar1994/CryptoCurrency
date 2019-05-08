package com.erickpereyra.cryptocurrencyticker.data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CoinServiceHelper {
    
    private Coins getCoins(){
        return (Coins) new Retrofit.Builder()
                .baseUrl("https://api.coinmarketcap.com/v1/ticker/?start=%d&limit=10")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(CoinServiceHelper.class);
    }


}
