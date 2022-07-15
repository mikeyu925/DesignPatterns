package com.ywh.dp.decorator;


// 具体的被装饰者
public class BigBike implements Bike{
    private String description = "大号自行车";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
