import Entitites.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered ?");
        int numberOfEmployees = sc.nextInt();

        for(int x = 1; x <= numberOfEmployees; x++){
            System.out.println("Employee # " + x + ":");
            System.out.println("Id: ");
            int Id = sc.nextInt();
            while(hasID(list, Id)){
                System.out.print("Id already taken. Try again: ");
                Id = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee(Id,name,salary));
        }

        System.out.print("Enter the employee ID that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id doens't exist !!");
        }
        else{
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }


        System.out.println("List of employeess");
        for (Employee obj : list){
            System.out.println(obj);
        }
        sc.close();
    }

    private static boolean hasID (List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}