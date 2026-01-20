package com.test;
 
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class DemoMain {
 
	public static void main(String[] args) {
		BeanFactory bn = new ClassPathXmlApplicationContext("beans.xml");
 
		Student obj = (Student)bn.getBean("stu");
		System.out.println(obj);
 
		
		System.out.println("Constructor Data");
 
		Student ob2 = bn.getBean("stu",Student.class);
		System.out.println(ob2);
	}
 
}