package com.ywh.dp.single;

/**
 * 不仅可以解决线程同步，还可以防止反序列化
 */
public enum Singleton {
    INSTANCE;  // 单例
    /*一些业务方法*/
    public void method(){}
    // 如何调用？
    public static void main(String[] args) {
        for (int i = 0;i < 100;i++){
            new Thread(()->{
                System.out.println(Singleton.INSTANCE.hashCode());
            }).start();
        }
    }
}
