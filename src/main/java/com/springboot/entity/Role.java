package com.springboot.entity;

import java.util.List;

public class Role {
    private String id;//主键
    private String available;// 是否可用,如果不可用将不会添加给用户
    private String description;// 角色描述,UI界面显示使用
    private String role;// 角色标识程序中判断使用,如"admin",这个是唯一的:
    private List<Permission> permissions;//角色 -- 权限关系：多对多关系;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        permissions = permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", available='" + available + '\'' +
                ", description='" + description + '\'' +
                ", role='" + role + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
