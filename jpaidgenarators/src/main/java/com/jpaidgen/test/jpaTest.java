package com.jpaidgen.test;

import com.jpaidgen.dao.BillManagementDao;
import com.jpaidgen.entities.BillManagement;

public class jpaTest {
	public static void main(String[] args) {
		BillManagement billManagement=new BillManagement();
		billManagement.setCustomerName("Basavanagoud");
		billManagement.setBillAmount(85885.25);
		BillManagementDao billManagementDao=new BillManagementDao();
		int billno=billManagementDao.saveBill(billManagement);
		System.out.println(billno);
	}
}
