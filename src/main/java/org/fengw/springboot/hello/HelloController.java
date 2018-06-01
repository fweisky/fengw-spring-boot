package org.fengw.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 *
 * @author Feng Wei
 */
@RestController
public class HelloController {

    /**
     * Hello
     * @return Hello World
     */
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
