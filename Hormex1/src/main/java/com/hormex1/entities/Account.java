package com.hormex1.entities;

public class Account {
 protected int accountNo;
 protected String accountHolderName;
 protected String accountType;
 protected long mobileNO;
 protected String emailId;
 protected double balance;
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public long getMobileNO() {
	return mobileNO;
}
public void setMobileNO(long mobileNO) {
	this.mobileNO = mobileNO;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
			+ accountType + ", mobileNO=" + mobileNO + ", emailId=" + emailId + ", balance=" + balance + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((accountHolderName == null) ? 0 : accountHolderName.hashCode());
	result = prime * result + accountNo;
	result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
	long temp;
	temp = Double.doubleToLongBits(balance);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
	result = prime * result + (int) (mobileNO ^ (mobileNO >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Account other = (Account) obj;
	if (accountHolderName == null) {
		if (other.accountHolderName != null)
			return false;
	} else if (!accountHolderName.equals(other.accountHolderName))
		return false;
	if (accountNo != other.accountNo)
		return false;
	if (accountType == null) {
		if (other.accountType != null)
			return false;
	} else if (!accountType.equals(other.accountType))
		return false;
	if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
		return false;
	if (emailId == null) {
		if (other.emailId != null)
			return false;
	} else if (!emailId.equals(other.emailId))
		return false;
	if (mobileNO != other.mobileNO)
		return false;
	return true;
}
 
 
}
