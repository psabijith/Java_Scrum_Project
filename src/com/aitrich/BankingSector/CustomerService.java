package com.aitrich.BankingSector;

import java.util.HashMap;
import java.util.Map;

public class CustomerService {

    private Map<String, Customer> customerMap;

    public CustomerService() {
        customerMap = new HashMap<>();
    }

    public String generateCustomerId() {
        String id;
        do {
            id = "CUST" + (int) (Math.random() * 10000);
        } while (customerMap.containsKey(id));
        return id;
    }

    public Customer createCustomer(String name, String email, String phone, String address, Accounts account) {
        String id = generateCustomerId();
        Customer c = new Customer(name, id, email, phone, address, null);
        customerMap.put(id, c);
        return c;
    }

    public Customer getCustomer(String customerId) {
        return customerMap.get(customerId);
    }
}
