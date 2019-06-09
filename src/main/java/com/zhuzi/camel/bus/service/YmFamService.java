package com.zhuzi.camel.bus.service;

import com.zhuzi.camel.bus.bean.YmFam;

import java.util.List;

public interface YmFamService {

    public List<YmFam> getAll();

    public YmFam getById(int userid);
}
