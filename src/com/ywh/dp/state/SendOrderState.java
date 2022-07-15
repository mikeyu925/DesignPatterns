package com.ywh.dp.state;

public class SendOrderState implements State{
    @Override
    public void handle() {
        System.out.println("订单已发货，持续更新物流信息中");
    }
}
