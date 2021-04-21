package com.hbx3.helper;

import org.hibernate.SessionFactory;

public interface SessionFactoryRegistry {
	SessionFactory getSessionFactory();
	void closeSessionFactory();
}
