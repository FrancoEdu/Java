package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;

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
}
