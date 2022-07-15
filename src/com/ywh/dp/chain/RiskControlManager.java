package com.ywh.dp.chain;

public abstract class RiskControlManager {
    protected String name;
    protected RiskControlManager superior; // 更严格的风控策略

    public RiskControlManager(String name){
        this.name = name;
    }

    public void setSuperior(RiskControlManager superior){
        this.superior = superior;
    }

    public abstract void  handlerRequest(Request request);

}
