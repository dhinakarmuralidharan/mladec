package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class NamedQueryTest {
	public static void main(String[] args)
	{
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createNamedQuery("customQuery");
	    query.setParameter("name", "Spring Notes");
	    List<Book> books = query.getResultList();
	    System.out.println("Named Query Result");
	    System.out.println(books);
	    session.close();
	    
}
}

