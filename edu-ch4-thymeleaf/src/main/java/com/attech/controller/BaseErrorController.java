package com.attech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc: 错误控制
 * Author: Aaron
 * Time: 2018/7/15 22:28.
 * Version: v1.0
 */
@Controller
@RequestMapping(value = "error")
public class BaseErrorController implements ErrorController {

    private static final Logger log = LoggerFactory.getLogger(BaseErrorController.class);

    @Override
    public String getErrorPath() {
        log.info("您访问的页面被外星人劫走了......");
        return "error";
    }

    @RequestMapping
    public String error(){
        return getErrorPath();
    }
}
