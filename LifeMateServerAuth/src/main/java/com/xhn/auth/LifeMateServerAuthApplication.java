package com.xhn.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.xhn")
@SpringBootApplication
public class LifeMateServerAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifeMateServerAuthApplication.class, args);
    }

}
