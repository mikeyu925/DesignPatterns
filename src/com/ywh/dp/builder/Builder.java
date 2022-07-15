package com.ywh.dp.builder;

/**
 * 声明建造者的公共方法
 */
public interface Builder {
    void buildCPU();
    void buildmainboard();
    void builddisk();
    void buildmemory();
    Computer createComputer();
}
