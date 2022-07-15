package com.ywh.dp.chain;

public class SecondRiskControlManager extends RiskControlManager{

    public SecondRiskControlManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (RequestType.valueOf(request.getType()) != null && request.getMoney() > 1000 && request.getMoney() <= 10000){
            System.out.println("中等操作，输入密码及手机号验证码即可.");

            System.out.println(name +":" + request.getType() +", 金额: " + request.getMoney());
        }else { // 当前没有权限处理，转让给更高级别
            if (superior != null){
                superior.handlerRequest(request);
            }
        }
    }
}
