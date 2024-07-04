package com.github.standardsolutions.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ClassicApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassicApplication.class, args);
    }

}