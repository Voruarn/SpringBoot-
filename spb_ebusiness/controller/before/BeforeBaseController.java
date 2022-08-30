package com.ch.spb_ebusiness.controller.before;

import javax.servlet.http.HttpSession;

import com.ch.spb_ebusiness.NoLoginException;

public class BeforeBaseController {
    //登录权限控制，处理方法执行前执行该方法
    public void isLogin(HttpSession session) throws NoLoginException{
        if(session.getAttribute("bUser")==null)
            throw new NoLoginException("没有登录！");
    }

}
