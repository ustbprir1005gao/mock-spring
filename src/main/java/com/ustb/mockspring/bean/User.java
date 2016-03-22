package com.ustb.mockspring.bean;

import com.alibaba.fastjson.JSON;

/**
 * Created by ustbgao on 15-8-24.
 */
public class User {
    private String name;
    private Integer id;
    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public static void main(String [] args){
        User user = new User();
        user.setId(100);
        user.setName("gaoqi");
        UserInfo userInfo1 = new UserInfo();
        userInfo1.setAge(20);
        userInfo1.setCollegeName("ustb");
        user.setUserInfo(userInfo1);
        String json = JSON.toJSONString(user);
        System.out.println("转换后的对象的json字符串是:" + json);
    }
}
