package com.aitrich.BankingSector;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
import java.util.*;
>>>>>>> 5fd1c042e474f29b52dd2053b56b052c3f1143d7
import java.util.Objects;

public class TransactionService {

<<<<<<< HEAD
    private final List<Transaction> transactionList = new ArrayList<>();
    private final AccountManagment bank;   

    public TransactionService(AccountManagment bank) {
        this.bank = bank;
    }

    public String generateTransactionId() {
        return "TXN" + (int)(Math.random() * 10000);
    }

    public Transaction deposit(String accountNumber, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }

        Accounts acc = bank.getAccount(accountNumber);
        if (acc == null) {
            throw new IllegalArgumentException("Account not found: " + accountNumber);
        }

        acc.setBalance(acc.getBalance() + amount);

        Transaction txn = new Transaction(
                generateTransactionId(),
                acc,
                amount,
                "DEPOSIT"
        );
=======
    private List<Transaction> transactionList = new ArrayList<>();

    public String generateTransactionId() {
        return "TXN" + System.currentTimeMillis();
    }

    public Transaction deposit(String accountNumber, Double amount, String initiatedBy) {
        String txnId = generateTransactionId();
        String time = java.time.LocalDateTime.now().toString();

        Transaction txn = new Transaction(txnId, accountNumber, null, null,
                amount, "DEPOSIT", initiatedBy, time);
>>>>>>> 5fd1c042e474f29b52dd2053b56b052c3f1143d7

        transactionList.add(txn);
        return txn;
    }

<<<<<<< HEAD
    public Transaction withdraw(String accountNumber, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        }

        Accounts acc = bank.getAccount(accountNumber);
        if (acc == null) {
            throw new IllegalArgumentException("Account not found: " + accountNumber);
        }

        if (acc.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient balance.");
        }

        acc.setBalance(acc.getBalance() - amount);

        Transaction txn = new Transaction(
                generateTransactionId(),
                acc,
                amount,
                "WITHDRAW"
        );
=======
    public Transaction withdraw(String accountNumber, double amount, String initiatedBy) {
        String txnId = generateTransactionId();
        String time = java.time.LocalDateTime.now().toString();

        Transaction txn = new Transaction(txnId, accountNumber, null, null,
                amount, "WITHDRAW", initiatedBy, time);
>>>>>>> 5fd1c042e474f29b52dd2053b56b052c3f1143d7

        transactionList.add(txn);
        return txn;
    }

<<<<<<< HEAD
    public Transaction transfer(String fromAccNum, String toAccNum, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive.");
        }

        if (Objects.equals(fromAccNum, toAccNum)) {
            throw new IllegalArgumentException("FROM and TO account cannot be same.");
        }

        Accounts fromAcc = bank.getAccount(fromAccNum);
        Accounts toAcc   = bank.getAccount(toAccNum);

        if (fromAcc == null) {
            throw new IllegalArgumentException("FROM account not found: " + fromAccNum);
        }
        if (toAcc == null) {
            throw new IllegalArgumentException("TO account not found: " + toAccNum);
        }
        if (fromAcc.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient balance in FROM account.");
        }

        fromAcc.setBalance(fromAcc.getBalance() - amount);
        toAcc.setBalance(toAcc.getBalance() + amount);

        Transaction txn = new Transaction(
                generateTransactionId(),
                fromAcc,
                toAcc,
                amount,
                "TRANSFER"
        );
=======
    public Transaction transfer(String fromAcc, String toAcc, Double amount, String initiatedBy) {
        String txnId = generateTransactionId();
        String time = java.time.LocalDateTime.now().toString();

        Transaction txn = new Transaction(txnId, null, fromAcc, toAcc,
                amount, "TRANSFER", initiatedBy, time);
>>>>>>> 5fd1c042e474f29b52dd2053b56b052c3f1143d7

        transactionList.add(txn);
        return txn;
    }

<<<<<<< HEAD
    
    public List<Transaction> getTransactionHistory(String accountNumber) {
        List<Transaction> result = new ArrayList<>();

        for (Transaction t : transactionList) {
            boolean match = false;

            if (t.getAccount() != null &&
                Objects.equals(accountNumber, t.getAccount().getAccountNumber())) {
                match = true;
            }
            if (!match && t.getFromAccount() != null &&
                Objects.equals(accountNumber, t.getFromAccount().getAccountNumber())) {
                match = true;
            }
            if (!match && t.getToAccount() != null &&
                Objects.equals(accountNumber, t.getToAccount().getAccountNumber())) {
                match = true;
            }

            if (match) {
=======
    public List<Transaction> getTransactionHistory(String accountNumber) {

        List<Transaction> result = new ArrayList<>();

        for (Transaction t : transactionList) {
            if (Objects.equals(accountNumber, t.getAccountNumber()) ||
                Objects.equals(accountNumber, t.getFromAccount()) ||
                Objects.equals(accountNumber, t.getToAccount())) {

>>>>>>> 5fd1c042e474f29b52dd2053b56b052c3f1143d7
                result.add(t);
            }
        }

        return result;
    }
}
