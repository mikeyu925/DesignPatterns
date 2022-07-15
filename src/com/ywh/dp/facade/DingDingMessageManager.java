package com.ywh.dp.facade;

public class DingDingMessageManager implements ImessageManager{
    @Override
    public void pushMessage() {
        System.out.println("推送钉钉消息");
    }
}
