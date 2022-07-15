package com.ywh.dp.state;

public class PayOrderState implements State{
    @Override
    public void handle() {
        System.out.println("订单已经支付，开始准备物流..");
    }
}
