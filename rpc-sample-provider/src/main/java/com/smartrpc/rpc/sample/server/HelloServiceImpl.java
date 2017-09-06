package com.smartrpc.rpc.sample.server;


import com.smartrpc.rpc.sample.api.HelloService;
import com.smartrpc.rpc.sample.api.Person;
import com.smartrpc.rpc.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

    @Override
    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
