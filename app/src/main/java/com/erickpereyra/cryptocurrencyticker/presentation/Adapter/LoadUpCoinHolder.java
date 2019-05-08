package com.erickpereyra.cryptocurrencyticker.presentation.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.erickpereyra.cryptocurrencyticker.R;

public class LoadUpCoinHolder extends RecyclerView.ViewHolder {

    public ProgressBar progressBar;

    public LoadUpCoinHolder(View view){
        super(view);

        progressBar = view.findViewById(R.id.coin_Lister);
    }
}
