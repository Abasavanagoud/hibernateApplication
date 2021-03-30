package com.hormex1.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	public static SessionFactory instance;
	private SessionFactoryUtil() {
		//instance=new SessionFactoryUtil();
	}
	
	public static SessionFactory getSessionFactory() {
		Configuration configuration=new Configuration().configure();
		instance=configuration.buildSessionFactory();
		return instance;
	}
	
}
