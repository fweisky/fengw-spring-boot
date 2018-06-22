package org.fengw.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局异常处理
 *
 * @author Feng Wei
 */
@RestController
@RequestMapping("globalexception")
public class GlobalExceptionController {

    /**
     * 除0为了发生异常
     * @return 操作状态
     */
    @RequestMapping("exception")
    public String exception() {
        int i = 7 / 0;
        return "ok";
    }
}
