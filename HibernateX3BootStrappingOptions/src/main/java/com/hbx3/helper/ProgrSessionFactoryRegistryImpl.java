package com.hbx3.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgrSessionFactoryRegistryImpl implements SessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	static {
		Configuration configuration=new Configuration();
		configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/vogodb");
		configuration.setProperty("hibernate.connection.username", "root");
		configuration.setProperty("hibernate.connection.password", "root");
		configuration.setProperty("hibernate.connection.show_sql", "true");
		configuration.setProperty("hibernate.transaction.coordinator_class", "jdbc");
		configuration.setProperty("hibernate.show_sql", "true");
		configuration.setProperty("hibernate.format_sql", "true");
		configuration.addResource("com\\hbx3\\enties\\bike-hbm.xml");
		sessionFactory=configuration.buildSessionFactory();
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public  void closeSessionFactory() {
		sessionFactory.close();
	}
}
