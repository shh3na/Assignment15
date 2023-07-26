package com.velocity.ass15;

public class SavingAccount extends Account {

	 static int WithdrawAmount;
	
	
	public void getAccountDetails (int WithdrawAmount) {
		getWithdrawDetails(this);
		this.WithdrawAmount=WithdrawAmount;
	}
	
	public static int getWithdrawDetails(Account account) {
		System.out.println("[id : " +(account.id=53464) +"Account Number : " +(account.acccountNumber=323554544)+" Balance : "+(account.balance=5000) +"]");
		return WithdrawAmount;
			
	}
	
	public static void main(String[] args) {
		
		
		SavingAccount s = new SavingAccount();
		s.getAccountDetails(5000);
		System.out.println("Withdraw Amount Is : " +WithdrawAmount +" Rs");
		System.out.println("Withdraw Amount Is recieved");
		
	}
	
}
