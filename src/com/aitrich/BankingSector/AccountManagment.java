package com.aitrich.BankingSector;

import java.util.HashMap;
import java.util.Map;

public class AccountManagment {
	
    Map<String , Accounts> accountMap;
	
	public AccountManagment() {
		accountMap = new HashMap<>();
	}
	
	public String generateAccountNum() {
		String accNo;
		do {
			accNo =  "ACC" + (int)(Math.random() * 10000);
		}while(accountMap.containsKey(accNo));
		return accNo;
	}
	 
	public Accounts openAccount(AccountType type , double balance) {
		String accNum = generateAccountNum();
		 Accounts a = new Accounts(accNum, type, balance);
		 accountMap.put(accNum, a);
        System.out.println("Account created successfully. \nYour account number: " + accNum);
        return a;
	}
	public Accounts getAccount(String accNum) {
		if(accountMap.containsKey(accNum)) {
		return accountMap.get(accNum);
		}
		else {
			System.out.println("No account found with account number : " + accNum);
		}
		return null;
	}
	public double getBalance(String accNum) {
		if(accountMap.containsKey(accNum)) {
		Accounts a = accountMap.get(accNum);
		return a.getBalance();
		}
		else {
			System.out.println("No account found with account number : " + accNum);
		}
		return 0;
	}
	public void closeAccount(String accNum) {
		if(accountMap.containsKey(accNum)) {
		accountMap.remove(accNum);
		System.out.println("Account closed successfully!");
		}
		else {
			System.out.println("No account found with account number : " + accNum);
		}
	}
	
}
