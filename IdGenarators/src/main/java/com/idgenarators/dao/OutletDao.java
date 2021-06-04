package com.idgenarators.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.idgenarators.entities.Outlet;
import com.idgenarators.helper.SessionFactoryRegistry;

public class OutletDao {
	public int saveOutlet(Outlet obOutlet) {
		int outletNo=0;
		boolean flag=false;
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			outletNo= (int) session.save(obOutlet);
			flag=true;
		} finally {
			if (transaction !=null) {
				if (flag) {
					transaction.commit();
				}else {
					transaction.commit();
				}
			}
			if (session!=null) {
				session.close();
			}
		}
		
		return outletNo;
	}
}
