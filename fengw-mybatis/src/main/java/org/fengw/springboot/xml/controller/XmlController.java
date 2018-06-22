package org.fengw.springboot.xml.controller;

import java.util.List;

import org.fengw.springboot.common.entity.GoodsEntity;
import org.fengw.springboot.xml.service.IXmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MyBatis的XML配置方式
 *
 * @author Feng Wei
 */
@RestController
@RequestMapping("mybatis/xml")
public class XmlController {

    @Autowired
    private IXmlService service;

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
