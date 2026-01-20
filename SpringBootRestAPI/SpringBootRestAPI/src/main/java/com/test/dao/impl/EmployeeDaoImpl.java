package com.test.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.test.dao.EmployeeDao;
import com.test.model.Employee;
import com.test.model.Employees;

@Service
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	private static Employees empData = new Employees();
	static {
		empData.getEmpList().add(new Employee(1, "Rohit", "Dell"));
		empData.getEmpList().add(new Employee(2, "Kohli", "E Y"));
		empData.getEmpList().add(new Employee(3, "Rahul", "PWC"));
		empData.getEmpList().add(new Employee(4, "SKY", "INDIA"));
		empData.getEmpList().add(new Employee(5, "Jaiswal", "IPT"));
	}

	@Override
	public Employee addEmployee(Employee emp) {
		empData.getEmpList().add(emp);
		
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		for(int i=0;i<empData.getEmpList().size();i++)
		{
			Employee obj = empData.getEmpList().get(i);
			if(obj.getId()==(emp.getId()))
			{
				empData.getEmpList().set(i, emp);
			}
		}
		return emp;
	}

	@Override
	public List<Employee> deleteEmployee(int id) {
		
		for(int i=0;i<empData.getEmpList().size();i++)
		{
			Employee emp = empData.getEmpList().get(i);
			if(emp.getId()==(id))
			{
				empData.getEmpList().remove(i);
			}
		}
		return empData.getEmpList();
	}

	@Override
	public List<Employee> getALLEmployees() {
		
		return empData.getEmpList();
	}
	
	
	

}
