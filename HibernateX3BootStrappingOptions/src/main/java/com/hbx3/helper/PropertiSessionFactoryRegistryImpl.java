package com.hbx3.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistry;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class PropertiSessionFactoryRegistryImpl implements SessionFactoryRegistry{
 
	private static SessionFactory sessionfactory;
	
	static {
		BootstrapServiceRegistryBuilder bSRB=new BootstrapServiceRegistryBuilder();
		BootstrapServiceRegistry bSR=bSRB.build();
		StandardServiceRegistryBuilder sSRB=new StandardServiceRegistryBuilder(bSR);
		sSRB.loadProperties("hibernate.properties");
		StandardServiceRegistry sSR=sSRB.build();
		Configuration configuration=new Configuration();
		configuration.addResource("src\\main\\java\\com\\hbx3\\enties\\bike-hbm.xml");
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
