package com.ywh.dp.decorator;

public class SmallBike implements Bike{
    private String description = "小号自行车";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 100;
    }

}
