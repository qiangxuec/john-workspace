package com.john.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JohnEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JohnEurekaServerApplication.class, args);
    }

}
