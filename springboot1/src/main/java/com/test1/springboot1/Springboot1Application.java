package com.test1.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication(scanBasePackages = {"com.test1.springboot1", "com.test1.springboot1.test"})
public class Springboot1Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboot1Application.class, args);
    }
}
