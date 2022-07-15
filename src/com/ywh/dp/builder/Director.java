package com.ywh.dp.builder;

/**
 * 将产品与创建过程解耦，控制产品生产过程
 * 具体细节由Builder操作
 */
public class Director {
    public Computer create(Builder builder){
        builder.buildCPU();
        builder.builddisk();
        builder.buildmemory();
        builder.buildmainboard();
        return builder.createComputer();
    }
}
