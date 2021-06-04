package com.idgenarators.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	static {
		/*
		 * sessionFactory=new MetadataSources(new
		 * StandardServiceRegistryBuilder().configure().build()).buildMetadata().
		 * buildSessionFactory();
		 */
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void closeSessionFactory() {
		sessionFactory.close();
	}
}
