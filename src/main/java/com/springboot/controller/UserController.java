package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Author yangfangyuan
 * @Date 2019/4/10 23:09
 * @Version 1.0
 * @Desscription //用户控制器
 */
@RestController
@RequestMapping(name = "user")
public class UserController {
    @RequestMapping(value = ""  ,method = RequestMethod.GET)
    public String index(){
        return "index.html";
    }

}
