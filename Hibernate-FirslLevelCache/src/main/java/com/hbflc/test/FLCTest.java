package com.hbflc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hbflc.entities.ProductCategory;
import com.hbflc.helper.SessionFactoryRegistry;

public class FLCTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session=null;
		 try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			ProductCategory prCategory=session.get(ProductCategory.class, 1);
			ProductCategory prCategory2=session.get(ProductCategory.class, 1);
			System.out.print("prCategory == prCategory2 ? ");
			System.out.println(prCategory==prCategory2);			
			session.close();
			 System.out.println("isSessionOpened()"+session.isOpen());
			session = sessionFactory.openSession();
			ProductCategory pCategory3=session.get(ProductCategory.class, 1);
			//session.close();
			 System.out.println("isSessionOpened()"+session.isOpen());
			 session.clear();
			 ProductCategory pCategory4=session.get(ProductCategory.class, 1);
			System.out.println("category1 ==category 3 ?"+ " "+(prCategory==pCategory3));
			
		} finally {
			if (session !=null) {
				session.close();
			}
		}
		
	}
}
