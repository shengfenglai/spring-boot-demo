package spring.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.demo.exception.MyException;

@RestController
public class ExceptionController {

    @RequestMapping("/test-exception.htm")
    public String json() throws MyException {
        throw new MyException("make a error!!!");
    }
}
