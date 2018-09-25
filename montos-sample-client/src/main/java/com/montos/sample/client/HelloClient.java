package com.montos.sample.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.montos.client.RpcProxy;
import com.montos.entity.Person;
import com.montos.service.HelloService;

public class HelloClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        RpcProxy rpcProxy = context.getBean(RpcProxy.class);

        HelloService helloService = rpcProxy.create(HelloService.class);
        
        Person person = new Person().setFirstName("test").setLastName("sunday");
        String result = helloService.hello(person);
        System.out.println(result);

        System.exit(0);
    }
}
