package com.smartrpc.rpc.sample.client.config;

import com.smartrpc.rpc.client.RpcProxy;
import com.smartrpc.rpc.registry.discovery.ServiceDiscovery;
import com.smartrpc.rpc.registry.discovery.zookeeper.ZooKeeperServiceDiscovery;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kasimodo on 2017-09-06.
 */
@Configuration
public class ClientConfig {

    @Value("${rpc.registry_address}")
    private String zkAddress;


    @Bean
    public ServiceDiscovery serviceDiscovery() {
        return new ZooKeeperServiceDiscovery(zkAddress);
    }

    @Bean
    public RpcProxy rpcProxy() {
        return new RpcProxy(serviceDiscovery());
    }
}
