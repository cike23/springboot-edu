package com.attech.controller;

import com.attech.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Desc:
 * Author: Aaron
 * Time: 2018/7/6 21:06.
 * Version: v1.0
 */
@RestController
@RequestMapping(value="/ch2")
public class IndexController {

//    @Value("${project.name}") 或
    @Value(value = "${project.name}")
    private String projectName;

    @RequestMapping
    public String index(){
        return "Hello World......";
    }

    @RequestMapping(value = "/get")
    public Map<String, String> get(@RequestParam String name){
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("password", "123456789");
        map.put("projectName", projectName);
        return map;
    }

    @RequestMapping(value = "find/{id}/{name}")
    public User find(@PathVariable Integer id, @PathVariable String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setCreateTime(new Date());
        return user;
    }

}
