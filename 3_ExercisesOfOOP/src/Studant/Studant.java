package Studant;

public class Studant {
    public double firstGrade, secondGrade, thirdGrade;

    public double media(){
        return firstGrade + secondGrade + thirdGrade;
    }

    public String toString(){
        if (media() > 60){
            return "Final grade: " + media() + "\nPASS!!!";
        }
        else{
            double missigPoints = 60 - media();
            return "You don't pass :´( \nMissing " + missigPoints + "points";
        }
    }
}
