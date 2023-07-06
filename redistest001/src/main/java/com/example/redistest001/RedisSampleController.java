package com.example.redistest001;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class RedisSampleController {

    @Autowired
    private RedisSampleService redisSampleService;

    @PostMapping(value = "/getRedisStringValue")
    public void getRedisStringValue(String key) {
        redisSampleService.getRedisStringValue(key);
    }

    @GetMapping("/getSessionId")
    public String getSessionId(HttpSession session) {
        return session.getId();
    }

}
