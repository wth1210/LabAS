package com.wth.labas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wth.labas.mapper")
public class LabAsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabAsApplication.class, args);
    }

}
