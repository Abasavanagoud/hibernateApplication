package com.hbx3.test;

import com.hbx3.dao.BikeDao;
import com.hbx3.enties.Bike;
import com.hbx3.helper.ProgrSessionFactoryRegistryImpl;
import com.hbx3.helper.PropertiSessionFactoryRegistryImpl;
import com.hbx3.helper.XmlSessionFactoryRegistryImpl;


public class HibernateBootStrappingProgrammaticTest {
	public static void main(String[] args) {
		try {
		BikeDao bikeDao=new BikeDao();
		Bike bike=new Bike();
		/*
		 * bike.setBikeNo(5728); bike.setBikeModelName("Bajaj");
		 * bike.setManufacturer("BajajcompanyLimited");
		 * bike.setRtaRegistrationNumber("Ap21d5718"); bike.setPrice(85000);
		 */
		bikeDao.getBikeData(5718);
		}finally {
			new XmlSessionFactoryRegistryImpl().closeSessionFactory();
		}
		
	}
}
