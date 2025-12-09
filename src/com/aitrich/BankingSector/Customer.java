package com.aitrich.BankingSector;

public class Customer {
    private String name;
    private String customerId;
    private String email;
    private String phone;
    private String address;
    private Account account;
    public Customer(String name, String customerId, String email, String phone, String address, Account account) {
        this.name = name;
        this.customerId = customerId;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.account=account;
    }
    public Customer() {
    	
    }
    
    public String getName() {
    	return name;
    }
    public String getCustomerId() {
    	return customerId;
    }
    public String getEmail() {
    	return email;
    }
    public String getPhone() {
    	return phone;
    }
    public String getAddress() {
    	return address;
    }
    public void setAccount(Account account) {
    	this.account = account;
    }

    @Override
    public String toString() {
        return name + ", " + customerId + ", " + email + ", " + phone + ", " + address + "," + account;
    }
}
