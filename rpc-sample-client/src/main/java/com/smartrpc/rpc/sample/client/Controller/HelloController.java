package com.smartrpc.rpc.sample.client.Controller;

import com.smartrpc.rpc.client.RpcProxy;
import com.smartrpc.rpc.sample.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kasimodo on 2017-09-06.
 */
@RestController
public class HelloController {

    @Autowired
    private RpcProxy rpcProxy;


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello("gao shan");
        return result;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2() {
        HelloService helloService2 = rpcProxy.create(HelloService.class, "sample.hello2");
        String result2 = helloService2.hello("hahahah");
        return result2;
    }
}
