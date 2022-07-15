package com.ywh.dp.factory.wechat;

import com.ywh.dp.factory.Pay;

public class WechatPay implements Pay {
    @Override
    public boolean unifiedOrder() {
        System.out.println("成功使用微信支付!");
        return true;
    }
}
