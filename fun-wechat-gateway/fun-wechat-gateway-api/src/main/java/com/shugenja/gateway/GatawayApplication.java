package com.shugenja.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by hanruofei on 16/8/4.
 */
@SpringBootApplication
public class GatawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatawayApplication.class, "--server.port=8081");
    }

}
