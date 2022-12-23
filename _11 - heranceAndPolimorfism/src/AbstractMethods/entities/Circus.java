package AbstractMethods.entities;

public class Circus extends Shape{
    private Double radius;

    public Circus(){super();}
    public Circus(Color color, Double radius){
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area(){
        return 3.14 * (radius * radius);
    }
}
