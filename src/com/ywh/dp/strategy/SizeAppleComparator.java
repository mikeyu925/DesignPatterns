package com.ywh.dp.strategy;

/**
 * 排序策略二 大小降序排序
 */
public class SizeAppleComparator implements AppleComparator<Apple>{
    @Override
    public int compare(Apple o1, Apple o2) {
        return o2.size - o1.size ;
    }
}
