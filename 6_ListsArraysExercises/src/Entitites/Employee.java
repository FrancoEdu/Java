package Entitites;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }
    private void setSalary(Double salary){
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    private void setName(String name){
        this.name = name;
    }

    public void increaseSalary(Double percentage){
        this.salary = this.salary + (this.salary * percentage/100);
    }

    public String toString(){
        return this.id + ", " + this.name + ", " + this. salary;
    }
}
