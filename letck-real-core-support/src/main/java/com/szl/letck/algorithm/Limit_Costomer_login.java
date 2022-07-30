package com.szl.letck.algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @ClassName Limit_Costomer_login
 * @Desc 实现一个网关的限流器，限制某些IP在30分钟内登录次数超过30次的在30分钟内不能再访问。过后才可以再访问。
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/20 18:51
 */
public class Limit_Costomer_login {

    public static void main(String[] args) throws InterruptedException {

        while (true){
            System.out.println(limitLoginCheck("123"));

            Thread.sleep(100);
        }
    }

   public static String limitLoginCheck(String ip){

       LimitCache limitCache = LimitCache.getInstance();

       //先判断ip是否禁止登录
       if(limitCache.getForbidIpAndTimeMap().containsKey(ip)){
          Long startTime = limitCache.getForbidIpAndTimeMap().get(ip);
          long nowtime = System.currentTimeMillis();

           int minute = (int)((nowtime - startTime) / 1000 );

           if(minute <= 10){
               return  "你的禁止登录时间未到,稍后重试！" ;
           } else {
               limitCache.getForbidIpAndTimeMap().clear();
           }
       }

       if(!limitCache.getLimitIPWithLoginTimeMap().containsKey(ip)){
           LinkedList loginTimeList = new LinkedList<>();
           loginTimeList.add(System.currentTimeMillis());
           limitCache.getLimitIPWithLoginTimeMap().put(ip,loginTimeList);
       } else {

           LinkedList loginTimeList = limitCache.getLimitIPWithLoginTimeMap().get(ip);
           long nowtime = System.currentTimeMillis();
           if(loginTimeList.size() == 30){
              Long startLoginTime = (Long)loginTimeList.poll();

              int minute = (int)((nowtime - startLoginTime) / 1000 /60);

               if(minute <= 1){
                   limitCache.getForbidIpAndTimeMap().put(ip,nowtime);

                   limitCache.getLimitIPWithLoginTimeMap().get(ip).clear();

                   return "30 分钟内登录超过30 次，禁止登录";
               }
           }

           limitCache.getLimitIPWithLoginTimeMap().get(ip).offer(nowtime);
       }

       return  "正常访问" + limitCache.getLimitIPWithLoginTimeMap().get(ip).size();
   }

}


class LimitCache{

    private static volatile LimitCache limitCahce = null;

    private LimitCache(){}

    public static LimitCache getInstance(){
        if(limitCahce == null){
            synchronized (LimitCache.class){
                if(limitCahce == null){
                    limitCahce = new LimitCache();
                }
            }
        }
        return  limitCahce;
    }

    // 存放已经访问的ip，及此ip的每次登录时间
    private  Map<String, LinkedList<Long>> limitIPWithLoginTimeMap = new HashMap<>();

    //存放禁止的ip及 禁止时间
    private  Map<String,Long> forbidIpAndTime = new HashMap<>();

    public  Map<String, LinkedList<Long>> getLimitIPWithLoginTimeMap() {
        return limitIPWithLoginTimeMap;
    }

    public  Map<String, Long> getForbidIpAndTimeMap() {
        return forbidIpAndTime;
    }
}
