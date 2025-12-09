package com.aitrich.BankingSector;

<<<<<<< HEAD
public class Accounts {

=======

public class Accounts {
	//ATTRIBUTES
	
	private String accountNumber;
	private AccountType accountType;
	private double balance;
	
	//CONSTRUCTORS
	
	public Accounts() {	}
	
	public Accounts(String accountNumber , AccountType accountType , double balance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	//GETTERS & SETTERS
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account number: " + accountNumber + ",Account type: " + accountType + ",Balance: " + balance ;
	}
	
>>>>>>> 9fc7499426b1f7c7427813fe9665d8f32687e91b
}
