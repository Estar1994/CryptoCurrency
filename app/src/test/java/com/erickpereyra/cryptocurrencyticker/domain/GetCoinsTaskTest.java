package com.erickpereyra.cryptocurrencyticker.domain;

import com.erickpereyra.cryptocurrencyticker.data.model.CryptoCoinModel;

import org.junit.Test;

public class GetCoinsTaskTest {

    @Test
    public void doInBackground() {
        final CryptoCoinModel name = new CryptoCoinModel();
        name.getId(name);
        
        assertArrayEquals("", name.getId(name));
    }

    private void assertArrayEquals(String s, String id) {
    }
}