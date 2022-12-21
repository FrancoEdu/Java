package HeranceAndPolimorfismExercises.entities;

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
    @Override
    public void withdraw(Double amount){
        super.withdraw(amount);         //realiza o metodo normalmente presente na superclasse e posteriomente retira a taxa de 2.
        balance = balance - 2.0;
    }
}
