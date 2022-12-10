package firstExercise;

public class Triangule {
    public double a,b,c;
    public double trianguleArea(){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
