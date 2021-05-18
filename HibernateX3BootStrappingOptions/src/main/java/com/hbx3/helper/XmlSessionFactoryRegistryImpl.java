package com.hbx3.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class XmlSessionFactoryRegistryImpl implements SessionFactoryRegistry {
	private static SessionFactory sessionfactory;
	 static {
		 try {
		
	//Configuration configuration=new Configuration().configure("com\\hbx3\\dao\\hibernate.cfg.xml");
			 StandardServiceRegistryBuilder serviceRegistryBuilder=new StandardServiceRegistryBuilder();
			 serviceRegistryBuilder.configure("src\\main\\resources\\hibernate1.cfg.xml");
			 StandardServiceRegistry registry=serviceRegistryBuilder.build();
			 Configuration configuration=new Configuration().configure();
			 sessionfactory=configuration.buildSessionFactory(registry);
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
