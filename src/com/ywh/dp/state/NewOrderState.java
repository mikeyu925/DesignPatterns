package com.ywh.dp.state;

public class NewOrderState implements State{
    @Override
    public void handle() {
        System.out.println("新订单，未支付");
    }
}
