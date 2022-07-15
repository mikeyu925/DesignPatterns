package com.ywh.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {
    /**
     * key : catagory
     */
    Map<String,ConcreteWebSite> map = new HashMap<>();

    /**
     * 根据分类获取分类站点
     * @param key
     * @return
     */
    public CloudWebSite getWebSiteByKey(String key){
        if (map.containsKey(key)){
            return map.get(key);
        }
        ConcreteWebSite site = new ConcreteWebSite(key);
        map.put(key,site);
        return site;
    }

    /**
     * 获取站点类别数量
     * @return
     */
    public int getSiteCatagoryCount(){
        return map.size();
    }

}
