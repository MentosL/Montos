package com.montos.service;

import com.montos.entity.Person;

public interface HelloService {

	String hello(String name);

	String hello(Person person);
}
