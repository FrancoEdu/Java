package FirstExercise.application;

import FirstExercise.entities.Employee;
import FirstExercise.entities.OutSourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int quantity = scanner.nextInt();

        for (int x = 1; x <= quantity; x++){
            System.out.println("Employee #" + x + " data: ");
            System.out.println("Outsourced (y/n) ?");
            char option = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Hours ");
            Integer hours = scanner.nextInt();
            System.out.println("Value Per Hour: ");
            Double valuePerHour = scanner.nextDouble();

            if (option == 'y'){
                System.out.println("Additional charge: ");
                Double additionalCharge = scanner.nextDouble();
                employees.add(new OutSourceEmployee(name,hours,valuePerHour,additionalCharge));
            }
            else{
                employees.add(new Employee(name,hours,valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");

        for (Employee emp : employees){
            System.out.println(emp.getName() + " -> " + String.format("%.2f",emp.payment()));
        }

        scanner.close();
    }
}
