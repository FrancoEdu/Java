package fixationExercise.entities;

public class PhysicalPerson extends Contributor{
    private Double healthlySpending;

    public PhysicalPerson(){super();}
    public PhysicalPerson(String name, Double anualIncome, Double healthlySpending){
        super(name,anualIncome);
        this.healthlySpending = healthlySpending;
    }

    public Double getHealthlySpending() {
        return healthlySpending;
    }

    public void setHealthlySpending(Double healthlySpending) {
        this.healthlySpending = healthlySpending;
    }

    @Override
    public Double tax(){
        if (anualIncome < 20000)
            return (anualIncome * 0.15) - (healthlySpending * 0.5);
        else
            return (anualIncome * 0.25) - (healthlySpending * 0.5);
    }
}
