package org.fengw.springboot.mybatis.dao;

import org.fengw.springboot.mybatis.entity.Test1Entity;

import com.sun.tools.javac.util.List;

public interface MyBatisDao {

    void insert(Test1Entity entity);
    void update(Test1Entity entity);
    List<Test1Entity> queryAll();
}
