package com.springboot;

import com.springboot.entity.Role;
import com.springboot.mapper.RoleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @ClassName RoleTest
 * @Author yangfangyuan
 * @Date 2019/4/14 15:42
 * @Version 1.0
 * @Desscription //TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShiroApplication.class)
public class RoleTest {
    @Autowired
    private RoleMapper roleMapper;
    @Test
     public void findByIdTest(){
        Role role = roleMapper.findById("942e3e06-60dd-11e9-9f62-f48e38f8137c");
        System.out.println(role);
    }
    @Test
    public void findAllTest(){
        Role role=new Role();
        List<Role> roles = roleMapper.findAll(role);
        System.out.println(roles);
    }
}
