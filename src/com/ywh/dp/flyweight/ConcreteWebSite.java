package com.ywh.dp.flyweight;

public class ConcreteWebSite extends CloudWebSite{
    private String catagory;
    public ConcreteWebSite(String catagory){
        this.catagory = catagory;
    }

    @Override
    public void run(Company company) {
        System.out.println("网站分类:" + catagory + ",公司:" + company.getName());
    }
}
