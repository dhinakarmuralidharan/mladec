package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@ComponentScan(basePackages = "com.test")
public class TestDemo {

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		User obj = ctx.getBean("user", User.class);
		System.out.println(obj);
		
	}
}
