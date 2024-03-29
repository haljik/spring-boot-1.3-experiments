package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by haljik on 15/10/10.
 */
@SpringBootApplication
@EnableAuthorizationServer
public class Application {
    public static void main(String...args) {
        SpringApplication.run(Application.class, args);
    }
}
