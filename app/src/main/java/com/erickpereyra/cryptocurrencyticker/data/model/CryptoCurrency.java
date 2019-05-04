package com.erickpereyra.cryptocurrencyticker.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CryptoCurrency {

    @SerializedName("status")
    public Status status;

    @SerializedName("data")
    public List<Datum> data = null;

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public List<Datum> getData(){
        return data;
    }

    public void setData(List<Datum> data){
        this.data = data;
    }

}
