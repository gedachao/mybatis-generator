package com.kong.mybatis.test;

import com.kong.mybatis.mapper.CatMapper;
import com.kong.mybatis.mapper.PersonMapper;
import com.kong.mybatis.mapper.UserMapper;
import com.kong.mybatis.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class Demo1 {
    @Autowired
    UserMapper userMapper;

    @Autowired
    PersonMapper personMapper;

    @Autowired
    CatMapper catMapper;


    @Test
    public void test1(){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAgeLessThan(21);
        List<User> users = userMapper.selectByExample(userExample);
        System.out.println(users);
    }

    @Test
    public void test2(){
        PersonExample personExample = new PersonExample();
        PersonExample.Criteria criteria = personExample.createCriteria();
        List<Person> people = personMapper.selectByExample(personExample);
        System.out.println(people);

    }

    @Test
    public void test3(){
        List<Cat> cats = catMapper.selectByExample(new CatExample());
        System.out.println(cats);
    }

}
