package com.kong.mybatis.test;

import com.kong.mybatis.mapper.UserMapper;
import com.kong.mybatis.model.User;
import com.kong.mybatis.model.UserExample;
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

    @Test
    public void test1(){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAgeLessThan(21);
        List<User> users = userMapper.selectByExample(userExample);
        System.out.println(users);

    }
}
