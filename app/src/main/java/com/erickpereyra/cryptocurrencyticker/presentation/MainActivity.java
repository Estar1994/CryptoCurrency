package com.erickpereyra.cryptocurrencyticker.presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.erickpereyra.cryptocurrencyticker.R;
import com.erickpereyra.cryptocurrencyticker.domain.GetCoinTask;
import com.erickpereyra.cryptocurrencyticker.presentation.Adapter.CoinAdapter;
import com.erickpereyra.cryptocurrencyticker.presentation.model.CoinPresentation;

import java.util.List;

public class MainActivity extends AppCompatActivity implements GetCoinTask.Listener {
    private CoinAdapter adapter;
    private GetCoinTask getCoinsTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        getCoinsTask = new GetCoinTask(this);
        getCoinsTask.execute();



    }

    @Override
    public void updateUI(List<CoinPresentation> coinPresentations) {

    }
}
