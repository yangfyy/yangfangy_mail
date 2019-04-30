package com.springboot;

import com.springboot.entity.Permission;
import com.springboot.mapper.PermissionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName PermissionTest
 * @Author yangfangyuan
 * @Date 2019/4/15 20:32
 * @Version 1.0
 * @Desscription 权限测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShiroApplication.class)
public class PermissionTest {
    @Autowired
    private PermissionMapper permissionMapper;
    @Test
    public void findByIdTest(){
        Permission permission = permissionMapper.getById("d56e50a6-5e03-11e9-9f62-f48e38f8137c");
        System.out.println(permission);
    }
    @Test
    public void selectPerssionMapByRoleId(){
        List<Permission> permissions = permissionMapper.selectPerssionMapByRoleId("e10fc975-5e03-11e9-9f62-f48e38f8137c");
        System.out.println(permissions);
    }
}
