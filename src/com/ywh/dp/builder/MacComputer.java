package com.ywh.dp.builder;

public class MacComputer implements Builder{
    private Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.setCpu("MAC CPU");
    }

    @Override
    public void buildmainboard() {
        computer.setMainboard("MAC mainboard");
    }

    @Override
    public void builddisk() {
        computer.setDisk("MAC disk");
    }

    @Override
    public void buildmemory() {
        computer.setMemory("MAC memory");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
