package com.test;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class CustDemo {
 
	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("beans.xml");
		Customer c = ct.getBean("cst1",Customer.class);
		System.out.println(c);
	}
 
}
