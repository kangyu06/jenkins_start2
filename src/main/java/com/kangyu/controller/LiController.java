package com.kangyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname LiController
 * @Description TODO
 * @Date 2021/5/16 14:47
 * @Created by kangyu
 */
@RestController
public class LiController {

    @GetMapping("/li/hello")
    public String hello(@RequestParam String key) {
        return key;
    }

}
