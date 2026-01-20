package com.test;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class EmployeeCRUDTest {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
 
        Transaction tx = session.beginTransaction();
        EmployeePOJO emp1 = new EmployeePOJO();
        emp1.setName("Alice");
        emp1.setDepartment("HR");
        emp1.setSalary(50000);
        session.persist(emp1);
        tx.commit();
        System.out.println("Employee Created: " + emp1);
 
        
        EmployeePOJO empRead = session.get(EmployeePOJO.class, emp1.getId());
        System.out.println("Employee Read: " + empRead);
 
        
        tx = session.beginTransaction();
        empRead.setSalary(60000);
        session.merge(empRead);
        tx.commit();
        System.out.println("Employee Updated: " + empRead);
 
        
        tx = session.beginTransaction();
        session.remove(empRead);
        tx.commit();
        System.out.println("Employee Deleted: " + empRead);
 
        session.close();
        sf.close();
    }
}