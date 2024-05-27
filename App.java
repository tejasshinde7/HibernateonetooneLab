package com.example.Hibernateonetoone2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
      		Session session = sessionFactory.openSession();
      		session.beginTransaction();
      		try 
      		{
      		  Person person=new Person();
      		  person.setCont("aa");
      		  person.setEmail("shsh@gami.com");
      		//  person.setPid(12);
      		  person.setPname("Tejas");

      		  Adhaar adhaar=new Adhaar();
      		 adhaar.setAid(12);
      		 adhaar.setName("tejass");
      		// adhaar.setSrNo(10);
      		 
      		person.setAdhaar(adhaar);
      		adhaar.setPerson(person);
      		 
      		  session.save(person);
      		  session.getTransaction().commit();

      		  Person retrievedUser=session.get(Person.class, person.getPid());
      		  Adhaar retrievedAddress=retrievedUser.getAdhaar();

      		  System.out.println("User: "+retrievedUser.getPname());
      		  System.out.println("Address: "+retrievedAddress.getName());
      		}
      		finally 
      		{
      			session.close();
                  sessionFactory.close();
      		}
    }
}
