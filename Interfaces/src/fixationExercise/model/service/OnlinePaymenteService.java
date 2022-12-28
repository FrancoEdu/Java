package fixationExercise.model.service;

public interface OnlinePaymenteService {
    double paymentFee(Double amount);
    double interest(Double amount, Integer months);
}
