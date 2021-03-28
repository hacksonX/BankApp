package com.eviro.assessment.grad001.MusalafuMashudu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class SystemDB {

	
	public List<SavingAccount> saveAccount(SavingAccount saving){
		
		ArrayList<SavingAccount> AccN01 = new ArrayList<SavingAccount>();
		
		SavingAccount S1  = new SavingAccount(1,101,"User1",new BigDecimal(2000));
		SavingAccount S2  = new SavingAccount(2,102,"User2",new BigDecimal(5000));
		
		
		if(S1.getAccountNum() > 0 ) {
			
			AccN01.add(0, S1);
		}
		if(S2.getAccountNum() > 0)
		{
			AccN01.add(1, S2);
		}
	
		
		return AccN01;
		
	}
	
	
	
   public List<CurrentAccount> currentAccount(CurrentAccount current){
		
		ArrayList<CurrentAccount> AccN01 = new ArrayList<CurrentAccount>();
		
		CurrentAccount Curr1  = new CurrentAccount(3,103,"User3",new BigDecimal(5000),new BigDecimal(10000));
		CurrentAccount Curr2 = new CurrentAccount(4,104,"User4",new BigDecimal(-5000),new BigDecimal(20000));
	
		
        if(Curr1.getAccountNum() > 0 ) {
			
			AccN01.add(0, Curr1);
		}
		if(Curr2.getAccountNum() > 0)
		{
			AccN01.add(1, Curr2);
		}
		
		return AccN01;
		
	}



}
	
	
	
	
	

