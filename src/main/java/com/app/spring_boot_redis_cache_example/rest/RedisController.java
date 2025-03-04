package com.app.spring_boot_redis_cache_example.rest;

import com.app.spring_boot_redis_cache_example.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService service;

    @GetMapping("/save")
    public String saveRadisData(@RequestParam String key,@RequestParam String value){
        service.saveData(key,value);
        return "redis data saved successfully.....";
    }


    @GetMapping("/get")
    public String getData(@RequestParam String key){
        service.getData(key);
        return "retrieved data...";
    }



}
