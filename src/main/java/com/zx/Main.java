package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 启动springboot项目的主入口程序
* */
@SpringBootApplication //这是一个springboot应用
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}