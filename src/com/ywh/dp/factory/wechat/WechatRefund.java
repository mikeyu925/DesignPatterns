package com.ywh.dp.factory.wechat;

import com.ywh.dp.factory.Refund;

public class WechatRefund implements Refund {
    @Override
    public boolean refund() {
        System.out.println("使用微信退款成功!");
        return true;
    }
}
