package com.kong.mybatis;

import com.kong.mybatis.conf.MyMetaObjectHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MybatisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisTestApplication.class, args);
    }


}
