package com.ywh.dp.facade;

public class MailMessageManager implements ImessageManager{
    @Override
    public void pushMessage() {
        System.out.println("推送邮件消息");
    }
}
