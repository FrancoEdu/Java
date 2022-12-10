package Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = sc.next();
        System.out.println("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee: " + emp.toString());

        System.out.println("Which percentage will be increased: ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);
        System.out.println("Update employee: " + emp.toString());

        sc.close();
    }
}
