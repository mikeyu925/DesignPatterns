package com.ywh.dp.bridge;

/**
 * 具体实例化对象
 */
public class ApplePhone extends Phone{

    public ApplePhone(Color color){
        super.setPhoneColor(color);
    }

    @Override
    public void run() {
        System.out.println("苹果手机开始运行!");
    }
}
