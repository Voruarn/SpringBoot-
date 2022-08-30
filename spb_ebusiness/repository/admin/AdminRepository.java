package com.ch.spb_ebusiness.repository.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.spb_ebusiness.entity.AUser;

@Mapper
public interface AdminRepository {

    List<AUser> login(AUser aUser);
}
