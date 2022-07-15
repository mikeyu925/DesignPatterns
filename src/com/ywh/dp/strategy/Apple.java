package com.ywh.dp.strategy;

public class Apple {
    public int price;
    public int size;

    public Apple(int price, int size) {
        this.price = price;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Apple{" +
                "price=" + price +
                ", size=" + size +
                '}';
    }
}
