package com.ustb.mockspring.controller;

import com.alibaba.fastjson.JSON;
import com.ustb.mockspring.annotation.Controller;
import com.ustb.mockspring.bean.User;
import com.ustb.mockspring.bean.UserInfo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ustbgao on 15-8-24.
 */
public class DispatcherServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
    public void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException{
        System.out.println(req.getAuthType());
        System.out.println(req.getMethod());
        System.out.println(req.getRemoteUser());
        System.out.println(req.getRequestURL());
        System.out.println(req.getContentType());
        InputStream in = req.getInputStream();
        BufferedReader buf = new BufferedReader(new InputStreamReader(in));
        String temp = null;
        System.out.println("客户端请求的内容如下:");
        while((temp = buf.readLine()) != null){
            System.out.println(temp);
        }
        buf.close();
        String json = null;
        try {
            Class c = Class.forName("com.ustb.mockspring.service.TestService");
            Method [] methods = c.getDeclaredMethods();
            for(Method method : methods){
            if(method.isAnnotationPresent(Controller.class)){
                try {
                    json = (String)method.invoke(c.newInstance());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        PrintWriter out = res.getWriter();
        out.println(json);
        out.flush();
    }


    public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
        this.doPost(req,res);
    }
}
