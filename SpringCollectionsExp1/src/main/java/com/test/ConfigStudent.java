package com.test;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
 
import java.util.*;
@Configuration
public class ConfigStudent {
	@Bean
	@Scope(scopeName = "singleton")
	public Student getSetterObj()
	{
		return new Student();
	}
	@Bean
	@Scope(scopeName = "prototype")
	public Student getConstObj()
	{
		List<String> skills = Arrays.asList("java","php","smart","framework");
		return new Student(111,"Rohit",skills,"Mumbai");
	}
}