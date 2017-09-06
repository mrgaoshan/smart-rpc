package com.smartrpc.rpc.sample.server.config;

import com.smartrpc.rpc.registry.discovery.ServiceRegistry;
import com.smartrpc.rpc.registry.discovery.zookeeper.ZooKeeperServiceRegistry;
import com.smartrpc.rpc.server.RpcServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kasimodo on 2017-09-06.
 */
@Configuration
public class ServerConfig {

    @Value("${rpc.registry_address}")
    private String zkAddress;

    @Value("${rpc.service_address}")
    private String serviceAddress;

    @Bean
    public ServiceRegistry serviceRegistry(){
        return new ZooKeeperServiceRegistry(zkAddress);
    }

    @Bean
    public RpcServer rpcServer(){
        return new RpcServer(serviceAddress,serviceRegistry());
    }
}
