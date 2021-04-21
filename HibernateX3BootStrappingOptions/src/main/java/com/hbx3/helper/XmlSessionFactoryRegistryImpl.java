package com.hbx3.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XmlSessionFactoryRegistryImpl implements SessionFactoryRegistry {
	private static SessionFactory sessionfactory;
	 static {
		 try {
		 Configuration configuration=new Configuration().configure("com\\hbx3\\dao\\hibernate.cfg.xml");
		 sessionfactory=configuration.buildSessionFactory();
		 }catch (Throwable e) {
			 e.printStackTrace();
		 }
	 }
	@Override
	public SessionFactory getSessionFactory() {
		return sessionfactory;
	}

	@Override
	public void closeSessionFactory() {
		sessionfactory.close();
	}

}
