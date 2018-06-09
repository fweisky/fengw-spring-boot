package org.fengw.springboot.mybatis.annotation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fengw.springboot.mybatis.entity.GoodsEntity;

/**
 * MyBatis的注解方式
 *
 * @author Feng Wei
 */
@Mapper
public interface AnnotationDao {

    /**
     * 删除数据
     * @param name 商品名称
     */
    @Delete("delete from t_goods where name=#{name}")
    void delete(@Param("name") String name);

    /**
     * 插入数据
     * @param entity 商品信息
     */
    @Insert("insert into t_goods (name, buy_date, count, price) values (#{goods.name}, #{goods.buyDate}, #{goods.count}, #{goods.price})")
    void insert(@Param("goods") GoodsEntity entity);

    /**
     * 查询数据
     * @return 商品信息
     */
    @Select("select name, buy_date as buyDate, count, price from t_goods")
    List<GoodsEntity> query();

    /**
     * 更改数据
     * @param entity 商品信息
     */
    @Update("update t_goods set buy_date=#{goods.buyDate}, count=#{goods.count}, price=#{goods.price} where name=#{goods.name}")
    void update(@Param("goods") GoodsEntity entity);
}
