package org.fengw.springboot.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.fengw.springboot.common.entity.GoodsEntity;
import org.fengw.springboot.provider.provider.ProviderProvider;

/**
 * MyBatis的注解（Provider）方式
 *
 * @author Feng Wei
 */
@Mapper
public interface ProviderDao {

    /**
     * 删除数据
     * @param name 商品名称
     */
    @DeleteProvider(type = ProviderProvider.class, method = "deleteSql")
    void delete(@Param("name") String name);

    /**
     * 插入数据（动态SQL）
     * @param entity
     */
    @InsertProvider(type = ProviderProvider.class, method = "dynamicInsertSql")
    void dynamicInsert(@Param("goods") GoodsEntity entity);

    /**
     * 插入数据
     * @param entity 商品信息
     */
    @InsertProvider(type = ProviderProvider.class, method = "insertSql")
    void insert(@Param("goods") GoodsEntity entity);

    /**
     * 查询数据
     * @return 商品信息
     */
    @SelectProvider(type = ProviderProvider.class, method = "querySql")
    List<GoodsEntity> query();

    /**
     * 更改数据
     * @param entity 商品信息
     */
    @UpdateProvider(type = ProviderProvider.class, method = "updateSql")
    void update(@Param("goods") GoodsEntity entity);
}
