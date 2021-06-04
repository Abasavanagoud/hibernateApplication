package com.jpaidgen.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistry {
	private static EntityManagerFactory entityManagerFactory;
	static {
		entityManagerFactory=Persistence.createEntityManagerFactory("vogodb");
	}
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	public void closeEntityManagerFactory() {
		entityManagerFactory.close();
	}
}
