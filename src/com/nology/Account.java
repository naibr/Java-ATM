package com.nology;

public class Account {

    private String name;
    private int pin;
    private double balance;

    public Account(String name, int password, double balance) {
        this.name = name;
        this.pin = password;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public double deposit(double amount) {
        balance +=amount;
        return balance;
    }

    public double withdraw(double amount) {
        if(amount>balance) {
            throw new IllegalArgumentException("The amount is greater balance and you do not have enough money");
        }
        balance -=amount;
        return balance;
    }



}
