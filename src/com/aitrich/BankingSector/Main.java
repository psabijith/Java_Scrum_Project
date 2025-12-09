package com.aitrich.BankingSector;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        TransactionService service = new TransactionService();

        // ----- TESTING DEPOSIT -----
        service.deposit("ACC1001", 5000.0, "John");

        // ----- TESTING WITHDRAW -----
        service.withdraw("ACC1001", 2000.0, "John");

        // ----- TESTING TRANSFER -----
        service.transfer("ACC1001", "ACC2002", 1500.0, "John");

        // ----- TEST: HISTORY FOR ACC1001 -----
        System.out.println("---- Transaction History for ACC1001 ----");
        List<Transaction> history1 = service.getTransactionHistory("ACC1001");
        for (Transaction t : history1) {
            System.out.println(
                    t.getType() + " | " +
                    t.getAmount() + " | " +
                    "From: " + t.getFromAccount() + " | " +
                    "To: " + t.getToAccount() + " | " +
                    "Time: " + t.getTimestamp()
            );
        }

        // ----- TEST: HISTORY FOR ACC2002 -----
        System.out.println("\n---- Transaction History for ACC2002 ----");
        List<Transaction> history2 = service.getTransactionHistory("ACC2002");
        for (Transaction t : history2) {
            System.out.println(
                    t.getType() + " | " +
                    t.getAmount() + " | " +
                    "From: " + t.getFromAccount() + " | " +
                    "To: " + t.getToAccount() + " | " +
                    "Time: " + t.getTimestamp()
            );
        }
    }
}
