package com.app.spring_boot_redis_cache_example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public void saveData(String key,String value){
        redisTemplate.opsForValue().set(key,value);
    }

    public String getData(String key){
        return (String) redisTemplate.opsForValue().get(key);
    }

}
