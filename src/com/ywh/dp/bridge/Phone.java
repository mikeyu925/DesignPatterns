package com.ywh.dp.bridge;

// 抽象类
public abstract class Phone {
    protected Color color; // 通过组合的方式桥接其他行为

    public void setPhoneColor(Color color){
        this.color = color;
    }
    abstract public void run(); // 手机方法
}
