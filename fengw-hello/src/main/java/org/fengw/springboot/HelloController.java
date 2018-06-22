package org.fengw.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 *
 * @author Feng Wei
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    /**
     * Hello
     * @return Hello World
     */
    @RequestMapping("/say")
    public String say() {
        return "Hello World";
    }
}
