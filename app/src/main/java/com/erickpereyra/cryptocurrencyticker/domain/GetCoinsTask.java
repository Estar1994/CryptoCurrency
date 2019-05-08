package com.erickpereyra.cryptocurrencyticker.domain;

import android.os.AsyncTask;

import com.erickpereyra.cryptocurrencyticker.data.CoinServiceHelper;
import com.erickpereyra.cryptocurrencyticker.data.model.CryptoCoinModel;
import com.erickpereyra.cryptocurrencyticker.presentation.MainActivity;

import java.util.List;

public class GetCoinsTask extends AsyncTask<Void, Void, List<CryptoCoinModel>> {

    private final MainActivity mListener;
    private final CoinServiceHelper mCoinServiceHelper;

    public GetCoinsTask(MainActivity listener, List<CryptoCoinModel> coinServiceHelper){
        this.mCoinServiceHelper = (CoinServiceHelper) coinServiceHelper;
        this.mListener = listener;
    }

    @Override
    protected List<CryptoCoinModel> doInBackground(Void... voids) {
        final CoinServiceHelper response = mCoinServiceHelper;
        return null;
    }
}
