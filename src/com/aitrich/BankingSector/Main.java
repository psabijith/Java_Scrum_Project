package com.aitrich.BankingSector;

<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.Scanner;
>>>>>>> 9fc7499426b1f7c7427813fe9665d8f32687e91b

public class Main {

    public static void main(String[] args) {

<<<<<<< HEAD
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
=======
        AccountManagment bank = new AccountManagment();
        Scanner sc = new Scanner(System.in);  

        int choice = -1;

        do {
            System.out.println("\nChoose an option:");
            System.out.println("-----------------");
            System.out.println("1.Open a new account");
            System.out.println("2.Get a account");
            System.out.println("3.Get balance");
            System.out.println("4.Close account");
            System.out.println("5.Exit");

            
            String choiceStr = sc.nextLine().trim();
                choice = Integer.parseInt(choiceStr);

            switch (choice) {

                case 1: {
                    System.out.print("Enter Account Type (SAVINGS/CURRENT): ");
                    String typeInput = sc.nextLine().trim().toUpperCase();

                    AccountType type = AccountType.valueOf(typeInput);

                    System.out.print("Enter Initial Balance: ");
                    double balance = Double.parseDouble(sc.nextLine().trim());

                    bank.openAccount(type, balance);
                    break;
                }

                case 2: {
                    System.out.print("Enter Account Number: ");
                    String accNum = sc.nextLine().trim();  

                    Accounts acc = bank.getAccount(accNum);
                    if (acc != null) {
                        System.out.println("Account Number: " + acc.getAccountNumber());
                        System.out.println("Account Type  : " + acc.getAccountType());
                        System.out.println("Balance       : " + acc.getBalance());
                    }
                    break;
                }

                case 3: {
                    System.out.print("Enter Account Number: ");
                    String accNum = sc.nextLine().trim();

                    double bal = bank.getBalance(accNum);
                    System.out.println("Balance: " + bal);
                    break;
                }

                case 4: {
                    System.out.print("Enter Account Number: ");
                    String accNum = sc.nextLine().trim();

                    bank.closeAccount(accNum);
                    break;
                }

                case 5:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
=======
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        CustomerService service = new CustomerService();

        Customer req = new Customer(
                "Akshay", "A01", "akshay@gmail.com", "1234567890", "Thrissur"
        );

        Customer c = service.createCustomerWithAccount(req, AccountType.SAVINGS, new BigDecimal("10000"));
        System.out.println(c);
>>>>>>> afad0b852aeb26b18562dc1b18d9f4471487cf90
>>>>>>> 9fc7499426b1f7c7427813fe9665d8f32687e91b
    }
}
