package com.test;
 
import java.util.Arrays;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class StudentDemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ct = new AnnotationConfigApplicationContext(ConfigStudent.class);
		Student obj1 = ct.getBean("getSetterObj",Student.class);
		
		obj1.setId(22);
		obj1.setName("Crazy");
		obj1.setSkills(Arrays.asList("Dance","Sing","Acting"));
		obj1.setCollege("PQR");
		
		System.out.println(obj1);
		
 
	}
 
}
