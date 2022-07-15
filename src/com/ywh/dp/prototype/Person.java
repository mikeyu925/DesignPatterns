package com.ywh.dp.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable, Serializable {
    private String name;
    private int age;
    private List<String> friends = new ArrayList<>();

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Person() {
        System.out.println("构造函数被调用");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    public Object deepClone(){
        try {
            // 输出 序列化
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            // 输入 反序列化
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Person copy = (Person) ois.readObject();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                '}';
    }
}
