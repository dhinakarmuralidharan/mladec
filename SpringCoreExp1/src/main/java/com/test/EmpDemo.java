package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {
		public static void main(String[] args)
		{
			BeanFactory bn = new ClassPathXmlApplicationContext("beans.xml");
			Employee obj1 = (Employee)bn.getBean("emp");
			System.out.println(obj1);
			System.out.println("Constructor Data");
			Employee obj2 = bn.getBean("emp1", Employee.class);
			System.out.println(obj2);
		}
		}
