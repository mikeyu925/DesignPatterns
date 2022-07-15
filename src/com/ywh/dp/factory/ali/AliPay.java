package com.ywh.dp.factory.ali;

import com.ywh.dp.factory.Pay;

public class AliPay implements Pay {
    @Override
    public boolean unifiedOrder() {
        System.out.println("成功使用支付宝支付!");
        return true;
    }
}
