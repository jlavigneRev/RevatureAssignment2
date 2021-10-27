package com.jameslavigne;

/**
 * @author James Lavigne
 * Revature Assignment 2 : Q5
 */
abstract public class Bank {
    protected int balance = 0;

    public void deposit(int amount){
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit a positive amount.");
        }
    }

    abstract public int getBalance();
}

class BankA extends Bank{

    @Override
    public int getBalance() {
        return balance;
    }
}

class BankB extends Bank{

    @Override
    public int getBalance() {
        return balance;
    }
}

class BankC extends Bank{

    @Override
    public int getBalance() {
        return balance;
    }
}

class Depositor{
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.deposit(100);
        bankB.deposit(150);
        bankC.deposit(200);

        System.out.println("Bank A balance: $" + bankA.getBalance());
        System.out.println("Bank B balance: $" + bankB.getBalance());
        System.out.println("Bank C balance: $" + bankC.getBalance());
    }
}
