package com.ywh.dp.decorator;

// 装饰者组件
public class BikeDecorator implements Bike{

    private String description = "我只是装饰器";

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
