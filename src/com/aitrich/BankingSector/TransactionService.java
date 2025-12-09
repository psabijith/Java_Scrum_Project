package com.aitrich.BankingSector;

import java.util.*;
import java.util.Objects;

public class TransactionService {

    private List<Transaction> transactionList = new ArrayList<>();

    public String generateTransactionId() {
        return "TXN" + System.currentTimeMillis();
    }

    public Transaction deposit(String accountNumber, Double amount, String initiatedBy) {
        String txnId = generateTransactionId();
        String time = java.time.LocalDateTime.now().toString();

        Transaction txn = new Transaction(txnId, accountNumber, null, null,
                amount, "DEPOSIT", initiatedBy, time);

        transactionList.add(txn);
        return txn;
    }

    public Transaction withdraw(String accountNumber, double amount, String initiatedBy) {
        String txnId = generateTransactionId();
        String time = java.time.LocalDateTime.now().toString();

        Transaction txn = new Transaction(txnId, accountNumber, null, null,
                amount, "WITHDRAW", initiatedBy, time);

        transactionList.add(txn);
        return txn;
    }

    public Transaction transfer(String fromAcc, String toAcc, Double amount, String initiatedBy) {
        String txnId = generateTransactionId();
        String time = java.time.LocalDateTime.now().toString();

        Transaction txn = new Transaction(txnId, null, fromAcc, toAcc,
                amount, "TRANSFER", initiatedBy, time);

        transactionList.add(txn);
        return txn;
    }

    public List<Transaction> getTransactionHistory(String accountNumber) {

        List<Transaction> result = new ArrayList<>();

        for (Transaction t : transactionList) {
            if (Objects.equals(accountNumber, t.getAccountNumber()) ||
                Objects.equals(accountNumber, t.getFromAccount()) ||
                Objects.equals(accountNumber, t.getToAccount())) {

                result.add(t);
            }
        }

        return result;
    }
}
