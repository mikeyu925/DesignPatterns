package com.ywh.dp.single;
/*
 * @Author Lints
 * @Date 2022/7/7 14:45
 * @Description 单例设计模式(懒汉式)
 * @Since version-1.0
 */
public class SingletonLazy {
    /**
     * 构造函数私有化
     */
    private SingletonLazy(){};

    /**
     * 采用静态内部类实现单例模式
     */
    private static class InstanceHolder{
        private final static SingletonLazy instance = new SingletonLazy();
    }

    public static SingletonLazy getInstance(){
        return InstanceHolder.instance;
    }

    /**
     * 对外暴露方法获取类对象(线程不安全)
     */
//    public static SingletonLazy getInstance(){
//        if (instance == null){
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }

    /**
     * 方法一：通过加锁保证线程安全
     * 采用 synchronized ，但对方法加锁有很大性能开销
     */
//    private static  SingletonLazy instance;
//    public static synchronized SingletonLazy getInstance(){
//        if (instance == null){
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }


    /**
     * 方法二：DCL 双重检查锁定，再多线程情况下保持高性能
     * 但是 instance = new SingletonLazy();并非原子操作，包括了如下步骤：
     * 1.分配空间给对象
     * 2.在空间内创建对象
     * 3.将对象赋值给引用instance
     * 假如出现指令重排，线程1->3->2顺序，会不安全。因此需要用到 volatile 禁止指令重排
     * 即：private static volatile SingletonLazy instance;
     * @return
     */
//    private static volatile SingletonLazy instance;
//    public static synchronized SingletonLazy getInstance(){
//        if (instance == null){
//            synchronized (SingletonLazy.class){
//                if (instance == null)
//                    instance = new SingletonLazy();
//            }
//        }
//        return instance;
//    }

    public void process(){
        System.out.println("方法调用成功!");
    }
}
