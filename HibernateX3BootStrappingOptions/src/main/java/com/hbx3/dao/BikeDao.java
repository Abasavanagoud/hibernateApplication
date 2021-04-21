package com.hbx3.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hbx3.enties.Bike;
import com.hbx3.helper.ProgrSessionFactoryRegistryImpl;
import com.hbx3.helper.PropertiSessionFactoryRegistryImpl;
import com.hbx3.helper.SessionFactoryRegistry;
import com.hbx3.helper.XmlSessionFactoryRegistryImpl;

public class BikeDao {
	public void getBikeData(int bikeNo) {
		SessionFactoryRegistry sessionFactoryRegistry = null;
		SessionFactory sessionFactory = null;
		Session session = null;

		sessionFactoryRegistry = new XmlSessionFactoryRegistryImpl();
		sessionFactory = sessionFactoryRegistry.getSessionFactory();
		session = sessionFactory.openSession();

		try {
			session = sessionFactory.openSession();
			Bike bike = session.get(Bike.class, bikeNo);
			System.out.println(bike);

		} finally {
			if (session != null) {

				session.close();
			}
		}
	}
}
