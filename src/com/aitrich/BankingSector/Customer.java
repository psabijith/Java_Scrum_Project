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
    private Accounts account;
    public Customer(String name, String customerId, String email, String phone, String address, Accounts account) {
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
    public void setAccount(Accounts account) {
    	this.account = account;
    }

    @Override
    public String toString() {
        return name + ", " + customerId + ", " + email + ", " + phone + ", " + address + "," + account;
    }
}
<<<<<<< HEAD

=======
=======
}
>>>>>>> afad0b852aeb26b18562dc1b18d9f4471487cf90
>>>>>>> 9fc7499426b1f7c7427813fe9665d8f32687e91b
>>>>>>> 5fd1c042e474f29b52dd2053b56b052c3f1143d7
