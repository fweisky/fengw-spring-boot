package org.fengw.springboot.annotation.service;

import java.util.List;

import org.fengw.springboot.common.entity.GoodsEntity;

/**
 * MyBatis的注解方式
 *
 * @author Feng Wei
 */
public interface IAnnotationService {

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
