package com.ywh.dp.factory;

public class BankPay implements Pay{
    @Override
    public boolean unifiedOrder() {
        System.out.println("成功使用银行卡支付!");
        return true;
    }
}
