package com.ywh.dp.iterator;

import java.util.ArrayList;
import java.util.List;

// 具体的容器
public class MyCollection implements ICollection{

    private List list = new ArrayList();

    @Override
    public void add(Object obj) {
        this.list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
