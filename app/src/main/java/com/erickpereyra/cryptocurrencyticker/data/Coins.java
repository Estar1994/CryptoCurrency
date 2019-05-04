package com.erickpereyra.cryptocurrencyticker.data;

import com.erickpereyra.cryptocurrencyticker.data.model.CryptoCurrencyResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Coins{

    //https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest
    //String API_KEY = "20378a6f-13df-43c0-8efe-38a39c375786";

    @Headers("X-CMC_PRO_API_KEY: 20378a6f-13df-43c0-8efe-38a39c375786")
    @GET("/v1/cryptocurrency/listings/latest")

    Call<CryptoCurrencyResponseModel> getDatum();//@Query("limit")String page);

    //AsyncTask getDatum();

    //AsyncTask getDatum();
}
