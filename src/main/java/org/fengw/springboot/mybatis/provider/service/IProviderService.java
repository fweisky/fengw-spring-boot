package org.fengw.springboot.mybatis.provider.service;

import java.util.List;

import org.fengw.springboot.mybatis.entity.GoodsEntity;

/**
 * MyBatis的注解（Provider）方式
 *
 * @author Feng Wei
 */
public interface IProviderService {

    /**
     * 删除数据
     * @param name 商品名称
     */
    void delete();

    /**
     * 插入数据
     * @param entity 商品信息
     */
    void insert();

    /**
     * 查询数据
     * @return 商品信息
     */
    List<GoodsEntity> query();

    /**
     * 更改数据
     * @param entity 商品信息
     */
    void update();
}
