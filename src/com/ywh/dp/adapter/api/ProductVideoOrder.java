package com.ywh.dp.adapter.api;

public class ProductVideoOrder extends PayGateWayAdapter{
    @Override
    public void order() {
        System.out.println("Video order!");
    }
    @Override
    public void refund() {
        System.out.println("Video refund!");
    }
}
