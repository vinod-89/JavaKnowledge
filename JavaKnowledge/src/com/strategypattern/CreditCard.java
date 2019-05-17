package com.strategypattern;

public class CreditCard implements PaymentStrategy , WalletStrategy{
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCard(String nm, String ccNum, String cvv, String expiryDate) {
		this.name = nm;
		this.cardNumber = ccNum;
		this.cvv = cvv;
		this.dateOfExpiry = expiryDate;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid with credit/debit card");
	}

	@Override
	public void topUpWallet(String walletNumber, int amount) {
		System.out.println(amount + " walletNumber paid with credit/debit card");
		
	}
}