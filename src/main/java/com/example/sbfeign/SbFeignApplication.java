package com.example.sbfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SbFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbFeignApplication.class, args);
    }

}
