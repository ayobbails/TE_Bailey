package com.techelevator;

/**
 * CreditCardAccount
 */
public class CreditCardAccount implements Accountable {

	private String accountHolder;
	private String accountNumber;
	private int debt = 0;
	
	public CreditCardAccount(String accountHolder, String accountNumber) {	
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getDebt() {
		return debt;
	}

	public int pay(int amountToPay) {
		debt = debt - amountToPay;
		return debt;
	}
	public int charge(int amountToCharge) {
		debt += amountToCharge;
		return debt;
	}

	public int getBalance() {
		//***************************************************************
		// This should return the negative of the debt data member
		//***************************************************************
		return -debt;
	}


}