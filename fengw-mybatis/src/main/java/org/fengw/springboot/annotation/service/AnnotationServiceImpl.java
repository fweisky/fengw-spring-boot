package org.fengw.springboot.annotation.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.fengw.springboot.annotation.dao.AnnotationDao;
import org.fengw.springboot.common.entity.GoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MyBatis的注解方式
 *
 * @author Feng Wei
 */
@Service
public class AnnotationServiceImpl implements IAnnotationService {

    @Autowired
    private AnnotationDao dao;

    @Override
    public void delete() {
        dao.delete("fengW");
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
