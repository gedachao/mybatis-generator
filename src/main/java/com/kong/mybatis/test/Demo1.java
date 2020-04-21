package com.kong.mybatis.test;

import com.kong.mybatis.mapper.CatMapper;
import com.kong.mybatis.mapper.DogMapper;
import com.kong.mybatis.mapper.PersonMapper;
import com.kong.mybatis.mapper.UserMapper;
import com.kong.mybatis.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Demo1 {
    @Autowired
    UserMapper userMapper;

    @Autowired
    PersonMapper personMapper;

    @Autowired
    CatMapper catMapper;

    @Autowired
    DogMapper dogMapper;


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
        Dog dog = new Dog();
        dog.setPkDog(2);
        dog.setDogName("乔治");
        dog.setAddress("总警司");
        int insert = dogMapper.insert(dog);
        System.out.println(insert);
    }

}
