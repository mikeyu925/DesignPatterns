package com.ywh.dp.facade;

public class SmsMessageManager implements ImessageManager{
    @Override
    public void pushMessage() {
        System.out.println("推送sms消息");
    }
}
