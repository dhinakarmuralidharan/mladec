package com.test;
 
import java.util.List;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class EmpDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao empdao = ctx.getBean("edao", EmployeeDao.class);
		
		  Employee emp = new Employee();
		  emp.setE_name("Tjay");
		  emp.setE_cmp("BCCI");
		  emp.setE_city("Mlyapore");
		  empdao.insertEmployee(emp);
		  //empdao.createEmployee(emp);
		  
		  Employee emp1=new
		  Employee(1,"Sharma","IPL","HYD");
		  
//		  empdao.updateEmployee(emp1);
//		  empdao.deleteEmployee(emp1);
		  
		  System.out.println("Employee data updated");
		
		
//		List<Employee> empdata = empdao.getAllEmployees();
//		empdata.forEach(System.out::println);
	}
 
}
 
