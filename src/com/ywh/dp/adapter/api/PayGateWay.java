package com.ywh.dp.adapter.api;

public interface PayGateWay {
    void order();  // 下单
    void refund(); // 退款
    void query();  // 查询
    void sendRedPack(); // 发红包
}
