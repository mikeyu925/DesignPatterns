package com.ywh.dp.builder;


public class DellComputer implements Builder{
    private Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.setCpu("DELL CPU");
    }

    @Override
    public void buildmainboard() {
        computer.setMainboard("DELL mainboard");
    }

    @Override
    public void builddisk() {
        computer.setDisk("DELL disk");
    }

    @Override
    public void buildmemory() {
        computer.setMemory("DELL memory");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
