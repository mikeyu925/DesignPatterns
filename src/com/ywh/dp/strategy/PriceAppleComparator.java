package com.ywh.dp.strategy;

/**
 * 排序策略一 价格升序排序
 */
public class PriceAppleComparator implements AppleComparator<Apple>{
    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.price - o2.price;
    }
}
