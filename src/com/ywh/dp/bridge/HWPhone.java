package com.ywh.dp.bridge;

public class HWPhone extends Phone{
    public HWPhone(Color color){
        super.setPhoneColor(color);
    }
    @Override
    public void run() {
        color.showColor();
        System.out.println("华为手机开始运行!");
    }
}
