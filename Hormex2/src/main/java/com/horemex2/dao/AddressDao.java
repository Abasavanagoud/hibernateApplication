package com.horemex2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.horemex2.entities.Address;
import com.hormex2.helper.SessionFactoryRegistry;

public class AddressDao {
	public Address getAddress(int addressNO) {
		Address address=null;
		SessionFactory sessionFactory=null;
		
		//Session session = new Configuration().configure().buildSessionFactory().openSession();
			sessionFactory=SessionFactoryRegistry.getSessionFactroy();
			Session session = sessionFactory.openSession();
		address=session.get(Address.class, 1);
		
		return address;
		
	}
}
