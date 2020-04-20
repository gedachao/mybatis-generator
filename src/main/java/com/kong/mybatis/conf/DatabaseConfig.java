package com.kong.mybatis.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.kong.mybatis.mapper")
public class DatabaseConfig {
}
