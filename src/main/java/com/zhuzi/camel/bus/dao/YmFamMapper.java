package com.zhuzi.camel.bus.dao;

import org.apache.ibatis.annotations.Param;

import com.zhuzi.camel.bus.bean.YmFam;
import com.zhuzi.camel.bus.bean.YmFamExample;

public interface YmFamMapper {
    int countByExample(YmFamExample example);

    int deleteByExample(YmFamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YmFam record);

    int insertSelective(YmFam record);

    java.util.List<com.zhuzi.camel.bus.bean.YmFam> selectByExample(YmFamExample example);

    YmFam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YmFam record, @Param("example") YmFamExample example);

    int updateByExample(@Param("record") YmFam record, @Param("example") YmFamExample example);

    int updateByPrimaryKeySelective(YmFam record);

    int updateByPrimaryKey(YmFam record);
}