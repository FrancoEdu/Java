package fixationExercise.entities;

public abstract class Contributor {
    protected String name;
    protected Double anualIncome;

    public Contributor(){}
    public Contributor(String name, Double anualIncome){
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
    public Double getAnualIncome(){
        return this.anualIncome;
    }

    public abstract Double tax();
}
