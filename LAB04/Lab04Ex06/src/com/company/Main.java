package com.company;

public class Main {

    public static void main(String[] args) {

        SavingAccount acc1 = new SavingAccount(5000, 0.01);
        SavingAccount acc2 = new SavingAccount(10000, 0.02);

        acc1.deposit(1000);
        acc1.transfer(1000, acc2);

        acc1.withdraw(500);
        acc2.withdraw(500);

        acc1.deposit(acc1.calculateInterest());
        acc2.deposit(acc2.calculateInterest());

        System.out.println(acc1);
        System.out.println(acc2);

    }
}

class BankAccount {
    double balance = 0;

    public BankAccount() {

    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount>0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount>0) {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(double amount, BankAccount other) {
        withdraw(amount);
        other.deposit(amount);
    }
}

class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public String toString() {
        return "SavingsAccount [interestRate=" + interestRate + ", balance: " + balance + "]";
    }
}
