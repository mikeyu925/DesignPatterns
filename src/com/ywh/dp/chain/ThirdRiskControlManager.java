package com.ywh.dp.chain;

public class ThirdRiskControlManager extends RiskControlManager{
    public ThirdRiskControlManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (RequestType.valueOf(request.getType()) != null && request.getMoney() > 10000 ){
            System.out.println("高级操作，输入密码及手机验证码及面部识别.");

            System.out.println(name +":" + request.getType() +", 金额: " + request.getMoney());
        }else { // 当前没有权限处理，转让给更高级别
            if (superior != null){
                superior.handlerRequest(request);
            }
        }
    }
}
