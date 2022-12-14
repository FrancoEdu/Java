package HeranceAndPolimorfismExercises.entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate){
        super(number,holder,balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate(){
        return this.interestRate;
    }

    public void setInterestRate(Double interestRate){
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance = balance + (balance * (interestRate/100));
    }

    @Override
    public void withdraw(Double amount){
        balance = balance - amount;
    }
}
