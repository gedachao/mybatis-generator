package com.kong.mybatis.conf;

import com.baomidou.mybatisplus.core.config.GlobalConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.kong.mybatis.mapper")
public class DatabaseConfig {

   /* @Autowired
    MyMetaObjectHandler myMetaObjectHandler;

    @Bean
    public GlobalConfig getGlobalConfig(){
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setMetaObjectHandler(myMetaObjectHandler);
        return globalConfig;

    }*/
}
