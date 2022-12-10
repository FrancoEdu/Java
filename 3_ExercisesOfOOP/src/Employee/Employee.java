package Employee;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public String toString(){
        return name + ", $" + NetSalary();
    }
    public double NetSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        grossSalary = grossSalary + grossSalary * percentage/100;
    }
}
