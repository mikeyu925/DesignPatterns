package com.ywh.dp.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        p1.setName("abc");
        p1.setAge(15);
        p1.getFriends().add("cba");
        // 假设Person对象创建很复杂 如果要创建多个对象则使用clone()
        Person p2 = (Person) p1.deepClone();  // 不会经过构造函数调用
        p2.setName("6969");
        p2.setAge(12);
        p2.getFriends().add("666");
        System.out.println(p1);
        System.out.println(p2);
    }
}
