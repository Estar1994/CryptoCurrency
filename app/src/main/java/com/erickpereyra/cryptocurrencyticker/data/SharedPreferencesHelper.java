package com.erickpereyra.cryptocurrencyticker.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesHelper {

    private static SharedPreferences get(final Context context) {
        return context.getSharedPreferences("market_browser", Context.MODE_PRIVATE);
    }
}