package HeranceAndPolimorfismExercises.application;

import HeranceAndPolimorfismExercises.entities.Account;
import HeranceAndPolimorfismExercises.entities.BusinessAccount;
import HeranceAndPolimorfismExercises.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account account3 = new SavingsAccount(1004, "Anna", 0.0, 1.0);

        //DOWNCASTING
        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100.0);

        if(account3 instanceof BusinessAccount){
            BusinessAccount account5 = (BusinessAccount)account3;
            account5.loan(200.0);
            System.out.println("Loan!");
        }

        if(account3 instanceof SavingsAccount){
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance();
            System.out.println("Update!");
        }

        //Learning @Override
        Account account5 = new Account(1005, "Eduardo", 1000.0);
        account5.withdraw(200.0);
        System.out.println("Learning @Override");
        System.out.println(account5.getBalance());

        //@Override class SavingsAccount
        Account account6 = new SavingsAccount(1006, "Sandra", 1000.0, 1.0);
        account6.withdraw(200.0);
        System.out.println("@Override class SavingsAccount");
        System.out.println(account6.getBalance());

        //@Override class BusinessAccount
        Account account7 = new BusinessAccount(1007,"Carlos", 1000.0,200.0);
        account7.withdraw(200.00);
        System.out.println("@Override class BusinessAccount");
        System.out.println(account7.getBalance());

    }
}