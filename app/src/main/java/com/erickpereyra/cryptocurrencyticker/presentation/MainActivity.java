package com.erickpereyra.cryptocurrencyticker.presentation;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.erickpereyra.cryptocurrencyticker.R;
import com.erickpereyra.cryptocurrencyticker.data.Coins;
import com.erickpereyra.cryptocurrencyticker.data.SharedPreferencesHelper;
import com.erickpereyra.cryptocurrencyticker.data.model.CryptoCoinModel;
import com.erickpereyra.cryptocurrencyticker.domain.GetCoinsTask;
import com.erickpereyra.cryptocurrencyticker.presentation.Adapter.CoinAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity{

    private GetCoinsTask mGetCoinsTask;
    List<CryptoCoinModel> items = new ArrayList<>();
    CoinAdapter adapter;
    RecyclerView recyclerView;

    OkHttpClient client;
    Request request;
    SwipeRefreshLayout swipeRefreshLayout;



    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mGetCoinsTask = new GetCoinsTask(this,items);

        swipeRefreshLayout=findViewById(R.id.rootLayout);
        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {

                loadFirst10Coins(0);

            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @TargetApi(Build.VERSION_CODES.M)
            @Override
            public void onRefresh() {
                items.clear();
                loadFirst10Coins(0);
                setUpAdapter();
            }
        });

        recyclerView=findViewById(R.id.coin_Lister);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        setUpAdapter();

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void setUpAdapter() {

        adapter = new CoinAdapter(recyclerView, items, MainActivity.this);
        recyclerView.setAdapter(adapter);
        adapter.setCoins(new Coins() {
            @Override
            public void loadTheCoins() {
                if (items.size()<=1000){
                    loadNext10Coin(items.size());
                }
                else {
                    Toast.makeText(MainActivity.this, "Maximum limit is 1000", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void loadNext10Coin(int index) {
        client=new OkHttpClient();
        request=new Request.Builder().url(String.format("https://api.coinmarketcap.com/v1/ticker/?start=%d&limit=10",index))
                .build();

        swipeRefreshLayout.setRefreshing(true);
        client.newCall(request)
                .enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {

                        String body=response.body().string();
                        Gson gson=new Gson();
                        final List<CryptoCoinModel> newitems=gson.fromJson(body,new TypeToken<List<CryptoCoinModel>>(){}.getType());
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                items.addAll(newitems);
                                adapter.setLoaded();
                                adapter.updateData(items);
                                swipeRefreshLayout.setRefreshing(false);


                            }
                        });
                    }
                });


    }

    private void loadFirst10Coins(int index) {
        client=new OkHttpClient();
        request=new Request.Builder().url(String.format("https://api.coinmarketcap.com/v1/ticker/?start=%d&limit=10",index))
                .build();

        swipeRefreshLayout.setRefreshing(true);
        client.newCall(request)
                .enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {

                        String body = response.body().string();
                        Gson gson = new Gson();
                        final List<CryptoCoinModel> newitems = gson.fromJson(body,new TypeToken<List<CryptoCoinModel>>(){}.getType());


                        //Implementing SharedPreferences
                        saveCoins(body);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                adapter.updateData(newitems);
                            }
                        });
                    }
                });

        if (swipeRefreshLayout.isRefreshing())
            swipeRefreshLayout.setRefreshing(false);


    }

    private void saveCoins(String name){
        final SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper();
        sharedPreferencesHelper.saveCoins(this,name);
    }
}