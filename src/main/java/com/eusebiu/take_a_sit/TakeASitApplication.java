package com.eusebiu.take_a_sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class TakeASitApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeASitApplication.class, args);
    }
}
