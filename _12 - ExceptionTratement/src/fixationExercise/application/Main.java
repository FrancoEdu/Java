package fixationExercise.application;

import fixationExercise.model.entities.Account;
import fixationExercise.model.exceptions.DomainException;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the account data:");
            System.out.println("Number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Holder: ");
            String holder = scanner.nextLine();
            System.out.println("Initial Balance: ");
            double balance = scanner.nextDouble();
            System.out.println("Withdraw limit: ");
            double withdrawLimit = scanner.nextDouble();
            Account account = new Account(number,holder,balance,withdrawLimit);

            System.out.println("");
            System.out.println("Enter amount for withdraw: ");
            double withdraw = scanner.nextDouble();
            account.withdraw(withdraw);
            System.out.printf("New balance : %.2f",account.getBalance());
        }catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
