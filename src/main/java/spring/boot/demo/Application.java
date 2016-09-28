package spring.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter{
    
    @Override
    //重写这个方法的目的: 是否采用扩展名的方式确定内容格式 ->不采用，默认是采用
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
         configurer.favorPathExtension(false);
     }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
