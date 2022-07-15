package com.ywh.dp.facade;

public class WechatMessageManager implements ImessageManager{
    @Override
    public void pushMessage() {
        System.out.println("推送微信消息");
    }
}
