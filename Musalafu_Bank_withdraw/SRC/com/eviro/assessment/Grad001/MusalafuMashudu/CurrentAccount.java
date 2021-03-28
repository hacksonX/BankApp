package com.eviro.assessment.grad001.MusalafuMashudu;

import java.math.BigDecimal;

public class CurrentAccount {

	private int UseID;
	private  BigDecimal balance;
	private BigDecimal overdraft ;
	private  int AccNo;
	private String UserName;
	
	

	//overloading constructor
	public CurrentAccount(int AccNo,int UseID,String UserName,BigDecimal balance,BigDecimal overdraft) {
		this.AccNo = AccNo;
		this.UseID = UseID;
		this.UserName = UserName;
		this.overdraft = overdraft;
		this.balance = balance;
		
	}
	

	
	//Return ID
	public int getUseID() {
		return UseID;
	}
	
	//Return Name
	public String getUserName() {
		return UserName;
	}
	//Return Account
	public int getAccNo() {
		return AccNo;
	}

	//constructor 
	public CurrentAccount() {
		
	
	}

	//Return Balance
	public BigDecimal getBalance() {
		return balance;
	}

	//Return overdraft
	public BigDecimal getOverdraft() {
		return overdraft;
	}
}
