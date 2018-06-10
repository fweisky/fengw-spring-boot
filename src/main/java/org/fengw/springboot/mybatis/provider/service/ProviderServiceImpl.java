package org.fengw.springboot.mybatis.provider.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.fengw.springboot.mybatis.entity.GoodsEntity;
import org.fengw.springboot.mybatis.provider.dao.ProviderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MyBatis的注解（Provider）方式
 *
 * @author Feng Wei
 */
@Service
public class ProviderServiceImpl implements IProviderService {

    @Autowired
    private ProviderDao dao;

    @Override
    public void delete() {
        dao.delete("fengW");
    }

    @Override
    public void dynamicInsert(GoodsEntity entity) {
        dao.dynamicInsert(entity);
    }

    @Override
    public void insert() {
        GoodsEntity entity = new GoodsEntity();
        entity.setName("fengW");
        entity.setBuyDate(new Date());
        entity.setCount(7);
        entity.setPrice(new BigDecimal("77777.77"));
        dao.insert(entity);
    }

    @Override
    public List<GoodsEntity> query() {
        return dao.query();
    }

    @Override
    public void update() {
        GoodsEntity entity = new GoodsEntity();
        entity.setName("fengW");
        entity.setBuyDate(new Date());
        entity.setCount(8);
        entity.setPrice(new BigDecimal("88888.88"));
        dao.update(entity);
    }
}
