package com.test;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class ConfigEmployee {
	@Bean
	public Employee getSetterObj()
	{
		return new Employee();
	}
	@Bean
	public Employee getConstObj()
	{
		return new Employee(301, "Dravid", "CSK", 4321);
	}
}
 
 