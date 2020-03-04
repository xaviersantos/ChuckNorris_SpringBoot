package com.ua.es.labproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LabProjectApplication {

    private static final Logger log = LoggerFactory.getLogger(LabProjectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LabProjectApplication.class, args);
    }
}
