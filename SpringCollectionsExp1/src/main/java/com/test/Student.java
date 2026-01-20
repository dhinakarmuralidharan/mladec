package com.test;
 
import java.util.*;
 
public class Student {
	private int id;
	private String name;
	private List<String> skills;
	private String college;
	public Student()
	{
		
	}
	public Student(int id, String name, List<String> skills, String college) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.college = college;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", skills=" + skills + ", college=" + college + "]";
	}
	
}