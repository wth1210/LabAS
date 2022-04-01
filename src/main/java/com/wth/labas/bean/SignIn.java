package com.wth.labas.bean;


import lombok.Data;

import java.util.Date;

@Data
public class SignIn {
    private String qid;
    private String address;
    private String key;
    private String uid;
    private Integer type;
    private Integer duration;
    private Integer status;
    private Date start;
}
