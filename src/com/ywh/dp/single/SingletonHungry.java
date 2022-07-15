package com.ywh.dp.single;

/**
 * 饿汉式，效率高，没有多线程问题，但是占用内存，可能造成浪费
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    /**
     * 构造函数私有化
     */
    private SingletonHungry(){};

    /**
     * 获取实例对象
     * @return
     */
    public static SingletonHungry getInstance(){
        return instance;
    }

    public void process(){
        System.out.println("方法调用成功");
    }
}
