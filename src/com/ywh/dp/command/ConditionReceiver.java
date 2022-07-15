package com.ywh.dp.command;

/**
 * 命令接收者
 */
public class ConditionReceiver {
    public void on(){
        System.out.println("空调开启");
    }
    public void off(){
        System.out.println("空调关闭");
    }
    public void doCool(){
        System.out.println("空调开始制冷");
    }
    public void doWarm(){
        System.out.println("空调开始制热");
    }
}
