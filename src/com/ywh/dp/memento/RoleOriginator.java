package com.ywh.dp.memento;

public class RoleOriginator {
    private int live = 100; // 生命力
    private int atack = 50; // 攻击力

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

    @Override
    public String toString() {
        return "角色{" +
                "生命力" + live +
                ", 攻击力:" + atack +
                '}';
    }
    // 打怪升级 攻击力上升，体力减少
    public void fight(){
        this.atack += 2;
        this.live -= 5;
    }
    // 存档
    public RoleStateMemento saveState(){
        return new RoleStateMemento(this.live,this.atack); // 一个快照副本
    }
    // 恢复
     public void recoverState(RoleStateMemento memento){
        this.atack = memento.getAtack();
        this.live = memento.getLive();
     }
}
