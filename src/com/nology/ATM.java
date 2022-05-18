package com.nology;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {

    public ATM() {

        Account Ebrima = new Account("Ebrima", 4254, 5000);
        Account Naib = new Account("Naib", 9856, 3000);
        Account Bill = new Account("Bill", 3652, 4000);
        Account Sarah = new Account("Sarah", 7135, 6650);

        List<Account> ListOfUsers = new ArrayList<>();
        ListOfUsers.add(Ebrima);
        ListOfUsers.add(Naib);
        ListOfUsers.add(Bill);
        ListOfUsers.add(Sarah);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter PIN code");
        int userPin = s.nextInt();

            for (Account user : ListOfUsers) {
                while (userPin == user.getPin()) {
                    boolean isAuthenticated = true;

                    do {
                        System.out.println("Welcome " + user.getName());
                        System.out.println("Check Balance - Enter 1" + "\nWithdraw Cash - Enter 2" + "\nDeposit Cash - Enter 3" + "\nExit - Enter 4");
                        int option = s.nextInt();

                        switch (option) {
                            case 1:
                                System.out.println(user.getBalance());
                                break;

                            case 2:
                                System.out.println("Enter withdraw amount");
                                double amountToWithdraw = s.nextInt();
                                user.withdraw(amountToWithdraw);
                                System.out.println("Remaining Balance is: " + user.getBalance());
                                break;

                            case 3:
                                System.out.println("Enter Deposit amount");
                                double amountToDeposit = s.nextInt();
                                user.deposit(amountToDeposit);
                                System.out.println("New Balance is " + user.getBalance());
                                break;

                            case 4:
                                isAuthenticated = false;
                                System.out.println("Goodbye");
                        }
                    } while (isAuthenticated);
                    break;
                }
            }
    }
}
