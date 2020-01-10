package com.javaer.modules.websocket.config;

import com.javaer.modules.websocket.servcer.JavaWebSocketServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.UnknownHostException;

/**
 * @description: WebSocket配置
 * @author:
 * @date: 2018-12-14 15:58
 * @version: V1.0
 * @modified:
 */
@Configuration
public class JavaWebSocketConfig  {


    @Bean
    public JavaWebSocketServer javaWebSocketServer() {

        int port = 8887; // 843 flash policy port
        JavaWebSocketServer s = null;
        try {
            s = new JavaWebSocketServer(port);
            s.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        System.out.println("ChatServer started on port: " + s.getPort());
        return s;
//        BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
//        while (true) {
//            String in = sysin.readLine();
//            s.broadcast(in);
//            if (in.equals("exit")) {
//                s.stop(1000);
//                break;
//            }
//        }
    }

}
