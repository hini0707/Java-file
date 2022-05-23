package com.nandhini.JFS_REACT;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Configuration configuration = new Configuration();
      configuration.configure();
      configuration.addAnnotatedClass(UserDetails.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
    	
       UserDetails user = new UserDetails();
       user.setName("swapna");
       user.setUserId(2234);
       session.beginTransaction();
       session.save(user);
       session.getTransaction().commit();
       
       
    }
}
