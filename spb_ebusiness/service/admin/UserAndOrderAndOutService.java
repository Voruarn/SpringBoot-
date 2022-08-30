package com.ch.spb_ebusiness.service.admin;

import org.springframework.ui.Model;

public interface UserAndOrderAndOutService {
    public String selectUser(Model model,int currentPage);
    public String deleteUser(Model model,int id);
    public String selectOrder(Model model,int currentPage);
}
