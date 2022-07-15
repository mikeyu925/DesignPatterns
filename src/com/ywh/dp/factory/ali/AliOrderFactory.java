package com.ywh.dp.factory.ali;

import com.ywh.dp.factory.OrderFactory;
import com.ywh.dp.factory.Pay;
import com.ywh.dp.factory.Refund;

public class AliOrderFactory implements OrderFactory {
    @Override
    public Pay createPay() { // 创造产品对象
        return new AliPay();
    }

    @Override
    public Refund createRefund() { // 创造产品对象
        return new AliRefund();
    }
}
