package com.ywh.dp.decorator;

// 大灯 —— 装饰物
public class LightBikeDecorator extends  BikeDecorator{
    private String description = "增加一个喇叭";
    private Bike bike;

    public LightBikeDecorator(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + ", " + description;
    }

    @Override
    public int getPrice() {
        return bike.getPrice() + 50; // 增加大灯价格
    }
}
