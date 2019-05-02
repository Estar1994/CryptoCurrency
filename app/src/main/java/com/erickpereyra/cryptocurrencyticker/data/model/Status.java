package com.erickpereyra.cryptocurrencyticker.data.model;

public class Status{

    public String timestamp;
    public int error_code;
    public String error_message;
    public int elapsed;
    public int credit_count;

    public String getTimestamp(){
        return timestamp;
    }

}
