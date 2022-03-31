package com.customerapi.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.customerapi")
public class ApidemoApplication {

    public static void main(String[] args) {
            SpringApplication.run(ApidemoApplication.class, args);
    }

}
