package com.ywh.dp.chain;

public class FirstRiskControlManager extends RiskControlManager{

    public FirstRiskControlManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (RequestType.valueOf(request.getType()) != null && request.getMoney() <= 1000){
            System.out.println("普通操作，输入密码即可.");

            System.out.println(name +":" + request.getType() +", 金额: " + request.getMoney());
        }else { // 当前没有权限处理，转让给更高级别
            if (superior != null){
                superior.handlerRequest(request);
            }
        }
    }
}
