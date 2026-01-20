package com.test.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
 
@Aspect
public class EmployeeAroundAspect {
	@Around("excecution(*com.test.spring.model.Employee.getName())")
public Object employeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
{
	 System.out.println("Before executing getName() method");
	 Object value=null;
	 try {
		 value=proceedingJoinPoint.proceed();
	 }
	 catch (Throwable e) {
		e.printStackTrace();
	}
	 System.out.println("After executing getName() method");
	 return value;
	
}
}