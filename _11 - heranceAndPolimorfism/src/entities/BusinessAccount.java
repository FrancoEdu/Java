package entities;

public class BusinessAccount extends Account{
    private Double loanlimit;
    public BusinessAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }
}
