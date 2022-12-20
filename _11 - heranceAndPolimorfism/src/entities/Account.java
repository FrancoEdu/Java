package entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account(){

    }
    public Account (Integer number, String holder, Double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }
    public String getHolder(){
        return this.holder;
    }
    public Double getBalance(){
        return this.balance;
    }
    public Integer getNumber() {
        return this.number;
    }
    public void setNumber(Integer number){
        this.number = number;
    }

    public void withdraw(Double amount){
            balance = balance - amount - 5;
    }

    public void deposit(Double amount){
        balance = balance + amount;
    }
}
