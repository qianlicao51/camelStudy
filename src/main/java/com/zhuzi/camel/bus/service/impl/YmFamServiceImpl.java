package com.zhuzi.camel.bus.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhuzi.camel.bus.bean.YmFam;
import com.zhuzi.camel.bus.bean.YmFamExample;
import com.zhuzi.camel.bus.dao.YmFamMapper;
import com.zhuzi.camel.bus.service.YmFamService;

@Service("ymFamService")
public class YmFamServiceImpl implements YmFamService {


    @Resource
    public YmFamMapper ymFamMapper;

    @Override
    public List<YmFam> getAll() {
        YmFamExample example = new YmFamExample();
        example.setOrderByClause(" id desc ");
        List<YmFam> ymFamList = ymFamMapper.selectByExample(example);
        return ymFamList;
    }

    @Override
    public YmFam getById(int userid) {
    	System.out.println("YmFamServiceImpl.getById()");
        return ymFamMapper.selectByPrimaryKey(userid);
    }
}
