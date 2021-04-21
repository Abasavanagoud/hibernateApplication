package com.horemex2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.horemex2.entities.Bank;
import com.hormex2.helper.SessionFactoryRegistry;

public class BankDao {
	public Bank getBank(int bankno) {
		SessionFactory sessionFactory = null;
		Bank bank = null;
		Session session = null;
		try {
			/*
			 * SessionFactory sessionFactory = new
			 * Configuration().configure().buildSessionFactory(); Session session =
			 * sessionFactory.openSession();
			 */
			sessionFactory = SessionFactoryRegistry.getSessionFactroy();
			session = sessionFactory.openSession();
			bank = session.get(Bank.class, bankno);
			return bank;
		} finally {
			session.close();
		}

	}
}
