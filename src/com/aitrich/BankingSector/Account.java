package com.aitrich.BankingSector;

import java.math.BigDecimal;

public class Account {
	private AccountType type;
	private BigDecimal balance;
	
	public Account(AccountType type, BigDecimal balance) {
		
		this.type = type;
		this.balance = balance;		
	}

@Override
public String toString() {
	return type + "Account - Balance: ₹" + balance;
	
}
}
