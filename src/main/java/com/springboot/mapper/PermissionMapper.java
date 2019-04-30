package com.springboot.mapper;

import com.springboot.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName PermissionMapper
 * @Author yangfangyuan
 * @Date 2019/4/14 0:57
 * @Version 1.0
 * @Desscription //TODO
 */
@Mapper
public interface PermissionMapper {
    /**
     * 权限id查询
     * @param id
     * @return
     */
    Permission getById(@Param("id") String id);

    /**
     * 根据角色id查询权限
     * @param roleId
     * @return
     */
    List<Permission> selectPerssionMapByRoleId(@Param("roleId") String roleId);
}
