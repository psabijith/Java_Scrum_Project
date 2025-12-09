package com.aitrich.BankingSector;

public class Transaction {

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
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.type = type;
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
}
