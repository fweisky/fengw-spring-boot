package org.fengw.springboot.mybatis.provider.provider;

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
        return "delete from t_goods where name=#{name}";
    }

    /**
     * 插入数据的SQL
     * @return SQL语句
     */
    public String insertSql() {
        StringBuilder sql = new StringBuilder();
        sql.append(" insert into t_goods");
        sql.append(" (name, buy_date, count, price)");
        sql.append(" values");
        sql.append(" (#{goods.name}, #{goods.buyDate}, #{goods.count}, #{goods.price})");
        return sql.toString();
    }

    /**
     * 查询数据的SQL
     * @return SQL语句
     */
    public String querySql() {
        return "select name, buy_date as buyDate, count, price from t_goods";
    }

    /**
     * 更新数据的SQL
     * @return SQL语句
     */
    public String updateSql() {
        StringBuilder sql = new StringBuilder();
        sql.append(" update t_goods");
        sql.append(" set buy_date=#{goods.buyDate}, count=#{goods.count}, price=#{goods.price}");
        sql.append(" where name=#{goods.name}");
        return sql.toString();
    }
}
