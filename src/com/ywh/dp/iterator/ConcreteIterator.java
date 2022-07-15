package com.ywh.dp.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator{

    private List list;

    private int index = 0;

    public ConcreteIterator(List list){
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(index);
            index++;
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object remove(Object obj) {
        return list.remove(obj);
    }
}
