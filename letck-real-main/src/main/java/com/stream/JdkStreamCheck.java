package com.stream;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;

/**
 * <p>Title: JdkStreamCheck</p>
 * <p>Description: </p>
 *
 * @author szl
 * @version 1.0.0
 * @date 2019/10/23  19:36
 */
public class JdkStreamCheck {

    public static void main(String[] args) {

        jsonStrGet();
    }

    private static void jsonStrGet(){
        String jsonStr = "{omc_fulfillment_rule:{\"gexinghua_touxiang\":[1,2],\"yunshuwendu\":[1]}}";
        JSONObject extObject = JSONObject.parseObject(jsonStr);
        String omcFulfillmentRule = extObject.getString("omc_fulfillment_rule");
        if (StringUtils.isNotEmpty(omcFulfillmentRule)) {
            JSONObject omcFulfillmentRuleMap = JSONObject.parseObject(omcFulfillmentRule);
            if(omcFulfillmentRuleMap != null){
                JSONArray touxiangValues = JSONObject.parseArray(omcFulfillmentRuleMap.get("gexinghua_touxiang").toString());
                if(touxiangValues != null && !touxiangValues.isEmpty()){
                    System.out.printf("===="+ touxiangValues.getInteger(1));
                }

            }
        }

    }
}
