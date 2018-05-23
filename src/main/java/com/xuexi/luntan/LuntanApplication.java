package com.xuexi.luntan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LuntanApplication {

    @RequestMapping("/")
    public String get(){
        return "Hello Word";
    }

    public static void main(String[] args) {
        SpringApplication.run(LuntanApplication.class, args);
    }
}
