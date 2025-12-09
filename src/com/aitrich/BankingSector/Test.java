package com.aitrich.BankingSector;

import java.util.Scanner;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        AccountManagment bank = new AccountManagment();
        CustomerService customer = new CustomerService();
        TransactionService transaction = new TransactionService(bank); // HAS-A relation
        Authentication auth = new Authentication();
        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANK SYSTEM =====");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.print("Choose (1 or 2): ");
        int firstChoice = sc.nextInt();
        sc.nextLine();

        String username = null;

        if (firstChoice == 1) {
            System.out.println("=== REGISTER NEW USER ===");
            System.out.print("Choose a username: ");
            String newUser = sc.nextLine();
            System.out.print("Choose a password: ");
            String newPass = sc.nextLine();

            boolean regOk = auth.register(newUser, newPass);
            if (!regOk) {
                System.out.println("Registration failed.");
                sc.close();
                return;
            }

            System.out.println("Registration successful. Please login now.");
            username = newUser;

            System.out.print("Password for " + username + ": ");
            String pw = sc.nextLine();

            if (!auth.login(username, pw)) {
                System.out.println("Login failed.");
                sc.close();
                return;
            }

        } else if (firstChoice == 2) {

            System.out.println("=== LOGIN ===");
            System.out.print("Username: ");
            username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();

            if (!auth.login(username, password)) {
                System.out.println("Invalid credentials.");
                sc.close();
                return;
            }

        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.println("Login successful. Welcome, " + username + "!");

        int choice;

        do {
            System.out.println("\n==== BANK MENU ====");
            System.out.println("1. Create Customer");
            System.out.println("2. Open Account");
            System.out.println("3. View Customer");
            System.out.println("4. View Account");
            System.out.println("5. Check Balance");
            System.out.println("6. Deposit");
            System.out.println("7. Withdraw");
            System.out.println("8. Transfer");
            System.out.println("9. View Transactions");
            System.out.println("10. Close Account");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter email: ");
                        String email = sc.nextLine();
                        System.out.print("Enter phone: ");
                        String phone = sc.nextLine();
                        System.out.print("Enter address: ");
                        String address = sc.nextLine();

                        Customer c = customer.createCustomer(name, email, phone, address, null);
                        System.out.println("Customer created: " + c);
                        break;

                    case 2:
                        System.out.print("Enter customer ID: ");
                        String custId = sc.nextLine();

                        Customer custForAcc = customer.getCustomer(custId);
                        if (custForAcc == null) {
                            System.out.println("No such customer.");
                            break;
                        }

                        System.out.print("Enter account type (SAVINGS/CURRENT): ");
                        String typeStr = sc.nextLine().toUpperCase();

                        AccountType type;
                        try {
                            type = AccountType.valueOf(typeStr);
                        } catch (Exception e) {
                            System.out.println("Invalid account type.");
                            break;
                        }

                        System.out.print("Enter initial balance: ");
                        double initBal = sc.nextDouble();
                        sc.nextLine();

                        Accounts acc = bank.openAccount(type, initBal);
                        custForAcc.setAccount(acc);

                        System.out.println("Account created & linked to customer.");
                        break;

                    case 3:
                        System.out.print("Enter customer ID: ");
                        String cid = sc.nextLine();
                        Customer cust = customer.getCustomer(cid);

                        if (cust != null)
                            System.out.println("Customer: " + cust);
                        else
                            System.out.println("Customer not found.");
                        break;

                    case 4:
                        System.out.print("Enter account number: ");
                        String accView = sc.nextLine();
                        Accounts a = bank.getAccount(accView);

                        if (a != null)
                            System.out.println("Account: " + a);
                        else
                            System.out.println("Account not found.");
                        break;

                    case 5:
                        System.out.print("Enter account number: ");
                        String accBal = sc.nextLine();
                        double bal = bank.getBalance(accBal);
                        System.out.println("Balance: " + bal);
                        break;

                    case 6:
                        System.out.print("Enter account number: ");
                        String accDep = sc.nextLine();
                        System.out.print("Enter amount to deposit: ");
                        double depAmt = sc.nextDouble();
                        sc.nextLine();

                        transaction.deposit(accDep, depAmt);
                        System.out.println("Deposit successful.");
                        break;

                    case 7:
                        System.out.print("Enter account number: ");
                        String accW = sc.nextLine();
                        System.out.print("Enter amount to withdraw: ");
                        double wAmt = sc.nextDouble();
                        sc.nextLine();

                        transaction.withdraw(accW, wAmt);
                        System.out.println("Withdrawal successful.");
                        break;

                    case 8:
                        System.out.print("Enter FROM account: ");
                        String fromAcc = sc.nextLine();
                        System.out.print("Enter TO account: ");
                        String toAcc = sc.nextLine();
                        System.out.print("Enter amount: ");
                        double tAmt = sc.nextDouble();
                        sc.nextLine();

                        transaction.transfer(fromAcc, toAcc, tAmt);
                        System.out.println("Transfer successful.");
                        break;

                    case 9:
                        System.out.print("Enter account number: ");
                        String accHist = sc.nextLine();

                        List<Transaction> txns = transaction.getTransactionHistory(accHist);

                        if (txns.isEmpty()) {
                            System.out.println("No transactions found.");
                        } else {
                            System.out.println("Transactions:");
                            for (Transaction t : txns) {
                                System.out.println("  " + t);
                            }
                        }
                        break;

                    case 10:
                        System.out.print("Enter Account Number: ");
                        String accNum = sc.nextLine();
                        bank.closeAccount(accNum);
                        break;

                    case 11:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 11);

        sc.close();
    }
}
