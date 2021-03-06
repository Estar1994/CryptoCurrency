package com.erickpereyra.cryptocurrencyticker.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesHelper {

    private static SharedPreferences get(final Context context) {
        return context.getSharedPreferences("market_browser", Context.MODE_PRIVATE);
    }

    public void saveCoins(final Context context, final String name){
        SharedPreferencesHelper.get(context).edit().putString("name", name).apply();
    }

    public String readCoins(final Context context){
        return SharedPreferencesHelper.get(context).getString("name","");
    }
}