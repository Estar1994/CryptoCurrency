package com.erickpereyra.cryptocurrencyticker.presentation.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.erickpereyra.cryptocurrencyticker.R;
import com.erickpereyra.cryptocurrencyticker.data.model.Datum;
import com.erickpereyra.cryptocurrencyticker.presentation.CoinViewHolder;

import java.util.ArrayList;
import java.util.List;

public class CoinAdapter extends RecyclerView.Adapter<CoinViewHolder>{

    private List<Datum> mData = new ArrayList<>();

    @NonNull
    @Override
    public CoinViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        this.onCreateViewHolder(viewGroup,i);
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.item_list, null);
        CoinViewHolder coinViewHolder = new CoinViewHolder(v);

        return coinViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoinViewHolder coinViewHolder, int i) {
        Datum datum = mData.get(i);


        TextView name = coinViewHolder.name;
        name.setText(datum.getName() + " (" + datum.getSymbol()+ ")");

        TextView price = coinViewHolder.price;
        price.setText("Price: $" + String.format("%,f", datum.getQuote().getUSD().getPrice()));

        TextView marketCap = coinViewHolder.market_cap;
        marketCap.setText("Market Cap: $" + String.format("%,d", Math.round(datum.getQuote().getUSD().getMarketCap())));

        TextView volume24h = coinViewHolder.volume_24h;
        volume24h.setText("Volume/24h: $" + String.format("%,d", Math.round(datum.getQuote().getUSD().getVolume24h())));

        TextView textView1h = coinViewHolder.view1h;
        textView1h.setText(String.format("1h: %.2f", datum.getQuote().getUSD().getPercentChange1h()) + "%");

        TextView textView24h = coinViewHolder.view24h;
        textView24h.setText(String.format("24h: %.2f", datum.getQuote().getUSD().getPercentChange24h()) + "%");

        TextView textView7d = coinViewHolder.view7d;
        textView7d.setText(String.format("7d: %.2f", datum.getQuote().getUSD().getPercentChange7d()) + "%");
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
