package org.Practice;

/**
 * @author Yuxuan
 * @create 2021-06-25 21:29
 */
public class AccountCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        customer.setAccount(new Account(1000,2000,0.0123));
    }
}

class Account{
    private int id;
    private double balance;
    private double annualIntersetRate;

    public Account(int id, double balance, double annualIntersetRate) {
        this.id = id;
        this.balance = balance;
        this.annualIntersetRate = annualIntersetRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualIntersetRate() {
        return annualIntersetRate;
    }

    public void setAnnualIntersetRate(double annualIntersetRate) {
        this.annualIntersetRate = annualIntersetRate;
    }

    public void withdraw(double amount){
        if (amount<=this.balance) {
            this.balance -= amount;
            System.out.println("成功取出"+amount);
        }
        else {
            System.out.println("余额不足");
        }
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("成功存入"+amount);
    }
}



class Customer {
    private String firstname;
    private String lastname;
    private Account account;
    //自定义类

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
