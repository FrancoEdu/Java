package fixationExercise.application;

import fixationExercise.entities.Contributor;
import fixationExercise.entities.LegalPerson;
import fixationExercise.entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Contributor> list = new ArrayList<>();

        System.out.print("Enter the name of tax payers: ");
        int quantity = scanner.nextInt();

        for(int x=1; x <= quantity; x++){
            System.out.println("Tax payer #" + x + " data");
            System.out.println("Physical Person ou Legal Person (p/l): ");
            char option = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Anual Income: ");
            double anualIncome = scanner.nextDouble();

            if (option == 'p'){
                System.out.println("Health expedintures: ");
                double healthExpendintures = scanner.nextDouble();
                list.add(new PhysicalPerson(name,anualIncome,healthExpendintures));
            }
            else{
                System.out.println("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                list.add(new LegalPerson(name,anualIncome,numberOfEmployees));
            }
        }

        System.out.println("");
        System.out.println("TAXES PAID: ");
        double soma = 0.0;

        for (Contributor cont:list){
            System.out.println(cont.getName() + ": $" + cont.tax());
            soma = soma + cont.tax();
        }

        System.out.printf("TOTAL TAXES: %.2f",soma);
    }
}
