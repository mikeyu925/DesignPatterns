package com.ywh.dp.proxy;

public class DigitalSellProxy implements Digitalsell{
    private Digitalsell realObj =  new DigitalSellReal();
    @Override
    public void sell() {
        makeAdvertisement();
        makeAddress();
        realObj.sell();
    }

    private void makeAddress(){
        System.out.println("选择一个人流很大的地址");
    }

    private void makeAdvertisement(){
        System.out.println("投放广告");
    }
}
