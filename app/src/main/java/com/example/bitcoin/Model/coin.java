package com.example.bitcoin.Model;

public class coin {

    private String currency;
    private double btc_value, eth_value;

    public coin(String currency, double btc_value, double eth_value) {
        this.currency = currency;
        this.btc_value = btc_value;
        this.eth_value = eth_value;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBtc_value() {
        return btc_value;
    }

    public double getEth_value() {
        return eth_value;
    }






}
