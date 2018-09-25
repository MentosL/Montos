package com.montos.sample.server;

import com.montos.entity.Person;
import com.montos.server.RpcService;
import com.montos.service.HelloService;

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