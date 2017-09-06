package com.smartrpc.rpc.sample.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by kasimodo on 2017-09-06.
 */
// 默认会扫描该类所在的包
@SpringBootApplication
public class RpcBootStrapApplication {
    //运行 RpcBootstrap 类，将对外发布 RPC 服务，同时进行服务注册
    public static void main(String[] args) throws InterruptedException {
        SpringApplication application = new SpringApplication(RpcBootStrapApplication.class);
        application.run(args);
    }
}
