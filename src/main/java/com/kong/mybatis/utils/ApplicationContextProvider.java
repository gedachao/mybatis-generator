package com.kong.mybatis.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author gedachao
 * @description
 * @date 2020/4/22 14:28
 */
@Component
public class ApplicationContextProvider implements ApplicationContextAware {

    private  ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public  ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public Object getBeanByClazz(Class clazz) throws BeansException{
        Object bean = applicationContext.getBean(clazz);
        return bean;
    }
}
