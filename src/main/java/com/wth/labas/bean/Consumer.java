package com.wth.labas.bean;

import lombok.Data;

import java.util.Date;


@Data
public class Consumer {
    private String uid;

    private String username;

    private String phone;

    private String sex;

    private String email;

    private String password;

    private Date birth;

    private Integer type;

    private Integer status;
}
