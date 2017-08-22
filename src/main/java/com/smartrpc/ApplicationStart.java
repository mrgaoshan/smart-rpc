package com.smartrpc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kasimodo on 2017-08-22.
 */
public class ApplicationStart {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring.xml");
    }
}
