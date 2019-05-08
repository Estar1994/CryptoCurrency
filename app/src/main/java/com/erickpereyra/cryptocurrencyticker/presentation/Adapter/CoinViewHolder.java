package com.erickpereyra.cryptocurrencyticker.presentation.Adapter;/*
package com.erickpereyra.cryptocurrencyticker.presentation;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.erickpereyra.cryptocurrencyticker.R;
import com.erickpereyra.cryptocurrencyticker.data.model.Datum;
import com.erickpereyra.cryptocurrencyticker.presentation.Adapter.CoinAdapter;

import java.util.List;

public class CoinViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{



    public TextView name;
    public TextView price;
    public TextView market_cap;
    public TextView volume_24h;
    public TextView view1h;
    public TextView view24h;
    public TextView view7d;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    private List<Datum> mData;
    private CoinAdapter mCoinAdapter;

        public CoinViewHolder(View itemView) {

            super(itemView);

            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            market_cap = itemView.findViewById(R.id.market_cap);
            volume_24h = itemView.findViewById(R.id.volume24h);
            view1h = itemView.findViewById(R.id.view1h);
            view24h = itemView.findViewById(R.id.view24h);
            view7d = itemView.findViewById(R.id.view7d);

            itemView.setOnClickListener(this);


        }
}


*/

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.erickpereyra.cryptocurrencyticker.R;

public class CoinViewHolder extends RecyclerView.ViewHolder{


    public ImageView coin_icon;
    public TextView coin_symbol,coin_name,
            coin_price,one_hour_change,twenty_hour_change,seven_days_change;

    public CoinViewHolder(@NonNull View itemView) {
        super(itemView);


        coin_icon=(ImageView) itemView.findViewById(R.id.coin_icon);
        coin_symbol=itemView.findViewById(R.id.coin_symbol);
        coin_name=itemView.findViewById(R.id.coin_name);
        coin_price=itemView.findViewById(R.id.priceUsdText);
        one_hour_change=itemView.findViewById(R.id.oneHourText);
        twenty_hour_change=itemView.findViewById(R.id.TwentyFourHourText);
        seven_days_change=itemView.findViewById(R.id.sevenDayText);

    }
}

