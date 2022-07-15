package com.ywh.dp.decorator;

// 防爆胎 —— 装饰物
public class RSCBikeDecorator extends BikeDecorator{
    private String description = "增加一个防爆胎";
    private Bike bike;
    public RSCBikeDecorator(Bike bike){
        this.bike = bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + ", " + description;
    }

    @Override
    public int getPrice() {
        return bike.getPrice() + 80; // 增加防爆胎价格
    }
}
