package com.ywh.dp.factory;

import com.ywh.dp.factory.ali.AliOrderFactory;
import com.ywh.dp.factory.wechat.WechatOrderFactory;

/**
 * 超级工厂创造器具 ———— 简单工厂模式
 */
public class FactoryProducer {
    public static OrderFactory getFactory(String type){
        if (type ==null) return null;
        else if (type.equalsIgnoreCase("wechat")){
            return new WechatOrderFactory();
        }else if (type.equalsIgnoreCase("ali")){
            return new AliOrderFactory();
        }
        return null;
    }
}
