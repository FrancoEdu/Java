package fixationExercise.model.entities;

import fixationExercise.model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){}
    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder= holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance(){
        return this.balance;
    }
    public Double getWithdrawLimit(){
        return this.withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance = this.balance + amount;
    }
    public void withdraw(Double amount){
        if (amount > withdrawLimit && amount > balance)
            throw new DomainException("The amount exceeds withdraw limit and not enough balance");
        else if (amount > withdrawLimit)
            throw new DomainException("The amount exceeds withdraw limit");
        else if (amount > balance)
            throw new DomainException("Not enough balance");
        else
            this.balance = this.balance - amount;
    }
}
