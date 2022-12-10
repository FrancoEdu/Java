package FirstExercise.entities;

public class worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    public worker(){

    }
    public worker(String name, WorkerLevel level, Double baseSalary){
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

    }

    public void removeContract(HourContract contract){

    }

    public Double income(Integer year, Integer month){
        return null;
    }
}
