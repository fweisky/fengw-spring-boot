package org.fengw.springboot.mybatis.provider.provider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;
import org.fengw.springboot.mybatis.entity.GoodsEntity;
import org.springframework.util.StringUtils;

/**
 * MyBatis的注解（Provider）方式
 *
 * @author Feng Wei
 */
public class ProviderProvider {

    /**
     * 删除数据的SQL
     * @return SQl语句
     */
    public String deleteSql() {
        return new SQL() {{
            DELETE_FROM("t_goods");
            WHERE("name = #{name}");
        }}.toString();
    }

    /**
     * 插入数据（动态SQL）
     * @param entity 商品表实体类
     * @return SQL语句
     */
    public String dynamicInsertSql(@Param("goods") GoodsEntity entity) {
        return new SQL() {{
            INSERT_INTO("t_goods");

            if (!StringUtils.isEmpty(entity.getName())) {
                VALUES("name", "#{goods.name}");
            }

            if (!StringUtils.isEmpty(entity.getBuyDate())) {
                VALUES("buy_date", "#{goods.buyDate}");
            }

            if (!StringUtils.isEmpty(entity.getCount())) {
                VALUES("count", "#{goods.count}");
            }

            if (!StringUtils.isEmpty(entity.getPrice())) {
                VALUES("price", "#{goods.price}");
            }
        }}.toString();
    }

    /**
     * 插入数据的SQL
     * @return SQL语句
     */
    public String insertSql() {
        return new SQL() {{
            INSERT_INTO("t_goods");
            VALUES("name", "#{goods.name}");
            VALUES("buy_date", "#{goods.buyDate}");
            VALUES("count", "#{goods.count}");
            VALUES("price", "#{goods.price}");
        }}.toString();
    }

    /**
     * 查询数据的SQL
     * @return SQL语句
     */
    public String querySql() {
        return new SQL() {{
            SELECT("name, buy_date as buyDate, count, price");
            FROM("t_goods");
        }}.toString();
    }

    /**
     * 更新数据的SQL
     * @return SQL语句
     */
    public String updateSql() {
        return new SQL() {{
            UPDATE("t_goods");
            SET("buy_date = #{goods.buyDate}, count = #{goods.count}, price = #{goods.price}");
            WHERE("name = #{goods.name}");
        }}.toString();
    }
}
