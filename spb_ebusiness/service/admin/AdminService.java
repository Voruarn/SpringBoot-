package com.ch.spb_ebusiness.service.admin;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.ch.spb_ebusiness.entity.AUser;

public interface AdminService {

    public String login(AUser aUser,HttpSession session,Model model);

}
