package com.horemex2.test;

import com.horemex2.dao.AddressDao;
import com.horemex2.dao.BankDao;
import com.horemex2.entities.Address;
import com.horemex2.entities.Bank;

public class Hormex2Test {
	public static void main(String[] args) {
		BankDao bankDao=new BankDao();
		Bank bank = bankDao.getBank(1);
		System.out.println(bank);
		AddressDao addressDao=new AddressDao();
		Address address = addressDao.getAddress(1);
		System.out.println(address);
	}
}
