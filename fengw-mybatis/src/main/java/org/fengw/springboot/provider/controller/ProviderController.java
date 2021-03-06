package org.fengw.springboot.provider.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.fengw.springboot.common.entity.GoodsEntity;
import org.fengw.springboot.provider.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MyBatis的注解（Provider）方式
 *
 * @author Feng Wei
 */
@RestController
@RequestMapping("mybatis/provider")
public class ProviderController {

    @Autowired
    private IProviderService service;

    /**
     * 删除数据
     * @return 操作状态
     */
    @RequestMapping("delete")
    public String delete() {
        service.delete();
        return "delete";
    }

    /**
     * 插入数据（动态SQL）
     * @return 操作状态
     */
    @RequestMapping("dynamicInsert")
    public String dynamicInsert() {

        // 只插入name字段
        GoodsEntity entity = new GoodsEntity();
        entity.setName("fengW");
        service.dynamicInsert(entity);

        // 只插入buy_date字段
        entity = new GoodsEntity();
        entity.setBuyDate(new Date());
        service.dynamicInsert(entity);

        // 只插入count字段
        entity = new GoodsEntity();
        entity.setCount(7);
        service.dynamicInsert(entity);

        // 只插入price字段
        entity = new GoodsEntity();
        entity.setPrice(new BigDecimal("77777.77"));
        service.dynamicInsert(entity);
        return "dynamicInsert";
    }

    /**
     * 插入数据
     * @return 操作状态
     */
    @RequestMapping("insert")
    public String insert() {
        service.insert();
        return "Insert";
    }

    /**
     * 查询数据
     * @return 商品信息
     */
    @RequestMapping("query")
    public List<GoodsEntity> query() {
        return service.query();
    }

    /**
     * 更改数据
     * @return 操作状态
     */
    @RequestMapping("update")
    public String update() {
        service.update();
        return "update";
    }
}
