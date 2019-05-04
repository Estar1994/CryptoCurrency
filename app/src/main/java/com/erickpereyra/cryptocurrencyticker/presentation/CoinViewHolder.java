package com.erickpereyra.cryptocurrencyticker.presentation;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.erickpereyra.cryptocurrencyticker.R;

public class CoinViewHolder extends RecyclerView.ViewHolder{



    public TextView name;
    public TextView price;
    public TextView market_cap;
    public TextView volume_24h;
    public TextView view1h;
    public TextView view24h;
    public TextView view7d;

    public CoinViewHolder(@NonNull View itemView) {

        super(itemView);

        name = itemView.findViewById(R.id.name);
        price = itemView.findViewById(R.id.price);
        market_cap = itemView.findViewById(R.id.market_cap);
        volume_24h = itemView.findViewById(R.id.volume24h);
        view1h = itemView.findViewById(R.id.view1h);
        view24h = itemView.findViewById(R.id.view24h);
        view7d = itemView.findViewById(R.id.view7d);

    }
}

