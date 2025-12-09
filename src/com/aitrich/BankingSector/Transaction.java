package com.aitrich.BankingSector;

public class Transaction {

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
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.type = type;
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
}
