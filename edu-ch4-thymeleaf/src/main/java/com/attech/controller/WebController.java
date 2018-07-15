package com.attech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc:
 * Author: Aaron
 * Time: 2018/7/15 14:42.
 * Version: v1.0
 */
@Controller
@RequestMapping("/thymeleaf")
public class WebController {

    private static final Logger log = LoggerFactory.getLogger(WebController.class);

    @RequestMapping("/index")
    public String index(ModelMap map){
        log.info("进入 /web/index thymeleaf 控制类......");
        map.put("title", "Hello Thymeleaf!!!");
        return "index";
    }



}
