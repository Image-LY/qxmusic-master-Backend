package com.hubst;

import org.mybatis.spring.annotation.MapperScan;    
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hubst.dao")
public class  MusicStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(MusicStartApplication.class,args);
    }
}
