package com.erickpereyra.cryptocurrencyticker.data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CoinServiceCreator {


    public static Coins createCoinMarketCap(){
        return new Retrofit.Builder()
                .baseUrl("https://coinmarketcap.com/api/documentation/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Coins.class);
    }
}
