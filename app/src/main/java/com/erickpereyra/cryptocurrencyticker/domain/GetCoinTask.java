package com.erickpereyra.cryptocurrencyticker.domain;

import android.os.AsyncTask;

import com.erickpereyra.cryptocurrencyticker.data.CoinServiceCreator;
import com.erickpereyra.cryptocurrencyticker.data.model.CryptoCurrencyResponseModel;
import com.erickpereyra.cryptocurrencyticker.presentation.model.CoinPresentation;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;

public class GetCoinTask extends AsyncTask<Void,Void, List<CoinPresentation>> {

    private Listener listener;

    public GetCoinTask(Listener listener) {
        this.listener = listener;
    }

    public interface Listener{
        void updateUI(List<CoinPresentation> coinPresentations);
    }



    @Override
    protected List<CoinPresentation> doInBackground(Void... voids) {
        try{
            final Response<CryptoCurrencyResponseModel>response = CoinServiceCreator.createCoinMarketCap()
                    .getDatum()
                    .execute();
            if(response.isSuccessful()){
                //final List<Datum> data = response.body().getDatum().getId();
            }

        }catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
