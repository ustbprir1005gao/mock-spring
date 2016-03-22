package com.ustb.mockspring.service;

import com.alibaba.fastjson.JSON;
import com.ustb.mockspring.annotation.Controller;
import com.ustb.mockspring.annotation.RequestMapping;
import com.ustb.mockspring.bean.User;
import com.ustb.mockspring.bean.UserInfo;

/**
 * Created by ustbgao on 15-8-24.
 */
public class TestService {
    //@RequestMapping(value = "/hello")
    @Controller
    public String getJsonString(){
        User user = new User();
        user.setId(100);
        user.setName("gaoqi");
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(20);
        userInfo.setCollegeName("ustb");
        user.setUserInfo(userInfo);
        return JSON.toJSONString(user);
    }
}
