package com.springboot.entity;


import java.util.List;

public class Permission {
    private String id;
    private String available;
    private String name;//名称.
    private String parentId;//父编号
    private String parentIds;//父编号列表
    private String permission;//权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view
    private String resourceType;//资源类型，[menu|button]
    private String url;//资源路径.
    private List<Role> roles;

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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }


    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }


    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }


    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id='" + id + '\'' +
                ", available='" + available + '\'' +
                ", name='" + name + '\'' +
                ", parentId='" + parentId + '\'' +
                ", parentIds='" + parentIds + '\'' +
                ", permission='" + permission + '\'' +
                ", resourceType='" + resourceType + '\'' +
                ", url='" + url + '\'' +
                ", roles=" + roles +
                '}';
    }
}
