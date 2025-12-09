package com.aitrich.BankingSector;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        CustomerService service = new CustomerService();

        Customer req = new Customer(
                "Akshay", "A01", "akshay@gmail.com", "1234567890", "Thrissur"
        );

        Customer c = service.createCustomerWithAccount(req, AccountType.SAVINGS, new BigDecimal("10000"));
        System.out.println(c);
    }
}
