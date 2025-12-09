package com.aitrich.BankingSector;

public class Transaction {

<<<<<<< HEAD
    private String transactionId;
    private Accounts account;      
    private Accounts fromAccount;  
    private Accounts toAccount;   
    private double amount;
    private String type;

    
    public Transaction(String transactionId,
                       Accounts account,
                       double amount,
                       String type) {

        this.transactionId = transactionId;
        this.account = account;
        this.amount = amount;
        this.type = type;
    }

    
    public Transaction(String transactionId,
                       Accounts fromAccount,
                       Accounts toAccount,
                       double amount,
                       String type) {

        this.transactionId = transactionId;
=======
<<<<<<< HEAD
    private String transactionId;
    private String accountNumber;
    private String fromAccount;
    private String toAccount;
    private double amount;
    private String type;
    private String initiatedBy;
    private String timestamp;

    public Transaction(String transactionId, String accountNumber,
                       String fromAccount, String toAccount,
                       double amount, String type, String initiatedBy, String timestamp) {

        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
>>>>>>> 5fd1c042e474f29b52dd2053b56b052c3f1143d7
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.type = type;
<<<<<<< HEAD
    }

    public String getTransactionId() { return transactionId; }
    public Accounts getAccount() { return account; }
    public Accounts getFromAccount() { return fromAccount; }
    public Accounts getToAccount() { return toAccount; }
    public double getAmount() { return amount; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + transactionId + '\'' +
                ", type='" + type + '\'' +
                ", account=" + (account != null ? account.getAccountNumber() : "null") +
                ", fromAccount=" + (fromAccount != null ? fromAccount.getAccountNumber() : "null") +
                ", toAccount=" + (toAccount != null ? toAccount.getAccountNumber() : "null") +
                ", amount=" + amount +
                '}';
    }
=======
        this.initiatedBy = initiatedBy;
        this.timestamp = timestamp;
    }

    public String getTransactionId() { return transactionId; }
    public String getAccountNumber() { return accountNumber; }
    public String getFromAccount() { return fromAccount; }
    public String getToAccount() { return toAccount; }
    public double getAmount() { return amount; }
    public String getType() { return type; }
    public String getInitiatedBy() { return initiatedBy; }
    public String getTimestamp() { return timestamp; }
=======
>>>>>>> 9fc7499426b1f7c7427813fe9665d8f32687e91b
>>>>>>> 5fd1c042e474f29b52dd2053b56b052c3f1143d7
}
