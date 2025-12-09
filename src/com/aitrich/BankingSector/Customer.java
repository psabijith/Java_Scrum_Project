package com.aitrich.BankingSector;

public class Customer {
<<<<<<< HEAD

}
=======
    private String name;
    private String customerId;
    private String email;
    private String phone;
    private String address;
<<<<<<< HEAD
    private Accounts account;
    public Customer(String name, String customerId, String email, String phone, String address, Accounts account) {
=======
    private Account account;
    public Customer(String name, String customerId, String email, String phone, String address, Account account) {
>>>>>>> afad0b852aeb26b18562dc1b18d9f4471487cf90
        this.name = name;
        this.customerId = customerId;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.account=account;
    }
    public Customer() {
<<<<<<< HEAD
        
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
    public void setAccount(Accounts account) {
        this.account = account;
=======
    	
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
>>>>>>> afad0b852aeb26b18562dc1b18d9f4471487cf90
    }

    @Override
    public String toString() {
        return name + ", " + customerId + ", " + email + ", " + phone + ", " + address + "," + account;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> afad0b852aeb26b18562dc1b18d9f4471487cf90
>>>>>>> 9fc7499426b1f7c7427813fe9665d8f32687e91b
