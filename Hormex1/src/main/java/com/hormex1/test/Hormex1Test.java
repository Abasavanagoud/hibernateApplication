package com.hormex1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hormex1.entities.Account;

public class Hormex1Test {
	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Account account=session.get(Account.class, 143143);
		System.out.println(account);
	}
}
