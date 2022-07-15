package com.ywh.dp.builder;

public class Computer {
    // 产品
    private String cpu;
    private String memory;
    private String mainboard;
    private String disk;

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", dis='" + disk + '\'' +
                '}';
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String dis) {
        this.disk = dis;
    }
}
