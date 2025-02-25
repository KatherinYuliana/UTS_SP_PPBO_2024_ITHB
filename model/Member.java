package model;

import model.Enum.CustomerType;

public class Member extends Customer {
    private double balance;
    private CustomerType type;

    public Member(int idCustomer, String name, String email, String company, double balance, CustomerType type) {
        super(idCustomer, name, email, company);
        this.balance = balance;
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

}
