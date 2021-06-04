package com.idgenarators.test;

import com.idgenarators.dao.OutletDao;
import com.idgenarators.entities.Outlet;

public class IDGenTest {
	public static void main(String[] args) {
		Outlet outlet=new Outlet();
		outlet.setOutletName("KanthaReddyA");
		outlet.setOutletDescription("We are priovided service jcbs");
		outlet.setLocation("Bapuram");
		outlet.setContactNo("9603496047");
		OutletDao outletDao=new OutletDao();
		int outletNo=outletDao.saveOutlet(outlet);
		System.out.println("OutletNo:\t"+outletNo);
	}
}
