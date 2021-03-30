package com.hormex1.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hormex1.entities.Account;
import com.hormex1.helper.SessionFactoryUtil;

public class InsertAccountInfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		account.setAccountNo(143143143);
		account.setAccountHolderName("mamatha a");
		account.setAccountType("saving");
		account.setMobileNO(98);
		account.setEmailId("mamatha@gmail.com");
		account.setBalance(10000);
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		Serializable save = session.save(account);
		System.out.println(save);
		beginTransaction.commit();
	}

}
