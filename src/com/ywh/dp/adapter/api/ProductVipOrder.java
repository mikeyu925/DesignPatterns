package com.ywh.dp.adapter.api;

public class ProductVipOrder extends PayGateWayAdapter{

    @Override
    public void order() {
        System.out.println("Vip Order!");
    }

    @Override
    public void refund() {
        System.out.println("Vip Refund!");
    }

    @Override
    public void sendRedPack() {
        System.out.println("Vip 使用红包!");
    }
}
