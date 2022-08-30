package com.ch.spb_ebusiness.service.before;

import org.springframework.ui.Model;

public interface IndexService {
    public String index(Model model,Integer tid);
    public String goodsDetail(Model model,Integer id);
    public String search(Model model,String mykey);
}
