package com.concurrency.concurrentCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManager {
    private Map<String, Object> foodData = new ConcurrentHashMap<>();
    Map<String,Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
    public void put(String key, Object value){
        foodData.put(key,value);
    }
    public Object get(String key){
        return foodData.get(key);
    }

    public static void main(String[] args) {
        ZooManager manager = new ZooManager();
        manager.put("penguin",1);
        manager.put("flamingo",2);
        System.out.println(manager.get("flamingo"));

    }
}
