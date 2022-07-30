package com.szl.letck.cache;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * @ClassName LRU算法验证，最近最少使用原则：其规则是维护一个队列（即缓存），当有对象被访问时，将其放置到队列头部，
 * 队列内其它对象往后挪一步。当队列内存在的对象被访问时，将其放置到队列头部，其前的对象统一后羿一步。如果队列满了将队列最后
 * 一个元素删除，新元素放头部
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/3/25 16:36
 * @Version 1.0
 */
public class LRUCacheListTest {

    private static List<String> allItems = Lists.newArrayList("A","B","C","D","E","F","H","I","G","K");

    // 初始化一个3长度的队列，存放字符串
    private static  LimitQueue<String> limitQueue = new LimitQueue<>(3);

    LRUCacheListTest(){

    }

    private static void resortList(){
        Random random = new Random();
        int index = random.nextInt(allItems.size());
        String randomItem = allItems.get(index);
        System.out.println(" will add item :" + randomItem);

        limitQueue.put(randomItem);
    }

    public static void main(String[] args) {
        int count = 1;

        while (count < 10){
            resortList();
            System.out.println(JSON.toJSONString(limitQueue));
            count++;
        }

    }
}
