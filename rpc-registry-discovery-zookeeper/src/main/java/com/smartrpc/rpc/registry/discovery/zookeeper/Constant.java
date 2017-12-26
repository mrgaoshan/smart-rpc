package com.smartrpc.rpc.registry.discovery.zookeeper;

/**
 * 常量
 *
 * @author gao shan
 * @since 1.0.0
 */
public interface Constant {

    int ZK_SESSION_TIMEOUT = 500000; //500秒
    int ZK_CONNECTION_TIMEOUT = 1000000;//1000秒

    String ZK_REGISTRY_PATH = "/registry";
}