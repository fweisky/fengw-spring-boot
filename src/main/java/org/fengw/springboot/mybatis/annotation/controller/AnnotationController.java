package org.fengw.springboot.mybatis.annotation.controller;

import java.util.List;

import org.fengw.springboot.mybatis.annotation.service.IAnnotationService;
import org.fengw.springboot.mybatis.entity.GoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MyBatis的注解方式
 *
 * @author Feng Wei
 */
@RestController
@RequestMapping("mybatis/annotation")
public class AnnotationController {

    @Autowired
    private IAnnotationService service;

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
