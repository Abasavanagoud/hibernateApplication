package com.horemex2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.horemex2.entities.Bank;

public class BankDao {
	public Bank getBank(int bankno) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Bank bank = session.get(Bank.class, bankno);
		return bank;
		
	}
}
