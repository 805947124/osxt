package com.cn.mapper;

import com.cn.entity.TblUser;
import java.util.List;

public interface TblUserMapper {
    int deleteByPrimaryKey(Integer userid);

    public void insertFun(TblUser tblUser);

    public TblUser selectByNameFun(String name);
    
    public TblUser selectByNameFun();

    List<TblUser> selectAllFun();

    /*int updateByPrimaryKey(TblUser record);*/
}