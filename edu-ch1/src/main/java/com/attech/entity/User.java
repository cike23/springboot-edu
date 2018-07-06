package com.attech.entity;

import java.util.Date;

/**
 * Desc:
 * Author: Aaron
 * Time: 2018/7/6 21:49.
 * Version: v1.0
 */
public class User {

    private Integer id;

    private String name;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
