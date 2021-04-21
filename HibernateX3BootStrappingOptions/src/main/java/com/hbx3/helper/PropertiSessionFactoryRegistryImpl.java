package com.hbx3.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PropertiSessionFactoryRegistryImpl implements SessionFactoryRegistry{
 
	private static SessionFactory sessionfactory;
	
	static {
		Configuration configuration=new Configuration();
		configuration.addResource("com\\hbx3\\enties\\bike-hbm.xml");
		sessionfactory=configuration.buildSessionFactory();
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
