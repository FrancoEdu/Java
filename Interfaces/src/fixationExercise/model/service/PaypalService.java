package fixationExercise.model.service;

public class PaypalService implements OnlinePaymenteService{
    private static final double FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    public double paymentFee(Double amount) {
        return amount * FEE_PERCENTAGE;
    }
    public double interest(Double amount, Integer months) {
        return amount * months * MONTHLY_INTEREST;
    }
}
