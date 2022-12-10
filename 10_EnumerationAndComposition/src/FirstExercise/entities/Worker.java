package FirstExercise.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();
    public Worker(){}
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLevel(WorkerLevel level){
        this.level = level;
    }
    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Department getDepartment() {
        return department;
    }
    public String getName(){
        return name;
    }
    public WorkerLevel getLevel(){
        return level;
    }
    public Double getBaseSalary(){
        return baseSalary;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month){
                sum = sum + c.totalValue();
            }
        }
        return sum;
    }
}
