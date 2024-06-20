package com.test.webtest.controoler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Api(tags = {"API Controller"})
//@Tag(name="API", description = "Sample API 입니다.")
@RequestMapping("/api")
@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello")
    public String hello(){

        logger.info("hello This is logger");
        return "hello, String!";
    }

    @GetMapping("/example")
    public String example() {
        return "예시 API";
    }

}
