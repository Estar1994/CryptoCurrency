package com.erickpereyra.cryptocurrencyticker.presentation.Adapter;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.erickpereyra.cryptocurrencyticker.R;
import com.erickpereyra.cryptocurrencyticker.data.Coins;
import com.erickpereyra.cryptocurrencyticker.data.model.CryptoCoinModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CoinAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    Coins coins;
    boolean loadCoins;
    Activity activity;
    List<CryptoCoinModel> items;

    int visible_threshold = 5, last_visible_Item, total_Item_Count;

    @RequiresApi(api = Build.VERSION_CODES.M)
    public CoinAdapter(RecyclerView recyclerView, List<CryptoCoinModel> items, Activity activity) {
        this.activity = activity;
        this.items = items;

        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                total_Item_Count = linearLayoutManager.getItemCount();
                last_visible_Item = linearLayoutManager.findLastVisibleItemPosition();
                if (!loadCoins && total_Item_Count <= (last_visible_Item + visible_threshold)) {

                    if (coins != null)
                        coins.loadTheCoins();
                    loadCoins = true;
                }
            }
        });

    }

    public void setCoins(Coins coins) {
        this.coins = coins;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity)
                .inflate(R.layout.activity_coin, parent, false);
        return new CoinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        CryptoCoinModel item = items.get(position);
        CoinViewHolder holderitem = (CoinViewHolder) holder;


        holderitem.coin_name.setText(item.getName());
        holderitem.coin_symbol.setText(item.getSymbol());
        holderitem.coin_price.setText(item.getPrice());
        holderitem.one_hour_change.setText(item.getPercent_change_1h() + "%");
        holderitem.twenty_hour_change.setText(item.getPercent_change_24h() + "%");
        holderitem.seven_days_change.setText(item.getPercent_change_7d() + "%");

        //Load image

        Picasso.with(activity)
                .load(new StringBuilder("https://res.cloudinary.com/dxi90ksom/image/upload/")
                        .append(item.getSymbol().toLowerCase()).append(".png").toString())
                .into(holderitem.coin_icon);

        holderitem.one_hour_change.setTextColor(item.getPercent_change_24h().contains("-") ?
                Color.parseColor("#ff0000") : Color.parseColor("#32cd32"));
        holderitem.twenty_hour_change.setTextColor(item.getPercent_change_24h().contains("-") ?
                Color.parseColor("#ff0000") : Color.parseColor("#32cd32"));
        holderitem.seven_days_change.setTextColor(item.getPercent_change_24h().contains("-") ?
                Color.parseColor("#ff0000") : Color.parseColor("#32cd32"));


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setLoaded(){ loadCoins =false;}

    public void updateData(List<CryptoCoinModel> coinModel){

        this.items= coinModel;
        notifyDataSetChanged();

    }

}
