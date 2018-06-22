package org.fengw.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 全局异常处理
 *
 * @author Feng Wei
 */
@SpringBootApplication
public class GlobalExceptionApplication {

    /**
     * 主函数
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(GlobalExceptionApplication.class, args);
    }
}
