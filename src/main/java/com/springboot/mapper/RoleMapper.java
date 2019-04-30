package com.springboot.mapper;

import com.springboot.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName RoleMapper
 * @Author yangfangyuan
 * @Date 2019/4/14 0:58
 * @Version 1.0
 * @Desscription //TODO
 */
@Mapper
public interface RoleMapper {
    /**根据角色id查询*/
    Role findById(@Param("id")String  id);
    /**查询所有角色*/
    List<Role> findAll(Role role);

}

