package com.eviro.assessment.grad001.MusalafuMashudu;

import java.math.BigDecimal;

public class SavingAccount {
	
	private int UserID;
	private int AccNo;
	private  String UserName;
	private BigDecimal Balance;
	
	
	// constructor
	
	public SavingAccount() {
	
	}

	//Overloading Constructor 
	public SavingAccount(int AccNo,int UserID,String UserName,BigDecimal Balance) {
		this.AccNo = AccNo;
		this.UserID = UserID;
		this.UserName = UserName;
		this.Balance = Balance;
	}

	// return UserID
	 
	public int getUserID() {
		return UserID;
	}

	// return Account No
	 
	public int getAccNo() {
		return AccNo;
	}

	// return User name
	 
	public String getUserName() {
		return UserName;
	}

	
	// return Balance
	 
	public BigDecimal getBalance() {
		return Balance;
	}

	
	

}
