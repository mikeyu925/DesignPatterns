package com.ywh.dp.strategy;

/**
 * 抽象策略接口
 * @param <T>
 */
public interface AppleComparator<T>{
    int compare(T o1,T o2);
}
