package com.ywh.dp.factory;

public interface OrderFactory {
    Pay createPay();
    Refund createRefund();
}
