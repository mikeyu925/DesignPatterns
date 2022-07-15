package com.ywh.dp.facade;

public class MessageFacade implements ImessageManager{
    private ImessageManager wechatManager = new WechatMessageManager();
    private ImessageManager dingdingManager = new DingDingMessageManager();
    private ImessageManager smsManager = new SmsMessageManager();
    private ImessageManager mailManager = new MailMessageManager();
    @Override
    public void pushMessage() {
        wechatManager.pushMessage();
        dingdingManager.pushMessage();
        smsManager.pushMessage();
        mailManager.pushMessage();
    }
}

/*
 public class MessageFacade  {
     private ImessageManager wechatManager = new WechatMessageManager();
     private ImessageManager dingdingManager = new DingDingMessageManager();
     private ImessageManager smsManager = new SmsMessageManager();
     private ImessageManager mailManager = new MailMessageManager();

     public void pushMessage() {
         wechatManager.pushMessage();
         dingdingManager.pushMessage();
         smsManager.pushMessage();
         mailManager.pushMessage();
    }
 }
 */
