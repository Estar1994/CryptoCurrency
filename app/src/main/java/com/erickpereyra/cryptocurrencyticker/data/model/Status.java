package com.erickpereyra.cryptocurrencyticker.data.model;

public class Status{


    //@SerializedName("timestamp")
    public String timestamp;

    //@SerializedName("error_code")
    public int error_code;

    //@SerializedName("error_message")
    public String error_message;

    //@SerializedName("elapsed")
    public int elapsed;

    //@SerializedName("credit_count")
    public int credit_count;


    /*public Status(String timestamp, int error_code, String error_message,
                  int elapsed,int credit_count){

        this.timestamp = timestamp;
        this.error_code = error_code;
        this.error_message = error_message;
        this.elapsed = elapsed;
        this.credit_count = credit_count;
    }*/

    public String getTimestamp(){
        return timestamp;
    }

    /*public void setTimestamp(String timestamp){
        this.timestamp = timestamp;
    }
*/

    public int getError_code() {
        return error_code;
    }

    /*public void setError_code(int error_code) {
        this.error_code = error_code;
    }

*/

    public String getError_message(){

        return error_message;
    }

   /* public void setError_message(String error_message) {
        this.error_message = error_message;
    }
*/
    public int getElapsed(){
        return  elapsed;
    }

   /* public void setElapsed(int elapsed) {
        this.elapsed = elapsed;
    }

*/
    public int getCredit_count() {
        return credit_count;
    }
/*

    public void setCredit_count(int credit_count) {
        this.credit_count = credit_count;
    }
*/

}
