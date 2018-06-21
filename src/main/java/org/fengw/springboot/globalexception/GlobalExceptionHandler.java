package org.fengw.springboot.globalexception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 *
 * @author Feng Wei
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 拦截全局发生的Exception异常
     * @param e 异常
     * @return 异常信息
     */
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        return "Exception : " + e.getMessage();
    }
}
