package com.itheima.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //组合注解:相当于@Controller与@ResponseBody
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "helloWorld!";
    }

}
