package com.smartrpc.rpc.sample.client;

import com.smartrpc.rpc.client.RpcProxy;
import com.smartrpc.rpc.sample.api.HelloService;
import com.smartrpc.rpc.sample.api.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient2 {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        RpcProxy rpcProxy = context.getBean(RpcProxy.class);

        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello(new Person("gao", "shan"));
        System.out.println(result);

        System.exit(0);
    }
}
