package com.ch.spb_ebusiness.util.before;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.spb_ebusiness.entity.BUser;

@Mapper
public interface UserRepository {
    public List<BUser> isUse(BUser bUser);
    public int register(BUser bUser);
    public List<BUser> login(BUser bUser);
}
