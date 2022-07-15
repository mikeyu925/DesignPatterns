package com.ywh.dp.factory.ali;

import com.ywh.dp.factory.Refund;

public class AliRefund implements Refund {
    @Override
    public boolean refund() {
        System.out.println("使用支付宝退款成功!");
        return true;
    }
}
