package spring.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo_1 {

    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo_1.class, args);
    }

}
