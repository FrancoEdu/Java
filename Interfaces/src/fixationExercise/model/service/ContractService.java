package fixationExercise.model.service;

import fixationExercise.model.entities.Contract;
import fixationExercise.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymenteService onlinePaymenteService;

    public ContractService(OnlinePaymenteService onlinePaymenteService){
        this.onlinePaymenteService = onlinePaymenteService;
    }

    public void processContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i); //vencimento
            double interest = onlinePaymenteService.interest(basicQuota, i); //juros
            double fee = onlinePaymenteService.paymentFee(basicQuota + interest);//taxa
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
