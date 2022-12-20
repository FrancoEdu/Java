package entities;

public class BusinessAccount extends Account{
    private Double loanlimit;

    public BusinessAccount(){
        super();
    }
    public BusinessAccount(Integer number, String holder, Double balance, Double loanlimit){
        super(number,holder,balance);
        this.loanlimit = loanlimit;
    }

    public void setLoanlimit(Double loanlimit){
        this.loanlimit = loanlimit;
    }

    public Double getLoanlimit(){
        return this.loanlimit;
    }

    public void loan(Double amount){
        if (amount <= loanlimit){
            balance = balance + amount - 10;
        }
    }

}
