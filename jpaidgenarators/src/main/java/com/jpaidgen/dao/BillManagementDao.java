package com.jpaidgen.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpaidgen.entities.BillManagement;
import com.jpaidgen.helper.EntityManagerFactoryRegistry;

public class BillManagementDao {
	public int saveBill(BillManagement billManagement) {
		int billNo = 0;
		boolean flag = false;
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistry.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(billManagement);
			billNo = billManagement.getBillNo();
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return billNo;
	}
}
