package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//we should use get when we r not sure that data exist in db.If sure then use load()
public class Main1 {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		
		Author a1=new Author("jack", "pravakarky@gmail.com");
		Book b1=new Book("java book","java",a1);
		session.save(b1);
		
		/*Author a1=new Author("ram","r@gmail.com");
		Book b1=new Book("c book","c",a1);
		session.save(b1);
		
		Author a2=new Author("mohan","m@gmail.com");
		Book b2=new Book("pascal book","pascal",a2);
		session.save(b2);
		*/
		
	/*	Book b1=session.get(Book.class, 3);
		System.out.println(b1.getAuthor());
		System.out.println(b1.getAuthor().name);
		*/
		
		
		
		
		
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
		
	}

}

