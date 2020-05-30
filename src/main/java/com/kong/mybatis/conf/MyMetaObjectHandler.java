package com.kong.mybatis.conf;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author gedachao
 * @description
 * @date 2020/4/21 14:51
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("------------");
      log.info("start insert fill...date:{}",new Date());
//      this.fillStrategy(metaObject,"createDate", new Date());
      this.strictInsertFill(metaObject,"createDate",Date.class,new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill...date:{}",new Date());
//        this.fillStrategy(metaObject,"updateDate", new Date());
        this.strictUpdateFill(metaObject,"updateDate",Date.class,new Date());

    }
}
