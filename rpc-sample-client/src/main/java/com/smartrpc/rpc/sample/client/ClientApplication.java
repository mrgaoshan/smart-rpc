package com.smartrpc.rpc.sample.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kasimodo on 2017-09-06.
 */
// 默认会扫描该类所在的包
@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication application = new SpringApplication(ClientApplication.class);
        application.run(args);
    }
}
