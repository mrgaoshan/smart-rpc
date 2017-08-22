package com.smartrpc.service;

import com.smartrpc.annotation.RpcService;
import com.smartrpc.api.HelloService;

/**
 * Created by kasimodo on 2017-08-22.
 */
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "welcome,"+name;
    }
}
