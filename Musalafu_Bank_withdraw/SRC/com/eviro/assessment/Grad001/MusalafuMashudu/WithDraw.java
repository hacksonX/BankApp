package com.eviro.assessment.grad001.MusalafuMashudu;

import java.math.BigDecimal;

public class WithDraw implements AccountService {

	SystemSDB SDB;
	SavingAccount SavingAcc;
	CurrentAccountCurrentAcc;

	@Override
	public void withdraw(StringAccNo, BigDecimal amountToWithdraw)
			throws AccountNotFoundException, WithdrawalAmountTooLargeException {
        
		
		SDB = new SystemSDB();
		
		
		int convertToInt = Integer.parseInt(accountNum);
		
		
		SavingAcc = new SavingAccount();
		ca = new CurrentAccount();
		
		
		if (convertToInt == SDB.saveAccount(SavingAcc).get(0).getAccountNum()) {
           
			
			BigDecimal balance = SDB.saveAccount(SavingAcc).get(0).getBalance();
			 
			BigDecimal remainingBalance = balance.subtract(amountToWithdraw);
			
			
			BigDecimal MIN_AMOUNT = new BigDecimal(1000);

			
			if (remainingBalance.compareTo(MIN_AMOUNT) >= 0) {

				System.out.println("Succefully withdraw : " + amountToWithdraw);

				
				
				System.out.println("Current Balance : " + remainingBalance + "\n" + "Account Number : "
						+ SDB.saveAccount(SavingAcc).get(0).getAccountNum() + "\n" + "Acount ID :"
						+ SDB.saveAccount(SavingAcc).get(0).getId());
			} else {
			
				throw new WithdrawalAmountTooLargeException(
						"The amount of " + amountToWithdraw + " is too large , try a less amount.");
			}
			
			
		} else if (convertToInt == SDB.saveAccount(SavingAcc).get(1).getAccountNum()) {
            
			/
			BigDecimal balance = SDB.saveAccount(SavingAcc).get(1).getBalance();
			
			BigDecimal remainingBalance = balance.subtract(amountToWithdraw);
			
			BigDecimal MIN_AMOUNT = new BigDecimal(1000);
            
			
			if (remainingBalance.compareTo(MIN_AMOUNT) >= 0) {

				System.out.println(" Succefully withdraw : " + amountToWithdraw);
               
				
				System.out.println("Current Balance : " + remainingBalance + "\n" + "Account Number : "
						+ SDB.saveAccount(SavingAcc).get(1).getAccountNum() + "\n" + "Acount ID :"
						+ SDB.saveAccount(SavingAcc).get(1).getId());
			} else {
				throw new WithdrawalAmountTooLargeException(
						"The amount of " + amountToWithdraw + " is too large , try a less amount.");
			}

		} else if (convertToInt == SDB.currentAccount(ca).get(0).getAccountNum()) {

			
			BigDecimal balance = (SDB.currentAccount(ca).get(0).getBalance())
					.add(SDB.currentAccount(ca).get(0).getOverdraft());
			
			BigDecimal remainingBalance = balance.subtract(amountToWithdraw);

			
			if (balance.compareTo(amountToWithdraw) >= 0) {

				System.out.println(" Succefully withdraw : " + amountToWithdraw);
                
				
				System.out.println("Current Balance : " + remainingBalance + "\n" + "Your Overdraft balance is :"
						+ SDB.currentAccount(ca).get(0).getOverdraft() + "\n" + "Account Number : "
						+ SDB.currentAccount(ca).get(0).getAccountNum() + "\n" + "Acount ID :"
						+ SDB.currentAccount(ca).get(0).getId());
			} else {

				throw new WithdrawalAmountTooLargeException(
						"The amount of " + amountToWithdraw + " is too large , try a less amount.");
			}

		} else if (convertToInt == SDB.currentAccount(ca).get(1).getAccountNum()) {

			
			BigDecimal balance = (SDB.currentAccount(ca).get(1).getBalance())
					.add(SDB.currentAccount(ca).get(1).getOverdraft());
			
			
			BigDecimal remainingBalance = balance.subtract(amountToWithdraw);

			
			if (balance.compareTo(amountToWithdraw) >= 0) {

				System.out.println(" Succefully withdraw : " + amountToWithdraw);
                
				
				System.out.println("Current Balance : " + remainingBalance + "\n" + "Your Overdraft balance is :"
						+ SDB.currentAccount(ca).get(1).getOverdraft() + "\n" + "Account Number : "
						+ SDB.currentAccount(ca).get(1).getAccountNum() + "\n" + "Acount ID :"
						+ SDB.currentAccount(ca).get(1).getId());
			} else {

				throw new WithdrawalAmountTooLargeException(
						"The amount of " + amountToWithdraw + " is too large , try a less amount.");
			}

		} else {

			
			throw new AccountNotFoundException("Account Not found  " + convertToInt + ".");
		}

	}
	
}
	

		

