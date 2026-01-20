package com.test.spring.model;

import com.test.spring.aspect.loggable;

public class Employee {
	private String name;

	public String getName() {
		return name;
	}
	
	@loggable
	public void setName(String name) {
		this.name = name;
	}
	
	public void throwException()
	{
		throw new RuntimeException("MLA Exception");
	}
}
