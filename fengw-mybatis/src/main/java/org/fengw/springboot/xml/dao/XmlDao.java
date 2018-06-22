package org.fengw.springboot.xml.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.fengw.springboot.common.entity.GoodsEntity;

/**
 * MyBatis的XML配置方式
 *
 * @author Feng Wei
 */
@Mapper
public interface XmlDao {

    /**
     * 删除数据
     * @param name 商品名称
     */
    void delete(String name);

    /**
     * 插入数据
     * @param entity 商品信息
     */
    void insert(GoodsEntity entity);

    /**
     * 查询数据
     * @return 商品信息
     */
    List<GoodsEntity> query();

    /**
     * 更改数据
     * @param entity 商品信息
     */
    void update(GoodsEntity entity);
}
