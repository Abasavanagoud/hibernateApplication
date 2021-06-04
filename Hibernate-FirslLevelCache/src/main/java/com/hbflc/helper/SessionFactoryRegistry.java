package com.hbflc.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	static {
		sessionFactory=new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).buildMetadata().buildSessionFactory();
		
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public SessionFactory closeSessionFactory() {
		return sessionFactory;
	}
}
