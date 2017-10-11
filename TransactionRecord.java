package org.files;

public class TransactionRecord {
	
	private int accountNumber;
	private double amount;
	
	
	public TransactionRecord(int accountNumber, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	
	public TransactionRecord(){
		this(0,0.0);
		
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
