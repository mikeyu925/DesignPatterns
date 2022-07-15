package com.ywh.dp.factory.wechat;

import com.ywh.dp.factory.OrderFactory;
import com.ywh.dp.factory.Pay;
import com.ywh.dp.factory.Refund;

public class WechatOrderFactory implements OrderFactory {
    @Override
    public Pay createPay() {
        return new WechatPay();
    }

    @Override
    public Refund createRefund() {
        return new WechatRefund();
    }
}
