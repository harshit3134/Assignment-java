/*
21CE001_Harshit Ajakiya
Design a class named Account that contains:
        • A private int data field named id for the account (default 0).
        • A private double data field named balance for the account (default 500₹).
        • A private double data field named annualInterestRate that stores the current
        interest rate (default 7%). Assume all accounts have the same interest rate.
        • A private Date data field named dateCreated that stores the date when the
        account was created.
        • A no-arg constructor that creates a default account.
        • A constructor that creates an account with the specified id and initial balance.
        • The accessor and mutator methods for id, balance, and annualInterestRate.
        • The accessor method for dateCreated.
        • A method named getMonthlyInterestRate() that returns the monthly interest rate.
        • A method named getMonthlyInterest() that returns the monthly interest.
        • A method named withdraw that withdraws a specified amount from the account.
        • A method named deposit that deposits a specified amount to the account*/

import java.util.*;

class Account {
    private int id = 0;
    private double balance = 500;
    private double annualInterestRate = 0.07;
    private Date date;

    Account() {

    }

    Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void accessor() {
        Scanner s = new Scanner(System.in);
        System.out.println("ID:");
        id = s.nextInt();
        System.out.println("Balance:");
        balance = s.nextDouble();
        System.out.println("Annual Interest Rate:");
        annualInterestRate = s.nextDouble();
    }

    public void mutator() {
        System.out.println("ID:" + id);
        System.out.println("Balance" + balance);
        System.out.println("AnnualInterestRate:" + annualInterestRate);
    }

    public void getdate() {
        Date newdate = new Date();
        System.out.println("Date And Time :" + newdate);
    }

    public double getmonthlyinterestrate() {
        return (balance * annualInterestRate);
    }

    public void Whithdraw() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        balance -= i;
    }

    public void Deposit() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        balance += i;
    }

}

public class Prac2 {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println("Enter Details");
        a.accessor();
        System.out.println("Your Monthly Interest Rate is:" + a.getmonthlyinterestrate());
        System.out.println();
        System.out.println("Enter Amount to be withdrawn");
        a.Whithdraw();
        System.out.println("Enter Amount to be deposit");
        a.Deposit();
        System.out.println("Your Credentials Are :");
        a.mutator();
        a.getdate();
    }
}
