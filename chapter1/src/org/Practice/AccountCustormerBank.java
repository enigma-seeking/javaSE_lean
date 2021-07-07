package org.Practice;

/**
 * @author Yuxuan
 * @create 2021-06-25 21:58
 */
public class AccountCustormerBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane","Smith");
        bank.getCustormers(bank.getNums()-1).setAccount(new Account(1000,2000,0.00123));
        bank.addCustomer("一点雨","江南");
        bank.getCustormers(bank.getNums()-1).setAccount(new Account(1001,2300,0.00123));
    }
}

class Bank{
    private Customer[] customers;
    private int nums;

    public Bank() {
        //如果是空参构造器，那么运行时会报错，因为数组还没建立呢
        customers = new Customer[10];
    }

    public Customer getCustormers(int index) {
        return customers[index];
    }

    public int getNums() {
        System.out.println(nums);
        return nums;
    }

    public void addCustomer(String firstname,String lastname){
        customers[nums++] = new Customer(firstname, lastname);
    }
}
