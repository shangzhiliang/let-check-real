package com.szl.letck.cache;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @ClassName JavaLRUCache
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/3/25 19:10
 * @Version 1.0
 */
public class JavaLRUCache {

    private Map<Object,Object> map ;

    private int capacity;

    public JavaLRUCache(int capacity){
        this.capacity= capacity;

        map = new LinkedHashMap<Object,Object>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Object, Object> eldest) {
                return size() > capacity;
            }

            @Override
            public String toString() {
                return super.toString();
            }
        };
    }

    public void put(Object key, Object v){
        this.map.put(key,v);
    }

    public Object get(String key){
        return map.get(key);
    }

    public void remove(Object o){
        map.remove(o);
    }

    @Override
    public String toString() {
        return "JavaLRUCache{" +
                "map=" + map +
                ", capacity=" + capacity +
                '}';
    }

    private void resortList(List<String> allItems,JavaLRUCache lruCache){
        Random random = new Random();
        int index = random.nextInt(allItems.size());
        String randomItem = allItems.get(index);
        System.out.println(" will add item :" + randomItem);
        lruCache.put(index,randomItem);
    }

    public static void main(String[] args) {
        List<String> allItems = Lists.newArrayList("A","B","C","D","E","F","H","I","G","K");

        JavaLRUCache lruCache = new JavaLRUCache(3);

        int count = 1;

        while (count < 10){

            lruCache.resortList(allItems,lruCache);

            System.out.println(JSON.toJSONString(lruCache));
            count++;
        }
    }
}
