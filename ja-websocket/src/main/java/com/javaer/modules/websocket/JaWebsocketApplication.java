package com.javaer.modules.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JaWebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaWebsocketApplication.class, args);
    }

}
