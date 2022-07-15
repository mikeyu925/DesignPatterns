package com.ywh.dp.factory.simple;

import com.ywh.dp.factory.ali.AliPay;
import com.ywh.dp.factory.BankPay;
import com.ywh.dp.factory.Pay;
import com.ywh.dp.factory.wechat.WechatPay;

/**
 * 简单工厂模式
 */
public class SimpleFactory {
//    /**
//     * 根据参数返回对应的支付对象
//     * @param payType
//     * @return
//     */
//    public static Pay createPay(String payType){
//        if (payType == null) return null;
//        else if (payType.equalsIgnoreCase("WechatPay")){
//            return new WechatPay();
//        }else if (payType.equalsIgnoreCase("AliPay")){
//            return new AliPay();
//        }else if (payType.equalsIgnoreCase("BankPay")){
//            return new BankPay();
//        }
//        return null;
//    }
}
