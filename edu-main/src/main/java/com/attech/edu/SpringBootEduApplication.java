package com.attech.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Desc:
 * Author: Aaron
 * Time: 2018/7/6 21:03.
 * Version: v1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.attech")
public class SpringBootEduApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEduApplication.class, args);
    }

}
