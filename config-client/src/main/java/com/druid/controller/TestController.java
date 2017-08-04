package com.druid.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangz on 2017/8/4.
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from(){
        return this.from;
    }

}
