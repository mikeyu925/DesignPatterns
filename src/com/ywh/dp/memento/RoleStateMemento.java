package com.ywh.dp.memento;

public class RoleStateMemento {
    private int live; // 生命力
    private int atack; // 攻击力

    public RoleStateMemento(int live, int atack) {
        this.live = live;
        this.atack = atack;
    }
    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }
}
