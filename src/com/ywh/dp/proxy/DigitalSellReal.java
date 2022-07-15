package com.ywh.dp.proxy;

/**
 * 真实的对象
 */
public class DigitalSellReal implements Digitalsell{
    @Override
    public void sell() {
        System.out.println("销售华为手机");
    }
}
