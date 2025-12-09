package com.aitrich.BankingSector;

import java.util.HashMap;
import java.util.Map;
import java.math.BigDecimal;


public class CustomerService {
	
	private Map<String,Customer>customerMap;
	
	public CustomerService() {
		customerMap=new HashMap<>();
	}
	
	public String generateCustomerId() {
		return "CUST" + (int)(Math.random())*10000;
	}
	public Customer creteCustomer(String name, String email, String phone) {
		String id = generateCustomerId();
		Customer customer = new Customer(id,name,email,phone);
		customerMap.put(id, customer);
		return customer;
	}
	public Customer getCustomer(String customerId) {
		return customerMap.get(customerId);
	 }
}