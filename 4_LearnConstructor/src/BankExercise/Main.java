package BankExercise;

import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        double money;
        System.out.println("Enter acoount number");
        int accountNumber = sc. nextInt();
        System.out.println("Enter account holder");
        String memberName = sc.next();
        System.out.println("Is there na initial deposit value: (y/n)");
        char response = sc.next().charAt(0);
        if (response == "y") {
            System.out.println("Enter initial deposit value: ");
            money = sc.nextDouble();
            bank = new Bank(accountNumber,memberName,money);
        } else {
            bank = new Bank(accountNumber,memberName);
        }

        System.out.println("Account data: \n" + bank.toString());

        System.out.println("Enter a deposit value: ");
        money = sc.nextDouble();
        bank.deposit(money);
        System.out.println("Updated account data: \n" + bank.toString());

        System.out.println("Enter a withdraw value: ");
        money = sc.nextDouble();
        bank.withdraw(money);
        System.out.println("Updated account data: \n" + bank.toString());

    }
}
