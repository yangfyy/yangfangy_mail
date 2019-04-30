package com.springboot.entity;


import com.baomidou.mybatisplus.annotations.TableName;

import java.util.List;

@TableName(value="user_info")
public class UserInfo {
    private String uid;
    private String userName;//帐号
    private String name;//名称（昵称或者真实姓名，不同系统不同定义）
    private String password;//密码;
    private String salt;//加密密码的盐
    private String state;//用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.
    private List<Role> roles;// 一个用户具有多个角色

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    /**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){//重新对盐重新进行了定义，用户名+salt，这样就更加不容易被破解
        return this.userName+this.salt;
    }
    @Override
    public String toString() {
        return "UserInfo{" +
                "uid='" + uid + '\'' +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", state='" + state + '\'' +
                ", roles=" + roles +
                '}';
    }
}
